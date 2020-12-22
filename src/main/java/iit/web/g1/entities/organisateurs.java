package iit.web.g1.entities;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

@Entity
@Table(name = "organisateurs")

public class organisateurs {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_org;
	private String nom;
	private String photo;
   
	@ManyToMany(mappedBy="organisateurs",cascade = {
	        CascadeType.PERSIST,
	        CascadeType.MERGE
	        })  
    private Collection<editions> editions;

	public organisateurs(String nom, String photo, Collection<iit.web.g1.entities.editions> editions) {
		super();
		this.nom = nom;
		this.photo = photo;
		this.editions = editions;
	}

	public organisateurs() {
		super();
	}

	public Long getId_org() {
		return id_org;
	}

	public void setId_org(Long id_org) {
		this.id_org = id_org;
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

    
	
	
	
}
