package com;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

public class CreateDeals extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)
	{
		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
		
		String category=req.getParameter("catid");
		String catid="";
		if(category.equalsIgnoreCase("restaurant"))
			catid = "c3";
		if(category.equalsIgnoreCase("car"))
			catid = "c2";
		if(category.equalsIgnoreCase("movies"))
			catid = "c1";
		if(category.equalsIgnoreCase("shopping"))
			catid = "c4";
		
		
		Entity newDeal=new Entity("Location");
		newDeal.setProperty("catid",catid);
		newDeal.setProperty("Lattitude",req.getParameter("lattitude"));
		newDeal.setProperty("Longitude",req.getParameter("longitude"));
		newDeal.setProperty("lname",req.getParameter("lname"));
		newDeal.setProperty("address",req.getParameter("address"));
		
		newDeal.setProperty("contact",req.getParameter("contact"));
		newDeal.setProperty("user",req.getParameter("user"));
		datastore.put(newDeal);
		
	}
}
