package fr.cap.wikimnv.service.impl;

import java.util.Map;
import java.util.Set;

import fr.cap.wikimnv.core.pojo.Profil;
import fr.cap.wikimnv.core.pojo.Query;
import fr.cap.wikimnv.core.pojo.TypeStructure;

public interface IServiceCRUD {

	int faireRequete(Query profilRanking, Map<String, Object> params);

	void sauver(Profil profil);

	Object lire(Object obj, TypeStructure type);

	Set<?> lister(TypeStructure type);

	Object sauver(Object obj);

	Object supprimer(Object obj);

}
