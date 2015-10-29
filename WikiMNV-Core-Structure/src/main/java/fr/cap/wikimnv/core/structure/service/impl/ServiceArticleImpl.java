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
		super();
	}

	public void changerEtat(EtatPublication etatPublication, Article article) throws MNVException {
		article.setEtat(etatPublication);
		sCrud.sauver(article) ;
	}

	@Override
	public Set<?> lister(Object  typeStructure) throws MNVException {
		return sCrud.lister(typeStructure);
	}

	/**
	 * @param article
	 * @throws MNVException
	 * @return Article
	 */
	@Override
	public void supprimer(Object article, Object type) throws MNVException {
		sCrud.supprimer(article, type);
	}
	
	/**
	 * @param article : L'article à sauvegarder
	 * @throws MNVException
	 * @return Article
	 */

	public Object sauver(Object article) throws MNVException {
		return (Article) sCrud.sauver(article);
	}

	public PersistanceCli getsCrud() {
		return sCrud;
	}

	public void setsCrud(PersistanceCli sCrud) {
		this.sCrud = sCrud;
	}
	
	
	@Override
	public Object lire(Object article, Object  typeStructure) throws MNVException {
		return sCrud.lire(article, typeStructure);
	}
	
	public Object rechercher(Query query, Map<String, Object> params) {
		// return sCrud.faireRequete(query, params) ;
		return null ;
	}


	
}
