package iit.web.g1.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

@Entity
@Table(name = "editions")

public class editions {
@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id_ed;
private String nom;
private String  description;
private String lieu;
private  Date date;
private int nbparticpate;

@ManyToMany(cascade = {
        CascadeType.PERSIST,
        CascadeType.MERGE
        })
@JoinTable(name="edition_comite",joinColumns=
@JoinColumn(name="id_ed"),
inverseJoinColumns=@JoinColumn(name="id_comm"))
private Collection<comites> comites;


@ManyToMany(cascade = {
        CascadeType.PERSIST,
        CascadeType.MERGE
        })
@JoinTable(name="editions_sponsors",joinColumns=
@JoinColumn(name="id_ed"),
inverseJoinColumns=@JoinColumn(name="id_spon"))
//@JsonBackReference
private Collection<sponsors> sponsors;

@ManyToMany(cascade = {
        CascadeType.PERSIST,
        CascadeType.MERGE
        })
@JoinTable(name="editions_speakers",joinColumns=
@JoinColumn(name="id_ed"),
inverseJoinColumns=@JoinColumn(name="id_speak"))
private Collection<speakers> speakers;


@ManyToMany(cascade = {
        CascadeType.PERSIST,
        CascadeType.MERGE
        })
@JoinTable(name="editions_partenaires",joinColumns=
@JoinColumn(name="id_ed"),
inverseJoinColumns=@JoinColumn(name="id_part"))
private Collection<partenaires> partenaires;


@ManyToMany(cascade = {
        CascadeType.PERSIST,
        CascadeType.MERGE
        })
@JoinTable(name="editions_organisateurs",joinColumns=
@JoinColumn(name="id_ed"),
inverseJoinColumns=@JoinColumn(name="id_org"))
private Collection<organisateurs> organisateurs;


@ManyToMany(cascade = {
        CascadeType.PERSIST,
        CascadeType.MERGE
        })
@JoinTable(name="editions_mediapartenaires",joinColumns=
@JoinColumn(name="id_ed"),
inverseJoinColumns=@JoinColumn(name="id_med"))
private Collection<mediapartenaires> mediapartenaires;


@ManyToMany(cascade = {
        CascadeType.PERSIST,
        CascadeType.MERGE
        })
private Collection<editions> personnes;



@ManyToMany(cascade = {
        CascadeType.PERSIST,
        CascadeType.MERGE
        })
@JoinTable(name="editions_registers",joinColumns=
@JoinColumn(name="id_ed"),
inverseJoinColumns=@JoinColumn(name="id_reg"))
private Collection<registers> registers;



public Long getId_ed() {
	return id_ed;
}


public void setId_ed(Long id_ed) {
	this.id_ed = id_ed;
}


public String getNom() {
	return nom;
}


public void setNom(String nom) {
	this.nom = nom;
}


public String getDescription() {
	return description;
}


public void setDescription(String description) {
	this.description = description;
}


public String getLieu() {
	return lieu;
}


public void setLieu(String lieu) {
	this.lieu = lieu;
}


public Date getDate() {
	return date;
}


public void setDate(Date date) {
	this.date = date;
}


public int getNbparticpate() {
	return nbparticpate;
}


public void setNbparticpate(int nbparticpate) {
	this.nbparticpate = nbparticpate;
}

@JsonIgnore
public Collection<comites> getComites() {
	return comites;
}


public void setComites(Collection<comites> comites) {
	this.comites = comites;
}

@JsonIgnore
public Collection<sponsors> getSponsors() {
	return sponsors;
}


public void setSponsors(Collection<sponsors> sponsors) {
	this.sponsors = sponsors;
}

@JsonIgnore
public Collection<speakers> getSpeakers() {
	return speakers;
}


public void setSpeakers(Collection<speakers> speakers) {
	this.speakers = speakers;
}

@JsonIgnore
public Collection<partenaires> getPartenaires() {
	return partenaires;
}

@JsonSetter
public void setPartenaires(Collection<partenaires> partenaires) {
	this.partenaires = partenaires;
}

@JsonIgnore
public Collection<organisateurs> getOrganisateurs() {
	return organisateurs;
}

@JsonSetter
public void setOrganisateurs(Collection<organisateurs> organisateurs) {
	this.organisateurs = organisateurs;
}

@JsonIgnore
public Collection<mediapartenaires> getMediapartenaires() {
	return mediapartenaires;
}

@JsonSetter
public void setMediapartenaires(Collection<mediapartenaires> mediapartenaires) {
	this.mediapartenaires = mediapartenaires;
}

@JsonIgnore
public Collection<editions> getPersonnes() {
	return personnes;
}

@JsonSetter
public void setPersonnes(Collection<editions> personnes) {
	this.personnes = personnes;
}

public editions() {
	super();
}

@JsonIgnore
public Collection<registers> getRegisters() {
	return registers;
}

@JsonSetter
public void setRegisters(Collection<registers> registers) {
	this.registers = registers;
}


public editions(String nom, String description, String lieu, Date date, int nbparticpate,
		Collection<iit.web.g1.entities.comites> comites, Collection<iit.web.g1.entities.sponsors> sponsors,
		Collection<iit.web.g1.entities.speakers> speakers, Collection<iit.web.g1.entities.partenaires> partenaires,
		Collection<iit.web.g1.entities.organisateurs> organisateurs,
		Collection<iit.web.g1.entities.mediapartenaires> mediapartenaires, Collection<editions> personnes,
		Collection<iit.web.g1.entities.registers> registers) {
	super();
	this.nom = nom;
	this.description = description;
	this.lieu = lieu;
	this.date = date;
	this.nbparticpate = nbparticpate;
	this.comites = comites;
	this.sponsors = sponsors;
	this.speakers = speakers;
	this.partenaires = partenaires;
	this.organisateurs = organisateurs;
	this.mediapartenaires = mediapartenaires;
	this.personnes = personnes;
	this.registers = registers;
}


@Override
public String toString() {
	return "editions [id_ed=" + id_ed + ", nom=" + nom + ", description=" + description + ", lieu=" + lieu + ", date="
			+ date + ", nbparticpate=" + nbparticpate + ", comites=" + comites + ", sponsors=" + sponsors
			+ ", speakers=" + speakers + ", partenaires=" + partenaires + ", organisateurs=" + organisateurs
			+ ", mediapartenaires=" + mediapartenaires + ", personnes=" + personnes + ", registers=" + registers + "]";
}


public editions(String nom, String description, String lieu, Date date, int nbparticpate,
		Collection<iit.web.g1.entities.registers> registers) {
	super();
	this.nom = nom;
	this.description = description;
	this.lieu = lieu;
	this.date = date;
	this.nbparticpate = nbparticpate;
	this.registers = registers;
}

public editions(Long id,Collection<iit.web.g1.entities.registers> registers) {
	super();
	this.id_ed=id;
	this.registers = registers;
}


/*public editions(String nom, String description, Collection<iit.web.g1.entities.registers> registers) {
	super();
	this.nom = nom;
	this.description = description;
	this.registers = registers;
}
*/







}
