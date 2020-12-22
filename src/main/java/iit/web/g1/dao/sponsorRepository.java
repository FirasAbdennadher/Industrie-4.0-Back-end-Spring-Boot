package iit.web.g1.dao;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import iit.web.g1.entities.sponsors;

public interface sponsorRepository extends CrudRepository<sponsors, Long> {


	@Query("select s from sponsors s  JOIN s.editions e where e.id_ed = :x ")
	public Collection<sponsors> chercher(@Param("x")Long mc) ;	
}
