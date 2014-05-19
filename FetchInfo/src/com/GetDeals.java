package com;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.Filter;
import com.google.appengine.api.datastore.Query.FilterPredicate;

public class GetDeals extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res)
	{
		String user=null;
		user=req.getParameter("user");
		Query q1 =  new Query("Location");
		 Filter filter = new FilterPredicate("user", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL,user);
		 q1.setFilter(filter);
		 DatastoreService datastore1=DatastoreServiceFactory.getDatastoreService();
		 PreparedQuery pq1 = datastore1.prepare(q1);
		 
		 JSONObject sjson=new JSONObject();
			JSONArray arr=new JSONArray();
			for (Entity re : pq1.asIterable()) {
			  
			  //String key = (String) re.getProperty("Keyword");
			/*  System.out.println("Deals : "+re.getProperty("Deals"));
			  System.out.println("Lattitude : "+re.getProperty("Lattitude"));
			  System.out.println("Longitude : "+re.getProperty("Longitude"));
			  System.out.println("Url : "+re.getProperty("Url"));
			  System.out.println("address : "+re.getProperty("address"));
			  System.out.println("lname : "+re.getProperty("lname"));
			  System.out.println();*/
				//double latt=(double)(re.getProperty("Lattitude"));
				//if(latt==0.0)
			//	{
				
				List<String> list = new ArrayList<String>();
				String category=(String)re.getProperty("Deals");
				if(category.equals("c1"))
					list.add("Movies");
				else if(category.equals("c2"))
					list.add("Car Rental");
				else if(category.equals("c3"))
					list.add("Restaurant");
				else if(category.equals("c4"))
					list.add("Shopping");
			    list.add(""+re.getProperty("Deals"));
			    list.add(""+re.getProperty("Lattitude"));
			    list.add(""+re.getProperty("Longitude"));
			    list.add(""+re.getProperty("Url"));
			    list.add(""+re.getProperty("address"));
			    list.add(""+re.getProperty("lname"));
			    JSONObject jsonn=new JSONObject();
			    jsonn.put("Sample",list);
				
			    arr.add(jsonn);
				//}
			}
			
			sjson.put("upper",arr);
			
			 res.setContentType("application/json");
			    res.setCharacterEncoding("UTF-8");
			    try {
					res.getWriter().write(sjson.toString());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		 
	}
}
