package fr.cap.wikimnv.core.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.mongojack.Id;
import org.mongojack.ObjectId;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Article extends Contenu {     
	@XmlTransient
	public Template template;
	
	public List<Meta> metas;
	
	public List<Commentaire> commentaires;
	
	public Article() {}	
	public Article(Profil author,Template template) {
		super(author);
		this.template = template;
		metas = new ArrayList<Meta>();
	}
	public void ajouterAttributDuContenu(String metaAttribut, String valeurAttribut) {
		metas.add(new Meta(metaAttribut, valeurAttribut));
	}
}
