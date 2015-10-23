package fr.cap.wikimnv.test.consultation;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import fr.cap.wikimnv.test.consultation.service.IServiceConsultationTest;
import fr.cap.wikimnv.test.consultation.service.IServiceCommentaireTest;

@RunWith(Suite.class)
@SuiteClasses({ IServiceConsultationTest.class, IServiceCommentaireTest.class })
public class AllTests {
	

}
