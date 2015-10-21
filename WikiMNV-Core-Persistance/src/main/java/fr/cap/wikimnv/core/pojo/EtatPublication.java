package fr.cap.wikimnv.core.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public enum EtatPublication {
	
	PUBLIE ("publie"), ARCHIVE ("arcive"), BROUILLON ("brouillon"), ENCOURSDEVALIDATION ("en cours");

	String libelle;
	
	EtatPublication(String libelle) {
		this.libelle=libelle;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
}
