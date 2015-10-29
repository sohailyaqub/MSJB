package fr.cap.wikimnv.core.structure.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.persistance.MNVException_Exception;
import fr.cap.wikimnv.core.persistance.cli.PersistanceCli;
import fr.cap.wikimnv.core.pojo.Article;
import fr.cap.wikimnv.core.pojo.EtatPublication;
import fr.cap.wikimnv.core.pojo.Query;
import fr.cap.wikimnv.core.pojo.TypeStructure;
import fr.cap.wikimnv.core.structure.service.IServiceArticle;

public class ServiceArticleImpl implements IServiceArticle {
	PersistanceCli sCrud ;
	
	public ServiceArticleImpl() {
		sCrud = new PersistanceCli() ;
	}

	public void changerEtat(EtatPublication etatPublication, Article article) throws MNVException {
		try {
			article.setEtat(etatPublication);
			sCrud.sauver(article) ;
		} catch (MNVException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Set<?> lister(TypeStructure typeStructure) throws MNVException {
		try {
			return (Set<Article>) sCrud.lister(typeStructure);
		} catch (MNVException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * @param article
	 * @throws MNVException
	 * @return Article
	 */

	public void supprimer(Object article) throws MNVException {
		// TODO Auto-generated method stub
		try {
			sCrud.supprimer(article);
		} catch (MNVException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * @param article : L'article à sauvegarder
	 * @throws MNVException
	 * @return Article
	 */

	public Object sauver(Object article) throws MNVException {
		// TODO Auto-generated method stub
		try {
			return (Article) sCrud.sauver(article);
		} catch (MNVException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// passer l'id et le type
		return null ;
	}

	public PersistanceCli getsCrud() {
		return sCrud;
	}

	public void setsCrud(PersistanceCli sCrud) {
		this.sCrud = sCrud;
	}
	
	

	public Object lire(Object article, TypeStructure typeStructure) throws MNVException {
		try {
			return sCrud.lire(article, typeStructure);
		} catch (MNVException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return null ;

	}
	
	public Object rechercher(Query query, Map<String, Object> params) {
		// return sCrud.faireRequete(query, params) ;
		return null ;
	}
}
