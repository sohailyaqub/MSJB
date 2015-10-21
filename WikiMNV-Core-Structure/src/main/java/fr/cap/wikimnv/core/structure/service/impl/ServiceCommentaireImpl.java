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
		sCrud = new PersistanceCli() ;
	}

	/**
	 * Permet d'obtenir la liste de tous les commentaires
	 *@return  Renvoie la liste des comentaires
	 *@author  Sohail, Messan  
	 */ 
	
	public Set<?> lister(TypeStructure typeStructure) throws MNVException {
		
		try {
			return  (Set<Commentaire>) sCrud.lister(typeStructure);
		} catch (MNVException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * Permet de chargé un commentaire depuis la base
	 * @param Le commentaire à lire
	 * @return  Renvoie le commentaire demandé en paramètre
	 * @author Sohail, Messan
	 */ 

	
	public Object lire(Object commentaire, TypeStructure typeStructure) throws MNVException {
		try {
			return (Commentaire) sCrud.lire(commentaire, typeStructure) ;
		} catch (MNVException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null ;
	}
	
	/**
	 * Permet de sauvegarde un commentaire
	 * @param Le commentaire à sauvegarder
	 * @return le commentaire passé en paramètre après le sauvegarde
	 * @author Sohail, Messan
	 * @throws MNVException 
	 */ 

	
	public Object sauver(Object commentaire) throws MNVException {
		try {
			return (Commentaire) sCrud.sauver(commentaire) ;
		} catch (MNVException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null ;
	}
	
	/**
	 * Supprime le commentaire depuis la base passé en paramètre
	 * @param le commentaire à supprimer
	 * @return le commentaire supprimé 
	 * @author Sohail, Messan
	 * @throws MNVException 
	 */

	
	public void supprimer(Object commentaire, TypeStructure typeStructure) throws MNVException {
		try {
			sCrud.supprimer(commentaire) ;
		} catch (MNVException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Permet de publier ou dépublier un commentaire
	 * @param le commentaire à banir
	 * @return le commentaire banis
	 * @author Sohail, Messan
	 * @throws MNVException 
	 */
	
	
	public Commentaire banir(Commentaire commentaire, EtatPublication etat) throws MNVException {
		// Publie ou dépublie un commentaire
		commentaire.setEtat(etat);
		return (Commentaire) sauver(commentaire) ;
	}

	public PersistanceCli getsCrud() {
		return sCrud;
	}

	public void setsCrud(PersistanceCli sCrud) {
		this.sCrud = sCrud;
	}
	
}
	