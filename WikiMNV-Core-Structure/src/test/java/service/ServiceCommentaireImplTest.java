package service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.pojo.Commentaire;
import fr.cap.wikimnv.core.pojo.TypeStructure;
import fr.cap.wikimnv.core.structure.service.IServiceCommentaire;



public class ServiceCommentaireImplTest {
	IServiceCommentaire sc ;

	public ServiceCommentaireImplTest() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		sc = (IServiceCommentaire) applicationContext.getBean("ServiceCommentaire");
	}

	@Test
	public void testLister() {
		try {
			sc.lister(TypeStructure.COMMENTAIRE) ;
		} catch (MNVException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testLire() {
		try {
			sc.lister(TypeStructure.COMMENTAIRE) ;
		} catch (MNVException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSauver() {
		try {
			sc.sauver(new Commentaire()) ;
		} catch (MNVException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSupprimer() {
		try {
			sc.lister(TypeStructure.COMMENTAIRE) ;
		} catch (MNVException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
