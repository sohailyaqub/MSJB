package fr.cap.wikimnv.service.cli;


import fr.cap.wikimnv.service.UserService;
import fr.cap.wikimnv.service.UserService_Service;
//Class à implementer pour obtenir le client pour utiliser le @Webservice
public class ServiceUserCli {
	
	UserService userService = null;
	
	/**
	 * Creation d'un wrapper pour utiliser le client proprement avec vos spring
	 * le constructeur a été volontairement laissé vide, pour empecher les bugs:
	 * si un serveur hébergant un webservice est down lors du lancement de vos apps
	 * (pb de dépendance forte!)
	 */
	
	public ServiceUserCli() {}
	
	public UserService getUserService(){
		
		if (userService == null) {
			userService = (new UserService_Service()).getUserServicePort();
		}
		return userService;
	}
	
	

}
