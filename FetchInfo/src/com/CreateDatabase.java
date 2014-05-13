package com;

	import java.util.Date;

import javax.servlet.http.*;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.datastore.Query;

	public class CreateDatabase extends HttpServlet {
		
		public void doGet(HttpServletRequest req, HttpServletResponse res)
		{
	DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
	//Key guestbookKey = KeyFactory.createKey("Guestbook",123);
Entity ent=new Entity("User");
ent.setProperty("Uname","cgajjar");
ent.setProperty("email","chg268@nyu.edu");
ent.setProperty("password","cgajjar");
ent.setProperty("appcode","cgajjar");


datastore.put(ent);
	
	Entity ent1=new Entity("Category");
	ent1.setProperty("catid","c1");
	ent1.setProperty("catname","Movie");

	Entity ent2=new Entity("Location");
	ent2.setProperty("locid","l1");
	ent2.setProperty("catid","c1");
	ent2.setProperty("Lattitude",12.21);
	ent2.setProperty("Longitude",14.99);
	ent2.setProperty("lname","New York");
	ent2.setProperty("address","New York");
	ent2.setProperty("zipcode",11211);
	ent2.setProperty("contact",2019932938);
	ent2.setProperty("Url","cgajjar05.appspot.com");
	datastore.put(ent1);
	datastore.put(ent2);	
}
	}
