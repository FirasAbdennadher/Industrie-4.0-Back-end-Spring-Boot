package iit.web.g1.dao;

import java.util.Collection;

import javax.persistence.NamedQuery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import iit.web.g1.entities.sponsors;
import iit.web.g1.entities.t2;

public interface t2Repos extends JpaRepository<t2, Long> {

	
	//@Query("select t from t1 t join t2 tt where t.id_t1=tt.id_t1 and tt.id_t2= :x ")
	@Query("select t from t2 t  JOIN t.t1 tt where tt.id_t1=:x")
	public Collection<t2> chercher(@Param("x")Long mc) ;	

}
