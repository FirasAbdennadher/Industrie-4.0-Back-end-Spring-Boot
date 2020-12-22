package iit.web.g1.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import iit.web.g1.entities.mediapartenaires;

public interface mediapartenaireRepository extends JpaRepository<mediapartenaires, Long> {

	@Query("select s from mediapartenaires s  JOIN s.editions e where e.id_ed=:x")
	public List<mediapartenaires> chercher(@Param("x")Long mc) ;	
}
