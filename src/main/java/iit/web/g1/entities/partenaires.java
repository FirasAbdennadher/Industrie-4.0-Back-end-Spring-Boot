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
import com.fasterxml.jackson.annotation.JsonSetter;

@Entity
@Table(name = "partenaires")

public class partenaires {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_part;
	private String nom;
	private String photo;

	@ManyToMany(mappedBy="partenaires",cascade =CascadeType.ALL)
	  
    private Collection<editions> editions;

	public partenaires() {
		super();
	}

	public partenaires(String nom, String photo, Collection<iit.web.g1.entities.editions> editions) {
		super();
		this.nom = nom;
		this.photo = photo;
		this.editions = editions;
	}

	public Long getId_part() {
		return id_part;
	}

	public void setId_part(Long id_part) {
		this.id_part = id_part;
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
