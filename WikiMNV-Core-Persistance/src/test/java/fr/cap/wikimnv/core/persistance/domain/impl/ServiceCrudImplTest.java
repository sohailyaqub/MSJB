package fr.cap.wikimnv.core.persistance.domain.impl;

import java.util.Date;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.cap.wikimnv.core.persistance.IServiceCRUD;
import fr.cap.wikimnv.core.pojo.Article;
import fr.cap.wikimnv.core.pojo.EtatPublication;
import fr.cap.wikimnv.core.pojo.Profil;
import fr.cap.wikimnv.core.pojo.Template;

public class ServiceCrudImplTest {

	IServiceCRUD scrud;
	
	public ServiceCrudImplTest() {
			}
	/*
	@Test
	public void testGetDao() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetDao() {
		fail("Not yet implemented");
	}

	@Test
	public void testServiceCrudImpl() {
		fail("Not yet implemented");
	}

	@Test
	public void testLister() {
		fail("Not yet implemented");
	}
*/
	@Test
	public void testSauver() {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		scrud = (IServiceCRUD) applicationContext.getBean("ServicePersistance");

		
		Profil author = null;
		Template template = null;
		Article a = new Article(author, template);
	
		a.ajouterAttributDuContenu("promo1", "Blagueurs1");
		a.ajouterAttributDuContenu("promo2", "Blagueurs2");
		a.ajouterAttributDuContenu("promo3", "Blagueurs3");
		a.ajouterAttributDuContenu("promo4", "Blagueurs4");
		a.ajouterAttributDuContenu("promo5", "Blagueurs5");
	
		a.setDateCreation(new Date());
		a.setEtat(EtatPublication.PUBLIE);
		a.setVersion("0.1.4444");
		
		try {
			scrud.sauver(a);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
/*
	@Test
	public void testFaireRequete() {
		fail("Not yet implemented");
	}

	@Test
	public void testLire() {
		fail("Not yet implemented");
	}

	@Test
	public void testSupprimer() {
		fail("Not yet implemented");
	}
*/
}
