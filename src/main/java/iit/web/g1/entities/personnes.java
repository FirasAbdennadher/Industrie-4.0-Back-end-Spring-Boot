package iit.web.g1.entities;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
@Entity
@Table(name = "personnes")

public class personnes {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_pers;
	private String nom;
	private String prenom;
	private String photo;

	@ManyToMany(fetch=FetchType.EAGER,cascade=CascadeType.REMOVE)
	
	@JoinTable(name="edition_comite_personne",joinColumns=
	@JoinColumn(name="id_pers"),
	inverseJoinColumns=@JoinColumn(name="id_comm"))
	private Collection<comites> comites;

	public Long getId_pers() {
		return id_pers;
	}

	public void setId_pers(Long id_pers) {
		this.id_pers = id_pers;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
	@JsonIgnore
	public Collection<comites> getComites() {
		return comites;
	}
	@JsonSetter
	public void setComites(Collection<comites> comites) {
		this.comites = comites;
	}

	public personnes(String nom, String prenom, String photo, Collection<iit.web.g1.entities.comites> comites) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.photo = photo;
		this.comites = comites;
	}

	public personnes() {
		super();
	}


	
	
	
}
