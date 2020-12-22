package iit.web.g1.entities;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

@Entity
@Table(name = "speakers")

public class speakers {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_speak;
	private String nom;
	private String prenom;
	private String poste;
	private String biblio;
	private String photo;

	@ManyToMany(mappedBy="speakers",fetch=FetchType.EAGER,cascade=CascadeType.REMOVE)
 
    private Collection<editions> editions;

	public speakers(String nom, String prenom, String poste, String biblio, String photo,
			Collection<iit.web.g1.entities.editions> editions) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.poste = poste;
		this.biblio = biblio;
		this.photo = photo;
		this.editions = editions;
	}

	public speakers() {
		super();
	}

	public Long getId_speak() {
		return id_speak;
	}

	public void setId_speak(Long id_speak) {
		this.id_speak = id_speak;
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

	public String getPoste() {
		return poste;
	}

	public void setPoste(String poste) {
		this.poste = poste;
	}

	public String getBiblio() {
		return biblio;
	}

	public void setBiblio(String biblio) {
		this.biblio = biblio;
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
