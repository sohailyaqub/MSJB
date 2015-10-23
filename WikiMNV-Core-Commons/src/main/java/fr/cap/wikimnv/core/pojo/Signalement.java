package fr.cap.wikimnv.core.pojo;

import java.util.Date;
import java.util.Random;



public class Signalement{
	private String reference;
	private Date date;
	private Contenu contenu;
	private EtatSignalement etat;
	private User user;
	
	//CONSTRUCTEUR
	public Signalement() {this(null, new User());}
	public Signalement(Contenu contenu, User user) {
		try {
			this.reference = Random.class.newInstance().nextLong()+"";
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		this.date = new Date();
		this.contenu = contenu;
		this.user = user;
		
		//Positionnement de l'état lors de la création
		etat = EtatSignalement.ATRAITER;
	}
	
	//GETTERS & SETTERS
	public Contenu getContenu() {return contenu;}
	public void setContenu(Contenu contenu) {this.contenu = contenu;}
	public EtatSignalement getEtat() {return etat;}
	public void setEtat(EtatSignalement etat) {this.etat = etat;}
	public User getUser() {return user;}
	public void setUser(User user) {this.user = user;}
	public String getReference() {return reference;}
	public Date getDate() {return date;}
	public void setReference(String reference) {this.reference = reference;}
	public void setDate(Date date) {this.date = date;}
}
