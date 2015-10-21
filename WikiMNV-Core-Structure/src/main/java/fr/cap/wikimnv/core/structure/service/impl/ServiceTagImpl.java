package fr.cap.wikimnv.core.structure.service.impl;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.persistance.CrudService;
import fr.cap.wikimnv.core.persistance.MNVException_Exception;
import fr.cap.wikimnv.core.persistance.cli.PersistanceCli;
import fr.cap.wikimnv.core.pojo.Query;
import fr.cap.wikimnv.core.pojo.Tag;
import fr.cap.wikimnv.core.pojo.TypeStructure;
import fr.cap.wikimnv.core.structure.service.IServiceTag;


@Service("sTag")
public class ServiceTagImpl implements IServiceTag {
	
	@Autowired
	PersistanceCli sCrud ;
	
	public Object supprimer(Object obj) throws MNVException {
		try {
			return (Tag) sCrud.supprimer(obj);
		} catch (MNVException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null ;
	}

	
	public Object sauver(Object obj) throws MNVException {
		try {
			return (Tag) sCrud.sauver(obj);
		} catch (MNVException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null ;
	}

	
	public Set<Tag> rechercheTextuelle(String libelle) throws MNVException {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("pTexte", libelle);
		// return (Set<Tag>) crud.faireRequete(Query.TAG_RECHERCHETEXTUELLE, params);
		return null ;
		
	}



	public Object unmarshal(String v) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public String marshal(Object v) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	public PersistanceCli getsCrud() {
		return sCrud;
	}


	public void setsCrud(PersistanceCli sCrud) {
		this.sCrud = sCrud;
	}
	
	public Object lire(Object tag, TypeStructure typeStructure) throws MNVException {
		try {
			return sCrud.lire(tag, typeStructure) ;
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
