package fr.cap.wikimnv.core.structure.service.impl;

import java.util.List;
import java.util.Set;

import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.persistance.CrudService;
import fr.cap.wikimnv.core.persistance.MNVException_Exception;
import fr.cap.wikimnv.core.persistance.cli.PersistanceCli;
import fr.cap.wikimnv.core.pojo.Template;
import fr.cap.wikimnv.core.pojo.TypeStructure;
import fr.cap.wikimnv.core.structure.service.IServiceTemplate;

public class ServiceTemplateImpl implements IServiceTemplate {
	
	PersistanceCli sCrud ;

	public ServiceTemplateImpl() {
		super();
	}

	public void ajouterMeta(Template template, String metadonnee) throws MNVException {
		template.getMeta().add(metadonnee);
		this.sauver(template);
	}

	public void supprimerMeta(Template template, String metadonnee) throws MNVException{
		template.getMeta().remove(metadonnee); 
		this.sauver(template);
	}

	public Object sauver(Object obj) throws MNVException {
		return (Template) sCrud.sauver(obj);
	}

	public void  supprimer(Object obj, Object type) throws MNVException {
		sCrud.supprimer(obj, type);
	}

	public PersistanceCli getsCrud() {
		return sCrud;
	}

	public void setsCrud(PersistanceCli sCrud) {
		this.sCrud = sCrud;
	}
	
	public Object lire(Object template, Object typeStructure) throws MNVException {
		return sCrud.lire(template, typeStructure) ;
	}
	
	public Set<?> lister(Object typeStructure) throws MNVException {
		
		return  sCrud.lister(typeStructure);
	}


}
