package fr.cap.wikimnv.core.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Meta {

	public String cle;
	public String valeur;
	
	
	public Meta() {
		this("","");
	}
	
	public Meta(String cle, String valeur) {
		super();
		this.cle = cle;
		this.valeur = valeur;
	}

	public String getCle() {
		return cle;
	}
	
	public void setCle(String cle) {
		this.cle = cle;
	}
	
	public String getValeur() {
		return valeur;
	}
	
	public void setValeur(String valeur) {
		this.valeur = valeur;
	}

}
