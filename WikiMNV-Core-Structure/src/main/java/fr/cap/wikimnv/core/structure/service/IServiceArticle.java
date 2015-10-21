package fr.cap.wikimnv.core.structure.service;

import javax.jws.WebService;

import fr.cap.wikimnv.core.commons.ICRUDGeneric;
import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.pojo.Article;
import fr.cap.wikimnv.core.pojo.EtatPublication;


@WebService(name="ServiceArticle", serviceName="ServiceArticle")
public interface IServiceArticle extends ICRUDGeneric {
	/**
	 * elle permet de changer l'etat de mon article
	 * les états possible :<br/>
	 * -Publié <br/>
	 * -Archivé<br/>
	 * -Brouillon "état initial"
	 * @param etatPublication
	 * @param idArticle
	 */
	void changerEtat (EtatPublication etatPublication, Article article)throws MNVException;

}
