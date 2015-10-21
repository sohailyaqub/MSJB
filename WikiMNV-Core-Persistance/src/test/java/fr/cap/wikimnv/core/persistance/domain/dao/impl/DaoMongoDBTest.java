package fr.cap.wikimnv.core.persistance.domain.dao.impl;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.persistance.SpringPropertiesUtil;
import fr.cap.wikimnv.core.pojo.Article;
import fr.cap.wikimnv.core.pojo.EtatPublication;
import fr.cap.wikimnv.core.pojo.Profil;
import fr.cap.wikimnv.core.pojo.Template;

public class DaoMongoDBTest {
	
	SpringPropertiesUtil placeholderConfigMM;
	public SpringPropertiesUtil getPlaceholderConfigMM() {
		return placeholderConfigMM;
	}
	public void setPlaceholderConfigMM(SpringPropertiesUtil placeholderConfigMM) {
		this.placeholderConfigMM = placeholderConfigMM;
	}

//	@Test
//	public void testDaoMongoDB() {
//		fail("Not yet implemented");
//	}
//
	@Test
	public void testGetAll() throws MNVException {
		DaoMongoDB mongo = new DaoMongoDB(placeholderConfigMM);
		
		mongo.getAll(Article.class);
	}
//
//	@Test
//	public void testGet() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testDelete() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testSaveOrUpdate() throws MNVException {
		DaoMongoDB mongo = new DaoMongoDB(placeholderConfigMM);
		
		Profil author = null;
		Template template = null;
		Article a = new Article(author, template);
	
		a.ajouterAttributDuContenu("promo1", "Blagueurs1");
		a.ajouterAttributDuContenu("promo2", "Blagueurs2");
		a.ajouterAttributDuContenu("promo3", "Blagueurs3");
		a.ajouterAttributDuContenu("promo4", "Blagueurs4");
		a.ajouterAttributDuContenu("promo5", "Blagueurs5");
		a.ajouterAttributDuContenu("promo6", "Blagueurs6");
		a.ajouterAttributDuContenu("promo7", "Blagueurs7");
		a.setDateCreation(new Date());
		a.setEtat(EtatPublication.PUBLIE);
		a.setVersion("0.1.4444");
		
		
		mongo.saveOrUpdate(a);
	}
//
//	@Test
//	public void testExecuteQuery() {
//		fail("Not yet implemented");
//	}

}
