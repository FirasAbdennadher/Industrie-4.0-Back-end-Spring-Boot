package iit.web.g1.entities;
import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name = "t1")
public class t1 implements Serializable{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_t1;
    @OneToMany(mappedBy="t1",fetch=FetchType.LAZY
    		)
    private Collection<t2> t2;
    private String nom;
	public Long getId_t1() {
		return id_t1;
	}
	public void setId_t1(Long id_t1) {
		this.id_t1 = id_t1;
	}
	@JsonIgnore
	public Collection<t2> getT2() {
		return t2;
	}
	public void setT2(Collection<t2> t2) {
		this.t2 = t2;
	}
	public t1() {
		super();
	}
	public t1(Collection<iit.web.g1.entities.t2> t2, String nom) {
		super();
		this.t2 = t2;
		this.nom = nom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
    

}
