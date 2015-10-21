package fr.cap.wikimnv.core.commons;

import java.util.Set;

import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.pojo.TypeStructure;

public interface ICRUDGeneric  {
	
	Set<?> lister(TypeStructure type) throws MNVException ;
	Object lire(Object id, Class cls) throws MNVException;
	void supprimer(Object id, Class cls) throws MNVException;
	Object sauver(Object obj) throws MNVException ;
	
}


