package iit.web.g1.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import iit.web.g1.entities.organisateurs;
import iit.web.g1.entities.speakers;

public interface organisteurRepository extends JpaRepository<organisateurs, Long> {

	//@Query("select p from organisateurs p where p.editions.id_ed = :x")
	@Query("select s from organisateurs s  JOIN s.editions e where e.id_ed=:x")
	public List<organisateurs> chercher(@Param("x")Long mc) ;	
	//para mc represente le x=> mc va etre injecter parametre X

}
