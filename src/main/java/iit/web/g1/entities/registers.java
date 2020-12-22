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
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

@Entity
@Table(name = "registers")

public class registers {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_reg;
private String nom;
private String prenom;
private String email;
private Long phone;
private String organisation;
private String poste;
private String certif;


/*	public registers(String nom, String prenom) {
	super();
	this.nom = nom;
	this.prenom = prenom;
}*/

	@ManyToMany(mappedBy="registers",cascade = {
	        CascadeType.PERSIST,
	        CascadeType.MERGE
	        })
    private Collection<editions> editions;

	public Long getId_reg() {
		return id_reg;
	}

	public void setId_reg(Long id_reg) {
		this.id_reg = id_reg;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getOrganisation() {
		return organisation;
	}

	public void setOrganisation(String organisation) {
		this.organisation = organisation;
	}

	public String getPoste() {
		return poste;
	}

	public void setPoste(String poste) {
		this.poste = poste;
	}

	public String getCertif() {
		return certif;
	}

	public void setCertif(String certif) {
		this.certif = certif;
	}
	@JsonIgnore
	public Collection<editions> getEditions() {
		return editions;
	}
@JsonSetter
	public void setEditions(Collection<editions> editions) {
		this.editions = editions;
	}

	public registers() {
		super();
	}

	public registers(Long id_reg, String nom, String prenom, String email, Long phone, String organisation,
			String poste, String certif, Collection<iit.web.g1.entities.editions> editions) {
		super();
		this.id_reg = id_reg;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.phone = phone;
		this.organisation = organisation;
		this.poste = poste;
		this.certif = certif;
		this.editions = editions;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "registers [id_reg=" + id_reg + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", phone="
				+ phone + ", organisation=" + organisation + ", poste=" + poste + ", certif=" + certif + ", editions="
				+ editions + "]";
	}

    
    
    
	
}
