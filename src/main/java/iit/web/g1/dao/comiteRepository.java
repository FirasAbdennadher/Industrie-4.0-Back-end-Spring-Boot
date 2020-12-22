package iit.web.g1.dao;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import iit.web.g1.entities.comites;
import iit.web.g1.entities.sponsors;

public interface comiteRepository extends JpaRepository<comites,Long>{

	
	//@Query("select s from sponsors s  JOIN s.editions e where e.id_ed=:x")

	@Query("select s from comites s  JOIN s.editions e where e.id_ed=:x")
public List<comites> chercher(@Param("x")Long mc) ;	

}
