package iit.web.g1.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import iit.web.g1.entities.partenaires;
import iit.web.g1.entities.sponsors;

public interface partenaireRepository extends JpaRepository<partenaires, Long>{

	@Query("select s from partenaires s  JOIN s.editions e where e.id_ed=:x")
	public List<partenaires> chercher(@Param("x")Long mc) ;	

}
