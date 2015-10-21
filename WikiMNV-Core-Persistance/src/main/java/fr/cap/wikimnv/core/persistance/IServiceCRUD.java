package fr.cap.wikimnv.core.persistance;

import java.util.List;

import javax.jws.WebService;

import fr.cap.wikimnv.core.commons.ICRUDGeneric;
import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.pojo.Query;

@WebService(name="crudService", serviceName="crudService")
public interface IServiceCRUD extends ICRUDGeneric{
	
	List<?> faireRequete(Query query, List<Meta> params) throws MNVException;
	
}
