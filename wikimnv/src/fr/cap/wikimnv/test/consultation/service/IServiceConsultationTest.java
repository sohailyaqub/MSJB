package fr.cap.wikimnv.test.consultation.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.cap.wikimnv.consultation.service.IServiceCommentaire;
import fr.cap.wikimnv.consultation.service.IServiceConsultation;
import fr.cap.wikimnv.exception.MNVException;


public class IServiceConsultationTest {
	IServiceConsultation serviceConsultation;

public IServiceConsultationTest() {
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	serviceConsultation = (IServiceConsultation) applicationContext.getBean("sConsultation");
}

	@Test
	public void testGetServiceCommentaire() throws MNVException {

		IServiceCommentaire serviceCommentaire = serviceConsultation.getServiceCommentaire();

		if (serviceCommentaire == null)
			throw new MNVException(33, "pas de getCommentaire");
	}
}
