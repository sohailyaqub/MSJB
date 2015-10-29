package fr.cap.wikimnv.core.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Commentaire extends Contenu {   
	
	@XmlTransient
	private Template template;
	private List<Meta> metas;
	
	public Commentaire() {}
	
	public Commentaire(Profil author,Template template) {
		super(author);
		this.template=template;
		metas=new ArrayList<Meta>();
	}
	
	public void ajouterAttributDuContenu(String metaAttribut, String valeurAttribut) {
		metas.add(new Meta(metaAttribut, valeurAttribut));
	}
	
}
