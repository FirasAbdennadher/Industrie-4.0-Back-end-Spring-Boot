package iit.web.g1.entities;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonSetter;

@Entity
@Table(name = "sponsors")
public class sponsors {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_spon;
	private String nom;
	private String photo;
	@ManyToMany(mappedBy="sponsors",fetch=FetchType.EAGER,cascade=CascadeType.REMOVE)
	//@JsonManagedReference
    private Collection<editions> editions;
	public Long getId_spon() {
		return id_spon;
	}
	public void setId_spon(Long id_spon) {
		this.id_spon = id_spon;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	@JsonIgnore
	public Collection<editions> getEditions() {
		return editions;
	}
	@JsonSetter
	public void setEditions(Collection<editions> editions) {
		this.editions = editions;
	}
	public sponsors(String nom, String photo, Collection<iit.web.g1.entities.editions> editions) {
		super();
		this.nom = nom;
		this.photo = photo;
		this.editions = editions;
	}
	public sponsors() {
		super();
	}
    
    
    

    
    
	
}