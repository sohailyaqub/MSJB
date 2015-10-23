package fr.cap.wikimnv.service.cli;


import fr.cap.wikimnv.service.UserService;
import fr.cap.wikimnv.service.UserService_Service;
//Class � implementer pour obtenir le client pour utiliser le @Webservice
public class ServiceUserCli {
	
	UserService userService = null;
	
	/**
	 * Creation d'un wrapper pour utiliser le client proprement avec vos spring
	 * le constructeur a �t� volontairement laiss� vide, pour empecher les bugs:
	 * si un serveur h�bergant un webservice est down lors du lancement de vos apps
	 * (pb de d�pendance forte!)
	 */
	
	public ServiceUserCli() {}
	
	public UserService getUserService(){
		
		if (userService == null) {
			userService = (new UserService_Service()).getUserServicePort();
		}
		return userService;
	}
	
	

}
