ontext {
    pb_callback_t application_protocol;
    pb_callback_t record_protocol;
    bool has_security_level;
    grpc_gcp_SecurityLevel security_level;
    pb_callback_t peer_service_account;
    pb_callback_t local_service_account;
    bool has_peer_rpc_versions;
    grpc_gcp_RpcProtocolVersions peer_rpc_versions;
/* @@protoc_insertion_point(struct:grpc_gcp_AltsContext) */
} grpc_gcp_AltsContext;

/* Default values for struct fields */

/* Initializer values for message structs */
#define grpc_gcp_AltsContext_init_default        {{{NULL}, NULL}, {{NULL}, NULL}, false, (grpc_gcp_SecurityLevel)0, {{NULL}, NULL}, {{NULL}, NULL}, false, grpc_gcp_RpcProtocolVersions_init_default}
#define grpc_gcp_AltsContext_init_zero           {{{NULL}, NULL}, {{NULL}, NULL}, false, (grpc_gcp_SecurityLevel)0, {{NULL}, NULL}, {{NULL}, NULL}, false, grpc_gcp_RpcProtocolVersions_init_zero}

/* Field tags (for use in manual encoding/decoding) */
#define grpc_gcp_AltsContext_application_protocol_tag 1
#define grpc_gcp_AltsContext_record_protocol_tag 2
#define grpc_gcp_AltsContext_security_level_tag  3
#define grpc_gcp_AltsContext_peer_service_account_tag 4
#define grpc_gcp_AltsContext_local_service_account_tag 5
#define grpc_gcp_AltsContext_peer_rpc_versions_tag 6

/* Struct field encoding specification for nanopb */
extern const pb_field_t grpc_gcp_AltsContext_fields[7];

/* Maximum encoded size of messages (where known) */
/* grpc_gcp_AltsContext_size depends on runtime parameters */

/* Message IDs (where set with "msgid" option) */
#ifdef PB_MSGID

#define ALTSCONTEXT_MESSAGES \


#endif

#ifdef __cplusplus
} /* extern "C" */
#endif
/* @@protoc_insertion_point(eof) */

#endif
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               