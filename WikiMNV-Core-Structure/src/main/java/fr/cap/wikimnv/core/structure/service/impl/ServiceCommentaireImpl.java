package fr.cap.wikimnv.core.structure.service.impl;

import java.util.List;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.persistance.CrudService;
import fr.cap.wikimnv.core.persistance.CrudService_Service;
import fr.cap.wikimnv.core.persistance.MNVException_Exception;
import fr.cap.wikimnv.core.persistance.cli.PersistanceCli;
import fr.cap.wikimnv.core.pojo.Commentaire;
import fr.cap.wikimnv.core.pojo.EtatPublication;
import fr.cap.wikimnv.core.pojo.TypeStructure;
import fr.cap.wikimnv.core.structure.service.IServiceCommentaire;


public class ServiceCommentaireImpl implements IServiceCommentaire {
	PersistanceCli sCrud ;
	
	
	public ServiceCommentaireImpl() {
		sCrud=new PersistanceCli();
	}

	/**
	 * Permet d'obtenir la liste de tous les commentaires
	 *@return  Renvoie la liste des comentaires
	 *@author  Sohail, Messan  
	 */ 
	
	public Set<?> lister(Object typeStructure) throws MNVException {
		
		return sCrud.lister(typeStructure);
	}
	
	/**
	 * Permet de charg� un commentaire depuis la base
	 * @param Le commentaire � lire
	 * @return  Renvoie le commentaire demand� en param�tre
	 * @author Sohail, Messan
	 */ 

	
	public Object lire(Object commentaire, Object typeStructure) throws MNVException {
		return (Commentaire) sCrud.lire(commentaire, typeStructure) ;
	}
	
	/**
	 * Permet de sauvegarde un commentaire
	 * @param Le commentaire � sauvegarder
	 * @return le commentaire pass� en param�tre apr�s le sauvegarde
	 * @author Sohail, Messan
	 * @throws MNVException 
	 */ 

	
	public Object sauver(Object commentaire) throws MNVException {
		return (Commentaire) sCrud.sauver(commentaire) ;
	}
	
	/**
	 * Supprime le commentaire depuis la base pass� en param�tre
	 * @param le commentaire � supprimer
	 * @return le commentaire supprim� 
	 * @author Sohail, Messan
	 * @throws MNVException 
	 */

	
	public void supprimer(Object commentaire, Object typeStructure) throws MNVException {
		sCrud.supprimer(commentaire, typeStructure) ;
	}

	/**
	 * Permet de publier ou d�publier un commentaire
	 * @param le commentaire � banir
	 * @return le commentaire banis
	 * @author Sohail, Messan
	 * @throws MNVException 
	 */
	
	
	public Commentaire banir(Commentaire commentaire, EtatPublication etat) throws MNVException {
		// Publie ou d�publie un commentaire
		commentaire.setEtat(etat);
		return (Commentaire) sauver(commentaire) ;
	}

	public PersistanceCli getSCrud() {
		return sCrud;
	}

	public void setSCrud(PersistanceCli sCrud) {
		this.sCrud = sCrud;
	}
	
}
	