package fr.cap.wikimnv.core.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.mongojack.Id;
import org.mongojack.ObjectId;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Template {

	@Id
	@ObjectId
	private String nom;
	private List<String> meta;

	public Template() {
		meta=new ArrayList<String>();
	}

	public Template(String nom, List<String> meta) {
		this();
		this.nom = nom;
		this.meta = meta;
	}

	public List<String> getMeta() {
		return meta;
	}

	/*
	 * public Template(String nom) { this.nom=nom; this.meta= new
	 * HashSet<String>(); }
	 * 
	 * public Set<String> getMeta() { return meta; }
	 */
}
