package fr.cap.wikimnv.core.persistance;

import static org.junit.Assert.fail;

import java.util.Set;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.pojo.TypeStructure;


public class ServiceCrudImplTest {
	
	IServiceCRUD sc;

	@SuppressWarnings("resource")
	public ServiceCrudImplTest() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		sc = (IServiceCRUD) applicationContext.getBean("ServicePersistance");	
	}
	


//	@Test
//	public void testServiceCrudImpl() {
//		fail("Not yet implemented");
//	}
//
	@Test
	public void testLister() {
		
		try {
		  sc.lister(TypeStructure.ARTICLE);
		} catch (MNVException e) {
			fail(e.getMessage());
		}
		
	}
//
//	@Test
//	public void testSauver() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testFaireRequete() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testLire() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSupprimer() {
//		fail("Not yet implemented");
//	}

}
