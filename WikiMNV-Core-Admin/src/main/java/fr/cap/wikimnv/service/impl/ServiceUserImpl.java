package fr.cap.wikimnv.service.impl;

import java.util.HashSet;
import java.util.Set;

import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.persistance.MNVException_Exception;
import fr.cap.wikimnv.core.persistance.cli.PersistanceCli;
import fr.cap.wikimnv.core.pojo.TypeStructure;
import fr.cap.wikimnv.core.pojo.User;
import fr.cap.wikimnv.service.IServiceUser;


public class ServiceUserImpl implements IServiceUser {

	// Besoin du service persistence (CRUD notamment)
	PersistanceCli pcli;

	//getters et setter pour IOC Spring
	public PersistanceCli getPcli() { return pcli; }
	public void setPcli(PersistanceCli pcli) {	this.pcli = pcli; }
		
	
	public void bannir(Object id) {
		User u = (User)id;
		u.setBannit(true);		
	}

	public Object lire(Object obj, TypeStructure type) {

			try {
				return pcli.lire(obj, type);
			} catch (MNVException_Exception e) {
				e.printStackTrace();
				return null;
			}

	}

	public Set<?> lister(TypeStructure type){
		try {
			//cast en Set
			return (Set<?>)pcli.lister(type);
		} catch (MNVException_Exception e) {
			e.printStackTrace();
			//renvoi Set vide
			return new HashSet<String>();
		}
	}

	public Object sauver(Object obj) {
		try {
			return pcli.sauver(obj);
		} catch (MNVException_Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public Object supprimer(Object obj){
		try {
			return pcli.supprimer(obj);
		} catch (MNVException_Exception e) {
			e.printStackTrace();
			return null;
		}
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
