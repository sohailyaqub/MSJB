package fr.cap.wikimnv.service.cli;

import fr.cap.wikimnv.service.ProfilService;
import fr.cap.wikimnv.service.ProfilService_Service;
//Class � implementer pour obtenir le client pour utiliser le @Webservice
public class ServiceProfilCli {

	ProfilService profilService = null;

	/**
	 * Creation d'un wrapper pour utiliser le client proprement avec vos spring
	 * le constructeur a �t� volontairement laiss� vide, pour empecher les bugs:
	 * si un serveur h�bergant un webservice est down lors du lancement de vos apps
	 * (pb de d�pendance forte!)
	 */
	
	public ServiceProfilCli() {}
	
	public ProfilService getProfilService(){
		
		if (profilService == null) {
			profilService = (new ProfilService_Service()).getProfilServicePort();
		}
		return profilService;
	}

}
