r the specific language governing permissions and
 * limitations under the License.
 *
 */

#include <grpc/support/port_platform.h>

#include "src/core/lib/transport/timeout_encoding.h"

#include <stdio.h>
#include <string.h>

#include "src/core/lib/gpr/string.h"

static int64_t round_up(int64_t x, int64_t divisor) {
  return (x / divisor + (x % divisor != 0)) * divisor;
}

/* round an integer up to the next value with three significant figures */
static int64_t round_up_to_three_sig_figs(int64_t x) {
  if (x < 1000) return x;
  if (x < 10000) return round_up(x, 10);
  if (x < 100000) return round_up(x, 100);
  if (x < 1000000) return round_up(x, 1000);
  if (x < 10000000) return round_up(x, 10000);
  if (x < 100000000) return round_up(x, 100000);
  if (x < 1000000000) return round_up(x, 1000000);
  return round_up(x, 10000000);
}

/* encode our minimum viable timeout value */
static void enc_tiny(char* buffer) { memcpy(buffer, "1n", 3); }

static void enc_ext(char* buffer, int64_t value, char ext) {
  int n = int64_ttoa(value, buffer);
  buffer[n] = ext;
  buffer[n + 1] = 0;
}

static void enc_seconds(char* buffer, int64_t sec) {
  if (sec % 3600 == 0) {
    enc_ext(buffer, sec / 3600, 'H');
  } else if (sec % 60 == 0) {
    enc_ext(buffer, sec / 60, 'M');
  } else {
    enc_ext(buffer, sec, 'S');
  }
}

static void enc_millis(char* buffer, int64_t x) {
  x = round_up_to_three_sig_figs(x);
  if (x < GPR_MS_PER_SEC) {
    enc_ext(buffer, x, 'm');
  } else {
    if (x % GPR_MS_PER_SEC == 0) {
      enc_seconds(buffer, x / GPR_MS_PER_SEC);
    } else {
      enc_ext(buffer, x, 'm');
    }
  }
}

void grpc_http2_encode_timeout(grpc_millis timeout, char* buffer) {
  if (timeout <= 0) {
    enc_tiny(buffer);
  } else if (timeout < 1000 * GPR_MS_PER_SEC) {
    enc_millis(buffer, timeout);
  } else {
    enc_seconds(buffer,
                timeout / 