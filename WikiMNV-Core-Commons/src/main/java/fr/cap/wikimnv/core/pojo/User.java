package fr.cap.wikimnv.core.pojo;

import org.mongojack.Id;
import org.mongojack.ObjectId;

public class User {
	
	public boolean bannit;
	
	private String cn;
	private String description;
	private String givenName;
	private String mail;
	private String ou;
	private String sn;
	private String uid;	
	
	
	public String getCn() {
		return cn;
	}

	public void setCn(String cn) {
		this.cn = cn;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getOu() {
		return ou;
	}

	public void setOu(String ou) {
		this.ou = ou;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}
	
	public void setBannit(boolean b) {
		this.bannit = b;		
	}
	
	public boolean isBannit(){
		return bannit;
	}
	
	public User() {
		setBannit(false);
	}

}
