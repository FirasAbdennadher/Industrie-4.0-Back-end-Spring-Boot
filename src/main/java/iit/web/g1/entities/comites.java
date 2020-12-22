package iit.web.g1.entities;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
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
@Table(name = "comites")

public class comites {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_comm;
	private String categorie;
	
@ManyToMany(mappedBy="comites",cascade =CascadeType.ALL)
    private Collection<editions> editions;
    
public Long getId_comm() {
	return id_comm;
}
public void setId_comm(Long id_comm) {
	this.id_comm = id_comm;
}
public String getCategorie() {
	return categorie;
}
public void setCategorie(String categorie) {
	this.categorie = categorie;
}
@JsonIgnore
public Collection<editions> getEditions() {
	return editions;
}
@JsonSetter
public void setEditions(Collection<editions> editions) {
	this.editions = editions;
}
public comites() {
	super();
}
public comites(String categorie, Collection<iit.web.g1.entities.editions> editions) {
	super();
	this.categorie = categorie;
	this.editions = editions;
}


    
    
    
}
