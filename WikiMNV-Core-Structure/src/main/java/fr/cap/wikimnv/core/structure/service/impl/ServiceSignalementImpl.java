package fr.cap.wikimnv.core.structure.service.impl;



import java.util.List;
import java.util.Set;

import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.persistance.CrudService;
import fr.cap.wikimnv.core.persistance.MNVException_Exception;
import fr.cap.wikimnv.core.persistance.cli.PersistanceCli;
import fr.cap.wikimnv.core.pojo.Contenu;
import fr.cap.wikimnv.core.pojo.EtatSignalement;
import fr.cap.wikimnv.core.pojo.Signalement;
import fr.cap.wikimnv.core.pojo.TypeStructure;
import fr.cap.wikimnv.core.pojo.User;
import fr.cap.wikimnv.core.structure.service.IServiceSignalement;

public class ServiceSignalementImpl implements IServiceSignalement {

	PersistanceCli sCrud ;
	public PersistanceCli getsCrud() {return sCrud;}
	public void setsCrud(PersistanceCli sCrud) {this.sCrud = sCrud;}

	public ServiceSignalementImpl() {
		super();
	}
	
	private Signalement changerEtat(EtatSignalement etat, Object key) throws MNVException {
		Signalement sig = null ;
		sig = (Signalement) sCrud.lire(key, TypeStructure.SIGNALEMENT);
		sig.setEtat(etat);

		return (Signalement)sCrud.sauver(sig);		
	}

	
	public Signalement rejeter(Object id) throws MNVException {
		return changerEtat(EtatSignalement.REJETE, id);
	}
	
	
	public Signalement traiter(Object id) throws MNVException {
		return changerEtat(EtatSignalement.TRAITE, id);
	}
	
	public void  supprimer(Object obj, Object type) throws MNVException {
		sCrud.supprimer(obj, type);
	}


	
	public Object sauver(Object obj) throws MNVException {
		
			return (Signalement) sCrud.sauver(obj);
		
	}

	
	public void signaler(Contenu contenu, User user) throws MNVException {
		Signalement sig = new Signalement(contenu, user);
		sauver(sig);		
	}
	
	public Object lire(Object sig, Object  typeStructure) throws MNVException {
		return sCrud.lire(sig, typeStructure) ;
	}
	
	public Set<?> lister(Object  typeStructure) throws MNVException {
		
		return  (Set<?>) sCrud.lister(typeStructure);
	}
	

	
}
