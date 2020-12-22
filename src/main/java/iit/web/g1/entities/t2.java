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
@Entity
@Table(name = "t2")
public class t2 implements Serializable{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_t2;
    @ManyToOne()
    @JoinColumn(name="id_t1")
    private t1 t1 ;
    private String prenom;
	public Long getId_t2() {
		return id_t2;
	}
	public void setId_t2(Long id_t2) {
		this.id_t2 = id_t2;
	}
	public t1 getT1() {
		return t1;
	}
	public void setT1(t1 t1) {
		this.t1 = t1;
	}
	public t2(iit.web.g1.entities.t1 t1,String pre) {
		super();
		this.t1 = t1;
		this.prenom=pre;
	}
	public t2() {
		super();
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
    
    
    
}
