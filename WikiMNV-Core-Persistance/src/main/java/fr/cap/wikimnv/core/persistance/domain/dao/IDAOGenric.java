package fr.cap.wikimnv.core.persistance.domain.dao;

import java.util.List;
import java.util.Set;

import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.pojo.TypeStructure;


public interface IDAOGenric {

    Set<?> getAll(Class cls) throws MNVException;

	Object get(Object id, Class cls) throws MNVException;

	void delete(Object id, Class cls) throws MNVException;

	Object saveOrUpdate(Object obj) throws MNVException;

	List<?> executeQuery(Object laVraiRequette, String target) throws MNVException;

}
