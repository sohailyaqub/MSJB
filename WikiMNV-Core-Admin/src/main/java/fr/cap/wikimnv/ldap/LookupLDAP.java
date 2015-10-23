package fr.cap.wikimnv.ldap;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;

public class LookupLDAP {


	@SuppressWarnings("unchecked")
	public Object find(String uid, Class cls) throws Exception {
		Object object = cls.newInstance();
		Hashtable<String, String> env = new Hashtable<String, String>();

		env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
		env.put(Context.PROVIDER_URL, "ldap://localhost:389");
		env.put(Context.SECURITY_AUTHENTICATION, "simple");
		env.put(Context.SECURITY_PRINCIPAL, "cn=manager,dc=wikimnv,dc=com");
		env.put(Context.SECURITY_CREDENTIALS, "secret");


			// Create initial context
			DirContext ctx = new InitialDirContext(env);
			
			// Create the default search controls
			SearchControls ctls = new SearchControls();
			ctls.setSearchScope(SearchControls.SUBTREE_SCOPE);
			
			// Specify the search filter to match
			// Ask for objects that have the attribute "uid" == "abdali"
			String filter = "uid=".concat(uid);

			// Search for objects that have those matching attributes
			NamingEnumeration<SearchResult> answer = ctx.search("dc=wikimnv,dc=com", filter, ctls);

//			//Create matching attribute
//			Attributes matchAttrs = new BasicAttributes(true);
//			matchAttrs.put(new BasicAttribute("uid", uid));
//
//			// Search for objects that have those matching attributes
//			NamingEnumeration<SearchResult> answer = ctx.search("ou=Core,dc=wikimnv,dc=com", matchAttrs);
			
			
			
			while (answer.hasMore()) {
				SearchResult sr = (SearchResult) answer.next();
				//System.out.println(">>>" + sr.getName());
				//System.out.println(sr.getAttributes());
				//System.out.println(sr.getAttributes().get("uid").get());	
				NamingEnumeration<String> ne = sr.getAttributes().getIDs();
				while( ne.hasMore()){
					//System.out.println(ne.next());
					String key = ne.next();
					String value = sr.getAttributes().get(key).get().toString();
					//System.out.println(key + " "+ value);
					//User.class.getMethod("set".concat(key.substring(0, 1).toUpperCase()).concat(key.substring(1)), String.class).invoke(user, value);
					//on test si la clé est différente de objectClass
					//si c'est le cas on insert pas (on a pas cet attr dans nos pojos)
					if(!key.equals("objectClass")){
						cls.getMethod("set".concat(key.substring(0, 1).toUpperCase()).concat(key.substring(1)), String.class).invoke(cls.cast(object), value);
					}
				}
					
				
			}
			
		    // Close the context when we're done
		    ctx.close();


		
		return object;

	}
}