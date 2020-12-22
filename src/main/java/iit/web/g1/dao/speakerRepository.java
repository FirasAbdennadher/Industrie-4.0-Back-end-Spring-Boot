package iit.web.g1.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import iit.web.g1.entities.speakers;

public interface speakerRepository extends JpaRepository<speakers,Long> {

	
	@Query("select s from speakers s  JOIN s.editions e where e.id_ed=:x")

	public List<speakers> chercher(@Param("x")Long mc) ;	
	//para mc represente le x=> mc va etre injecter parametre X


}
