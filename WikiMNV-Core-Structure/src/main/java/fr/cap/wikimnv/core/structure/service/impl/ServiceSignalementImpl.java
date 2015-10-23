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
		sCrud = new PersistanceCli() ;
	}
	
	private Signalement changerEtat(EtatSignalement etat, Object key) throws MNVException {
		Signalement sig = null ;
		try {
			sig = (Signalement) sCrud.lire(key, TypeStructure.SIGNALEMENT);
		} catch (MNVException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sig.setEtat(etat);

		try {
			return (Signalement)sCrud.sauver(sig);
		} catch (MNVException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		return null;
	}

	
	public Signalement rejeter(Object id) throws MNVException {
		return changerEtat(EtatSignalement.REJETE, id);
	}
	
	
	public Signalement traiter(Object id) throws MNVException {
		return changerEtat(EtatSignalement.TRAITE, id);
	}
	
	public Object supprimer(Object obj) throws MNVException {
		try {
			return (Signalement) sCrud.supprimer(obj);
		} catch (MNVException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}


	
	public Object sauver(Object obj) throws MNVException {
		
			try {
				return (Signalement) sCrud.sauver(obj);
			} catch (MNVException_Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return null;
		
	}

	
	public void signaler(Contenu contenu, User user) throws MNVException {
		Signalement sig = new Signalement(contenu, user);
		sauver(sig);		
	}
	
	public Object lire(Object sig, TypeStructure typeStructure) throws MNVException {
		try {
			return sCrud.lire(sig, typeStructure) ;
		} catch (MNVException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null ;
	}
	
	public Set<?> lister(TypeStructure typeStructure) throws MNVException {
		
		try {
			return  (Set<?>) sCrud.lister(typeStructure);
		} catch (MNVException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public Object lire(Object arg0, Class arg1) throws MNVException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void supprimer(Object arg0, Class arg1) throws MNVException {
		// TODO Auto-generated method stub
		
	}
}
