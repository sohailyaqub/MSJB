package fr.cap.wikimnv.core.persistance;

import fr.cap.wikimnv.core.pojo.Operateur;


public class Meta {

	private String key;
	private String value;
	private Operateur operateur;

	public Meta() {
		super();
	}
	
	
	public Meta(String key, String value, Operateur operateur) {
		this.key = key;
		this.value = value;
		this.operateur = operateur;
	}
	
	public String getValue() {return value;}
	public void setValue(String value) {this.value = value;}
	public String getKey() {return key;}
	public void setKey(String key) {this.key = key;}
	public Operateur getOperateur() {return operateur;}
	public void setOperateur(Operateur operateur) {this.operateur = operateur;}	
	
}
