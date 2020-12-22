package iit.web.g1.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import iit.web.g1.entities.personnes;

public interface personneRepository extends JpaRepository<personnes,Long>{
	@Query("select s from personnes s  JOIN s.comites c JOIN c.editions e where c.id_comm=:x and e.id_ed=:x2")
	public List<personnes> chercher(@Param("x")Long mc,
			@Param("x2")Long mc2);	
	//para mc represente le x=> mc va etre injecter parametre X

}
