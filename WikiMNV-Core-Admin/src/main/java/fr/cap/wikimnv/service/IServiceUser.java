package fr.cap.wikimnv.service;

import javax.jws.WebService;

import fr.cap.wikimnv.core.commons.ICRUDGeneric;
import fr.cap.wikimnv.core.commons.exception.MNVException;


@WebService(name="userService", serviceName="userService")
public interface IServiceUser extends ICRUDGeneric {
		
	void bannir(Object id) throws MNVException;
		
}
