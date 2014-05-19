package com;

	import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletContext;
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
			
			System.out.println("ayu ke nai??");
	DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
	//Key guestbookKey = KeyFactory.createKey("Guestbook",123);
/*Entity ent=new Entity("User");
ent.setProperty("Uname","cgajjar");
ent.setProperty("email","chg268@nyu.edu");
ent.setProperty("password","cgajjar");
ent.setProperty("appcode","cgajjar");


datastore.put(ent);
	*/
	/*Entity ent1=new Entity("Category");
	ent1.setProperty("catid","c3");
	ent1.setProperty("catname","Restaurant");

	Entity ent2=new Entity("Location");
	ent2.setProperty("locid","l2");
	ent2.setProperty("catid","c3");
	ent2.setProperty("Lattitude",0);
	ent2.setProperty("Longitude",0);
	ent2.setProperty("lname","New York");
	ent2.setProperty("address","New York");
	ent2.setProperty("zipcode",11211);
	ent2.setProperty("contact",2019932938);
	ent2.setProperty("Url","cgajjar05.appspot.com");
	ent2.setProperty("Deals","No");
	datastore.put(ent1);
	datastore.put(ent2);	
	
	ent2.setProperty("locid","l2");
	ent2.setProperty("catid","c3");
	ent2.setProperty("Lattitude",0.0);
	ent2.setProperty("Longitude",0.0);
	ent2.setProperty("lname","New York");
	ent2.setProperty("address","New York");
	ent2.setProperty("zipcode",11211);
	ent2.setProperty("contact",2019932938);
	ent2.setProperty("Url","cgajjar05.appspot.com");
	ent2.setProperty("Deals","No");
	
	datastore.put(ent2);	*/
	
	
	
	
	Entity ent2[]=new Entity[20];
		
	ent2[0]=new Entity("Location");
	ent2[0].setProperty("catid","c3");
	ent2[0].setProperty("Lattitude",40.704938720242154);
	ent2[0].setProperty("Longitude",-73.83591642613314);
	ent2[0].setProperty("lname","Danny Brown Wine Bar & Kitchen");
	ent2[0].setProperty("address","10402 Metropolitan Ave");
	ent2[0].setProperty("zipcode",11375);
	ent2[0].setProperty("contact","7182612144");
	datastore.put(ent2[0]);

	ent2[1]=new Entity("Location");
	ent2[1].setProperty("catid","c3");
	ent2[1].setProperty("Lattitude",40.704938720242154);
	ent2[1].setProperty("Longitude",-73.83591642613314);
	ent2[1].setProperty("lname","Kaieteur Restaurant");
	ent2[1].setProperty("address","8712 Lefferts Blvd");
	ent2[1].setProperty("zipcode",11418);
	ent2[1].setProperty("contact","7188500787");
	datastore.put(ent2[1]);

	ent2[2]=new Entity("Location");
	ent2[2].setProperty("catid","c3");
	ent2[2].setProperty("Lattitude",40.704938720242154);
	ent2[2].setProperty("Longitude",-73.83591642613314);
	ent2[2].setProperty("lname","Tuscan Hills");
	ent2[2].setProperty("address","115-20 Queens Blvd");
	ent2[2].setProperty("zipcode",11375);
	ent2[2].setProperty("contact","7184874500");
	datastore.put(ent2[2]);

	ent2[3]=new Entity("Location");
	ent2[3].setProperty("catid","c3");
	ent2[3].setProperty("Lattitude",40.704938720242154);
	ent2[3].setProperty("Longitude",-73.83591642613314);
	ent2[3].setProperty("lname","Roka Turkish Cuisine");
	ent2[3].setProperty("address","116-35 Metropolitan Ave");
	ent2[3].setProperty("zipcode",11418);
	ent2[3].setProperty("contact","7188507700");
	datastore.put(ent2[3]);

	ent2[4]=new Entity("Location");
	ent2[4].setProperty("catid","c3");
	ent2[4].setProperty("Lattitude",40.704938720242154);
	ent2[4].setProperty("Longitude",-73.83591642613314);
	ent2[4].setProperty("lname","Haveli");
	ent2[4].setProperty("address","11633 Queens Blvd");
	ent2[4].setProperty("zipcode",11375);
	ent2[4].setProperty("contact","7182618880");
	datastore.put(ent2[4]);

	ent2[5]=new Entity("Location");
	ent2[5].setProperty("catid","c3");
	ent2[5].setProperty("Lattitude",40.704938720242154);
	ent2[5].setProperty("Longitude",-73.83591642613314);
	ent2[5].setProperty("lname","Tu Casa Restaurant");
	ent2[5].setProperty("address","11905 Metropolitan Ave");
	ent2[5].setProperty("zipcode",11415);
	ent2[5].setProperty("contact","7184416363");
	datastore.put(ent2[5]);

	ent2[6]=new Entity("Location");
	ent2[6].setProperty("catid","c3");
	ent2[6].setProperty("Lattitude",40.704938720242154);
	ent2[6].setProperty("Longitude",-73.83591642613314);
	ent2[6].setProperty("lname","India Cafe");
	ent2[6].setProperty("address","94-08 Lefferts Blvd");
	ent2[6].setProperty("zipcode",11419);
	ent2[6].setProperty("contact","7188462842");
	datastore.put(ent2[6]);

	ent2[7]=new Entity("Location");
	ent2[7].setProperty("catid","c3");
	ent2[7].setProperty("Lattitude",40.704938720242154);
	ent2[7].setProperty("Longitude",-73.83591642613314);
	ent2[7].setProperty("lname","Mehak");
	ent2[7].setProperty("address","8306 Austin St");
	ent2[7].setProperty("zipcode",11415);
	ent2[7].setProperty("contact","7184413337");
	datastore.put(ent2[7]);

	ent2[8]=new Entity("Location");
	ent2[8].setProperty("catid","c3");
	ent2[8].setProperty("Lattitude",40.704938720242154);
	ent2[8].setProperty("Longitude",-73.83591642613314);
	ent2[8].setProperty("lname","Nick's Bistro");
	ent2[8].setProperty("address","104-20 Metropolitian Ave");
	ent2[8].setProperty("zipcode",11375);
	ent2[8].setProperty("contact","7185446425");
	datastore.put(ent2[8]);

	ent2[9]=new Entity("Location");
	ent2[9].setProperty("catid","c3");
	ent2[9].setProperty("Lattitude",40.704938720242154);
	ent2[9].setProperty("Longitude",-73.83591642613314);
	ent2[9].setProperty("lname","Il Poeta");
	ent2[9].setProperty("address","98-04 Metropolitan Ave");
	ent2[9].setProperty("zipcode",11375);
	ent2[9].setProperty("contact","7185444223");
	datastore.put(ent2[9]);

	ent2[10]=new Entity("Location");
	ent2[10].setProperty("catid","c3");
	ent2[10].setProperty("Lattitude",40.704938720242154);
	ent2[10].setProperty("Longitude",-73.83591642613314);
	ent2[10].setProperty("lname","Mexico Jophsua 19 Grocery & Restaurant");
	ent2[10].setProperty("address","134-06 Jamaica Ave");
	ent2[10].setProperty("zipcode",11418);
	ent2[10].setProperty("contact","7182062115");
	datastore.put(ent2[10]);

	ent2[11]=new Entity("Location");
	ent2[11].setProperty("catid","c3");
	ent2[11].setProperty("Lattitude",40.704938720242154);
	ent2[11].setProperty("Longitude",-73.83591642613314);
	ent2[11].setProperty("lname","Dee's");
	ent2[11].setProperty("address","107-23 Metropolitan Ave");
	ent2[11].setProperty("zipcode",11375);
	ent2[11].setProperty("contact","7187937553");
	datastore.put(ent2[11]);

	ent2[12]=new Entity("Location");
	ent2[12].setProperty("catid","c3");
	ent2[12].setProperty("Lattitude",40.704938720242154);
	ent2[12].setProperty("Longitude",-73.83591642613314);
	ent2[12].setProperty("lname","New Pinang Malaysian Restaurant");
	ent2[12].setProperty("address","11110 Queens Blvd");
	ent2[12].setProperty("zipcode",11375);
	ent2[12].setProperty("contact","7182689135");
	datastore.put(ent2[12]);

	ent2[13]=new Entity("Location");
	ent2[13].setProperty("catid","c3");
	ent2[13].setProperty("Lattitude",40.704938720242154);
	ent2[13].setProperty("Longitude",-73.83591642613314);
	ent2[13].setProperty("lname","Dani's House of Pizza");
	ent2[13].setProperty("address","81-28 Lefferts Blvd");
	ent2[13].setProperty("zipcode",11415);
	ent2[13].setProperty("contact","7188462849");
	datastore.put(ent2[13]);

	ent2[14]=new Entity("Location");
	ent2[14].setProperty("catid","c3");
	ent2[14].setProperty("Lattitude",40.704938720242154);
	ent2[14].setProperty("Longitude",-73.83591642613314);
	ent2[14].setProperty("lname","Wafa's");
	ent2[14].setProperty("address","100-05 Metropolitan Ave");
	ent2[14].setProperty("zipcode",11375);
	ent2[14].setProperty("contact","7188802055");
	datastore.put(ent2[14]);

	ent2[15]=new Entity("Location");
	ent2[15].setProperty("catid","c3");
	ent2[15].setProperty("Lattitude",40.704938720242154);
	ent2[15].setProperty("Longitude",-73.83591642613314);
	ent2[15].setProperty("lname","The Nest Restaurant & Bar");
	ent2[15].setProperty("address","12517 101st Ave");
	ent2[15].setProperty("zipcode",11419);
	ent2[15].setProperty("contact","7188474035");
	datastore.put(ent2[15]);

	ent2[16]=new Entity("Location");
	ent2[16].setProperty("catid","c3");
	ent2[16].setProperty("Lattitude",40.704938720242154);
	ent2[16].setProperty("Longitude",-73.83591642613314);
	ent2[16].setProperty("lname","Venue Bar Restaurant");
	ent2[16].setProperty("address","119-30 Metropolitan Ave");
	ent2[16].setProperty("zipcode",11415);
	ent2[16].setProperty("contact","7184873549");
	datastore.put(ent2[16]);

	ent2[17]=new Entity("Location");
	ent2[17].setProperty("catid","c3");
	ent2[17].setProperty("Lattitude",40.704938720242154);
	ent2[17].setProperty("Longitude",-73.83591642613314);
	ent2[17].setProperty("lname","La Vigna Restaurant");
	ent2[17].setProperty("address","10011 Metropolitan Ave");
	ent2[17].setProperty("zipcode",11375);
	ent2[17].setProperty("contact","7182684264");
	datastore.put(ent2[17]);

	ent2[18]=new Entity("Location");
	ent2[18].setProperty("catid","c3");
	ent2[18].setProperty("Lattitude",40.704938720242154);
	ent2[18].setProperty("Longitude",-73.83591642613314);
	ent2[18].setProperty("lname","East Ocean Palace");
	ent2[18].setProperty("address","113-09 Queens Blvd");
	ent2[18].setProperty("zipcode",11375);
	ent2[18].setProperty("contact","7182681668");
	datastore.put(ent2[18]);

	ent2[19]=new Entity("Location");
	ent2[19].setProperty("catid","c3");
	ent2[19].setProperty("Lattitude",40.704938720242154);
	ent2[19].setProperty("Longitude",-73.83591642613314);
	ent2[19].setProperty("lname","Hado Sushi");
	ent2[19].setProperty("address","138-40 86th Ave");
	ent2[19].setProperty("zipcode",11435);
	ent2[19].setProperty("contact","7185585758");
	datastore.put(ent2[19]);		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	System.out.println("ayuu0.01");
	
	/*BufferedReader brDeal = null;
	BufferedReader brLatitude = null;
	BufferedReader brLongitude = null;
	BufferedReader brLocname = null;
	BufferedReader brLocaddress = null;
	BufferedReader brUrl = null;
	 
	try {
		System.out.println("ayuu0.1");
		String sdeal[]=new String[500];
		String slat[]=new String[500];
		String slong[]=new String[500];
		String sloc[]=new String[500];
		String saddr[]=new String[500];
		String surl[]=new String[500];

		ServletContext servletContext = req.getSession().getServletContext();
	
	
		
		ServletContext context = getServletContext();
		String fullPath = context.getRealPath("/WEB-INF/car details");
		
		String original = context.getRealPath("/");
		System.out.println("Real Path = " +original+ " full : "+fullPath);
		String modified="";
		
		for(int i=0;i<original.length()-4;i++)
		{
			char ch=original.charAt(i);
			modified+=ch;
		}
		//String absoluteDiskPath = servletContext.get
		
		System.out.println("path : "+modified);
		
	brDeal = new BufferedReader(new FileReader(fullPath+"\\deals.txt"));
		brLatitude = new BufferedReader(new FileReader(fullPath+"\\latitude.txt"));
		brLongitude = new BufferedReader(new FileReader(fullPath+"\\longitude.txt"));
		brLocname = new BufferedReader(new FileReader(fullPath+"\\locname.txt"));
		brLocaddress = new BufferedReader(new FileReader(fullPath+"\\locaddres.txt"));
		brUrl = new BufferedReader(new FileReader(fullPath+"\\url.txt"));
		int locID = 1;
		System.out.println("ayuu1");
		int count =0;
		while ((sloc[count] = brLocname.readLine()) != null)
		{
			//System.out.println("ent2.setproperty("loc);
			sdeal[count] = brDeal.readLine();
			slat[count] = brLatitude.readLine();
			slong[count] = brLongitude.readLine();
			saddr[count] = brLocaddress.readLine();
			surl[count] = brUrl.readLine();
			double lat = Double.parseDouble(slat[count]);
			double long1 = Double.parseDouble(slong[count]);
			System.out.println(locID+", "+sloc[count]+", "+slat[count]+", "+slong[count]+", "+saddr[count]+", "+sdeal[count]+", "+surl[count]);
			
			
			Entity ent3=new Entity("Location");
			ent3.setProperty("locid",locID);
			ent3.setProperty("catid","c2");
			ent3.setProperty("Lattitude",slat[count]);
			ent3.setProperty("Longitude",slong[count]);
			//ent3.setProperty("lname","New York");
			ent3.setProperty("address",saddr[count]);
			//ent3.setProperty("zipcode",11211);
			//ent3.setProperty("contact",2019932938);
			ent3.setProperty("Url",surl[count]);
			ent3.setProperty("Deals",sdeal[count]);
			
			datastore.put(ent3);
			
			
			count++;
			locID++;
			if(count==500)
				break;
			
			
		}

	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		try {
			if (brLocname != null)brLocname.close();
			if (brDeal != null)brDeal.close();
			if (brLatitude != null)brLatitude.close();
			if (brLongitude != null)brLongitude.close();
			if (brLocaddress != null)brLocaddress.close();
			if (brUrl != null)brUrl.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

			*/
			try
			{
		//	res.sendRedirect("json");
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
}
	}
