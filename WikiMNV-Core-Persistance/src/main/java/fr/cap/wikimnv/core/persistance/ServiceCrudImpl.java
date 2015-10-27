package fr.cap.wikimnv.core.persistance;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.mongojack.DBQuery;
import org.springframework.beans.factory.annotation.Autowired;

import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.persistance.domain.dao.IDAOGenric;
import fr.cap.wikimnv.core.persistance.domain.dao.impl.DaoMongoDB;
import fr.cap.wikimnv.core.pojo.Query;
import fr.cap.wikimnv.core.pojo.TypeStructure;

public class ServiceCrudImpl implements IServiceCRUD {
	
	IDAOGenric dao;

	public IDAOGenric getDao() {
		return dao;
	}
	public void setDao(IDAOGenric dao) {
		this.dao = dao;
	}


	//CONSTRUCTEURS
	public ServiceCrudImpl() {}
	
	
	public Set<?> lister(TypeStructure type) throws MNVException {
		try {
			return dao.getAll(Class.forName(type.getClassEffectiveName()));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}		
		return null;
	}


	public Object sauver(Object obj) throws MNVException {	
		return dao.saveOrUpdate(obj);
	}
	
	

	public List<?> faireRequete(Query query, List<Meta> params)  throws MNVException {
		org.mongojack.DBQuery.Query vraieRequete = DBQuery.empty();
		for ( Meta meta : params) {
			switch (meta.getOperateur()) {
			
			case EQ:
				vraieRequete = vraieRequete.is(meta.getKey(), meta.getValue());
				break;
			case NEQ:
				vraieRequete = vraieRequete.notEquals(meta.getKey(), meta.getValue());
				break;	
				
			case LT:
				vraieRequete = vraieRequete.lessThan(meta.getKey(), meta.getValue());
				break;	
				
			case GT:
				vraieRequete = vraieRequete.greaterThan(meta.getKey(), meta.getValue());
				break;	
			
			default:
				break;
			} 

			
			// un ajout à la vrairequete
			
		}
		return dao.executeQuery(vraieRequete, query.toString().toLowerCase().split("_")[0].concat("s"));
	}
	
	
	@Override
	public Object lire(Object obj, TypeStructure type) throws MNVException{
		
		try {
			return dao.get(obj, Class.forName(type.getClassEffectiveName()));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public void supprimer(Object obj, TypeStructure type) throws MNVException {
		
		try {
			dao.delete(obj, Class.forName(type.getClassEffectiveName()));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public Set<Object> testSet() throws MNVException {
		// TODO Auto-generated method stub
		Set<Object> test=new HashSet<Object>();
		test.add(new Object());
		return test;
	}

	

}
