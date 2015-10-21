package fr.cap.wikimnv.core.persistance.domain.dao.impl;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.mongojack.DBCursor;
import org.mongojack.DBQuery;
import org.mongojack.DBQuery.Query;
import org.mongojack.JacksonDBCollection;
import org.springframework.core.SpringProperties;
import org.springframework.stereotype.Component;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.persistance.SpringPropertiesUtil;
import fr.cap.wikimnv.core.persistance.domain.dao.IDAOGenric;
import fr.cap.wikimnv.core.pojo.Article;
import fr.cap.wikimnv.core.pojo.Contenu;
import fr.cap.wikimnv.core.pojo.Profil;
import fr.cap.wikimnv.core.pojo.Signalement;
import fr.cap.wikimnv.core.pojo.Tag;
import fr.cap.wikimnv.core.pojo.Template;
import fr.cap.wikimnv.core.pojo.TypeRecherche;
import fr.cap.wikimnv.core.pojo.TypeStructure;


public class DaoMongoDB implements IDAOGenric {

	private DB database;
	private MongoClient mongo;
	//Map regroupant ttes les collections
	private Map<String,JacksonDBCollection> declaredCollections; 

	private SpringPropertiesUtil placeholderConfigMM;

	
	public SpringPropertiesUtil getPlaceholderConfigMM() {
		return placeholderConfigMM;
	}
	public void setPlaceholderConfigMM(SpringPropertiesUtil placeholderConfigMM) {
		this.placeholderConfigMM = placeholderConfigMM;
	}


	@SuppressWarnings("deprecation")
	public DaoMongoDB(SpringPropertiesUtil placeholderConfigMM) {
		
		
		this.placeholderConfigMM = placeholderConfigMM;
		// recuperation des parametres de connexion
		String ip = placeholderConfigMM.getProperty("wikimnv.dao.host.ip");
		int port = Integer.parseInt(placeholderConfigMM.getProperty("wikimnv.dao.host.port"));
		String bdd = placeholderConfigMM.getProperty("wikimnv.dao.bdd");
		
		//mongo = new MongoClient();
		mongo = new MongoClient(ip, port);
		declaredCollections = new HashMap<String, JacksonDBCollection>();				
		database = mongo.getDB(bdd);
		

		for (String c : placeholderConfigMM.getProperty("wikimnv.type.structure").split(",") )

		{
			try {

				collectionFactory(Class.forName(placeholderConfigMM.getProperty("wikimnv.type.path").concat(".").concat(c)));

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		 }		
	 }
	

	private void collectionFactory(Class c) {
		String nomCollection = c.getSimpleName().toLowerCase() + 's';
		DBCollection maCollection = database.getCollection(nomCollection); 
		JacksonDBCollection<Object, String> maJacksonCollection = JacksonDBCollection.wrap(maCollection, c, String.class);
		declaredCollections.put(nomCollection, maJacksonCollection);
	}

	
	
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public synchronized Set<?> getAll(Class cls) throws MNVException {
		String nomCollection = cls.getSimpleName().toLowerCase() + 's';
		JacksonDBCollection maJacksonCollection = declaredCollections.get(nomCollection);

		DBCursor cursor = maJacksonCollection.find();
		
		Set returnSet = new HashSet();
		
		for (Object o : cursor)
		{
			System.out.println(cls.cast(o));
			returnSet.add(cls.cast(o));
		}
		
		return returnSet;
	}

	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Object saveOrUpdate(Object obj) throws MNVException {
		String nomCollection = obj.getClass().getSimpleName().toLowerCase().concat("s") ;
		JacksonDBCollection maJacksonCollection = declaredCollections.get(nomCollection);		
		return maJacksonCollection.insert(obj).getSavedObject();	
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Object get(Object id, Class cls) throws MNVException {
		
		String nomCollection = cls.getSimpleName().toLowerCase() + 's';
		JacksonDBCollection maJacksonCollection = declaredCollections.get(nomCollection);
		
		return cls.cast(maJacksonCollection.findOneById(id));
	}

	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void delete(Object id, Class cls) throws MNVException {
		
		String nomCollection = cls.getSimpleName().toLowerCase().concat("s");
		JacksonDBCollection maJacksonCollection = declaredCollections.get(nomCollection);
		
		maJacksonCollection.removeById(id);
	}

	
	
	
	public List<?> executeQuery(Object laVraiRequette, String target)throws MNVException {
		
		List list = new ArrayList();
		DBCursor cursor =  declaredCollections.get(target).find(Query.class.cast(laVraiRequette));
		for (Object o : cursor)
		{
			list.add(o);
		}
		
		return list;
		
	}


}
