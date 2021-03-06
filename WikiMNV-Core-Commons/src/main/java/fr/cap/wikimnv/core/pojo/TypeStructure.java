package fr.cap.wikimnv.core.pojo;

public enum TypeStructure {
	
	ARTICLE("Article"),
	COMMENTAIRE("Commentaire"),
	PROFIL("Profil"), 
	CONTENU("Contenu"),
	TAG("Tag"), 
	TEMPLATE("Template"), 
	SIGNALEMENT("Signalement");

	private String classEffectiveName;
	
	private TypeStructure(String classEffectiveName) {
		this.classEffectiveName = classEffectiveName;
	}

	public String getClassEffectiveName() {
		return "fr.cap.wikimnv.core.pojo."+classEffectiveName;
	}

	
	
	
}
