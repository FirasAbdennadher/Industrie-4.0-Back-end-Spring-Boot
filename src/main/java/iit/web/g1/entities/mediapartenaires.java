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
@Table(name = "mediapartenaires")

public class mediapartenaires {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_med;
	private String nom;
	private String photo;
    
	@ManyToMany(mappedBy="mediapartenaires",cascade =CascadeType.REFRESH)
    private Collection<editions> editions;

	public mediapartenaires(String nom, String photo, Collection<iit.web.g1.entities.editions> editions) {
		super();
		this.nom = nom;
		this.photo = photo;
		this.editions = editions;
	}

	public mediapartenaires() {
		super();
	}

	public Long getId_med() {
		return id_med;
	}

	public void setId_med(Long id_med) {
		this.id_med = id_med;
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
