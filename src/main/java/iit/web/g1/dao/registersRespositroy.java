package iit.web.g1.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import iit.web.g1.entities.personnes;
import iit.web.g1.entities.registers;

public interface registersRespositroy extends JpaRepository<registers, Long> {

	
	/*@Modifying
	@Query(value="insert into editions_registers (id_ed,id_reg) values(:x,:x2)", nativeQuery = true)
    @Transactional
	public List<registers> saveEdition(@Param("x")Long mc,
			@Param("x2")Long mc2);

	@Query("select s from registers s  JOIN s.editions e where e.id_ed=:x")
	public List<registers> chercher(@Param("x")Long mc) ;	
    */
/*	@Query("select s from editions_registers s")
	public List<registers> chercherAll() ;	
    */
	
	
}
