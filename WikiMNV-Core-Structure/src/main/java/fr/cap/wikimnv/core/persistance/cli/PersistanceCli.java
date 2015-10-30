package fr.cap.wikimnv.core.persistance.cli;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import fr.cap.wikimnv.core.persistance.CrudService;
import fr.cap.wikimnv.core.persistance.CrudService_Service;
import fr.cap.wikimnv.core.persistance.MNVException_Exception;

public class PersistanceCli {
	CrudService cs=null;
	public PersistanceCli()  {}
	
	public CrudService getCrudService() {
		if (cs==null) 
			cs=(new CrudService_Service()).getCrudServicePort();
		return cs;
	}
	
	public Set<Object> lister(Object type) {
		Set<Object> result=new HashSet<Object>();
		try {
			List<Object> liste=this.getCrudService().lister(type);
			for(Object item : liste)
				result.add(item);
			return result;
		} catch (MNVException_Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public Object lire(Object obj, Object type) {
		try {
			return this.getCrudService().lire(obj, type);
		} catch (MNVException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public Object sauver(Object obj) {
		try {
			return this.getCrudService().sauver(obj);
		} catch (MNVException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public void supprimer(Object obj, Object type) {
		try {
			this.getCrudService().supprimer(obj, type);
		} catch (MNVException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
