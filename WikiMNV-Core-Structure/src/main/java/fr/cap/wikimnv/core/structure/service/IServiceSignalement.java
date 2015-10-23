package fr.cap.wikimnv.core.structure.service;



import javax.jws.WebService;

import fr.cap.wikimnv.core.commons.ICRUDGeneric;
import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.persistance.MNVException_Exception;
import fr.cap.wikimnv.core.pojo.Contenu;
import fr.cap.wikimnv.core.pojo.Signalement;
import fr.cap.wikimnv.core.pojo.User;

@WebService(name="ServiceSignalement", serviceName="ServiceSignalement")
public interface IServiceSignalement extends ICRUDGeneric
{
	void signaler(Contenu contenu, User user) throws MNVException;
	Signalement rejeter(Object id) throws MNVException ;
	Signalement traiter(Object id) throws MNVException ;
}


