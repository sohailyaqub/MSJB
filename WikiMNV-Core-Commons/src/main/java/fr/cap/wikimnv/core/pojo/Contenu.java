package fr.cap.wikimnv.core.pojo;

import java.util.Calendar;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.mongojack.Id;
import org.mongojack.ObjectId;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public abstract class Contenu {
	@Id
	@ObjectId
	private String id;
	@XmlTransient
	public Profil author;
	@XmlTransient
	public EtatPublication etat;
	public Date dateCreation;
	public Date datePublication;
	public String version;
	
	
	public Contenu() {
		super();
	}

	public Contenu(Profil author) {
		super();
		this.author = author;
		this.dateCreation = Calendar.getInstance().getTime();
		this.etat = EtatPublication.BROUILLON;
		this.version = "0.1";
	}

	public void setEtat(EtatPublication etat) {
		this.etat = etat;
	}
	
	public EtatPublication getEtat() {
		return etat;
	}
	
	public void setAuthor(Profil author) {
		this.author = author;
	}
	public Profil getAuthor() {
		return author;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Date getDatePublication() {
		return datePublication;
	}

	public void setDatePublication(Date datePublication) {
		this.datePublication = datePublication;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}
