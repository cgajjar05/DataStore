package com;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.appengine.api.datastore.*;
import com.google.appengine.api.datastore.Query.Filter;
import com.google.appengine.api.datastore.Query.CompositeFilterOperator;
import com.google.appengine.api.datastore.Query.FilterPredicate;

public class MyJSon extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res)
	{
		try
		{
			
			System.out.println("ayyuuu");
		
			int count=0;
			
			if(req.getParameter("restaurant").equals("1"))
				count+=1;
			if(req.getParameter("car").equals("1"))
				count+=2;
			if(req.getParameter("movies").equals("1"))
				count+=4;
			if(req.getParameter("shopping").equals("1"))
				count+=8;
		double longituder = Double.parseDouble(req.getParameter("longitude"));
		double lattituder = Double.parseDouble(req.getParameter("lattitude"));
		
		System.out.println(""+longituder+"\n"+lattituder);
			
			Filter finalfilter=null;
			Query q1 =  new Query("Location");
		  if(count>=8)
		  {
			
			Filter c4 = new FilterPredicate("catid", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL,"c4");
			count-=8;
			if(count>=4)
			{
				
				Filter c1 = new FilterPredicate("catid", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL,"c1");
				count-=4;
				if(count>=2)
				{
					
					Filter c2 = new FilterPredicate("catid", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL,"c2");
					count-=2;
					if(count>0)
					{
						Filter c3 = new FilterPredicate("catid", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL,"c3");
						 finalfilter = CompositeFilterOperator.or(c1,c2,c3,c4);
					}
					else
					{
						 finalfilter = CompositeFilterOperator.or(c1,c2,c4);
					}
					
				}
				else if(count>0)
				{
					Filter c3 = new FilterPredicate("catid", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL,"c3");
					 finalfilter = CompositeFilterOperator.or(c1,c3,c4);
				}
				else
				{
					 finalfilter = CompositeFilterOperator.or(c1,c4);
				}
			}
			else if(count>=2)
			{
				
				Filter c2 = new FilterPredicate("catid", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL,"c2");
				count-=2;
				if(count>0)
				{
					Filter c3 = new FilterPredicate("catid", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL,"c3");
					 finalfilter = CompositeFilterOperator.or(c2,c3,c4);
				}
				else
				{
					 finalfilter = CompositeFilterOperator.or(c2,c4);
				}
			}
			else if(count>0)
			{
				Filter c3 = new FilterPredicate("catid", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL,"c3");
				 finalfilter = CompositeFilterOperator.or(c3,c4);
			}
			else
			{
				 finalfilter = CompositeFilterOperator.or(c4,c4);
			}
		  }
		  else if(count>=4)
			{
				
				Filter c1 = new FilterPredicate("catid", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL,"c1");
				count-=4;
				if(count>=2)
				{
					
					Filter c2 = new FilterPredicate("catid", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL,"c2");
					count-=2;
					if(count>0)
					{
						Filter c3 = new FilterPredicate("catid", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL,"c3");
						 finalfilter = CompositeFilterOperator.or(c1,c2,c3);
					}
					else
					{
						 finalfilter = CompositeFilterOperator.or(c1,c2);
					}
				}
				else if(count>0)
				{
					Filter c3 = new FilterPredicate("catid", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL,"c3");
					 finalfilter = CompositeFilterOperator.or(c1,c3);
				}
				else
				{
					 finalfilter = CompositeFilterOperator.or(c1,c1);
				}
			}
			else if(count>=2)
			{
				
				Filter c2 = new FilterPredicate("catid", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL,"c2");
				count-=2;
				if(count>0)
				{
					Filter c3 = new FilterPredicate("catid", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL,"c3");
					 finalfilter = CompositeFilterOperator.or(c2,c3);
				}
				else
				{
					 finalfilter = CompositeFilterOperator.or(c2,c2);
				}
			}
			else if(count>0)
			{
				Filter c3 = new FilterPredicate("catid", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL,"c3");
				 finalfilter = CompositeFilterOperator.or(c3,c3);
			}
		  
		  count = 0;
		  double lat=lattituder;
		  double lon=longituder;
		  Filter lat1 = new FilterPredicate("Lattitude", com.google.appengine.api.datastore.Query.FilterOperator.GREATER_THAN_OR_EQUAL,(lat-0.1445));
		  Filter lat2 = new FilterPredicate("Lattitude", com.google.appengine.api.datastore.Query.FilterOperator.LESS_THAN_OR_EQUAL,(lat+0.1445));
		  Filter lon1 = new FilterPredicate("Lattitude", com.google.appengine.api.datastore.Query.FilterOperator.GREATER_THAN_OR_EQUAL,(lon-0.1484));
		  Filter lon2 = new FilterPredicate("Lattitude", com.google.appengine.api.datastore.Query.FilterOperator.LESS_THAN_OR_EQUAL,(lon+0.1484));
		  
		  Filter locFinal = CompositeFilterOperator.and(lat1,lat2,lon1,lon2);
		  
		  Filter c2 = new FilterPredicate("catid", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL,"c3");
		  Filter c3 = new FilterPredicate("catid", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL,"c3");
		//  Filter finalfilter = CompositeFilterOperator.or(c2,c3);
		  
		  
		  JSONObject sjson=new JSONObject();
			JSONArray arr=new JSONArray();
		  
		  
		  if(finalfilter==null)
		  {
			  q1.setFilter(locFinal);
			  System.out.println("ahi");
		  }
		  else
		  {
		  Filter finalf = CompositeFilterOperator.and(finalfilter,locFinal);
		  q1.setFilter(finalf);
		  
		  //q1.setFilter(lat);
		  //.addFilter("Lattitude",com.google.appengine.api.datastore.Query.FilterOperator.GREATER_THAN_OR_EQUAL,"40.75")
		  //q1.setFilter("lastName == lastNameParam");
		//  q1.addFilter("catid", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL,"c3");
		 // q1.addFilter("catid", com.google.appengine.api.datastore.Query.FilterOperator.IN,"c2");
		//  q1.addFilter("catid", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL,"c1");
		
		  DatastoreService datastore1=DatastoreServiceFactory.getDatastoreService();
			// Use PreparedQuery interface to retrieve results
		   
			PreparedQuery pq1 = datastore1.prepare(q1);
			
		
			
			String keys[]=new String[pq1.countEntities()];
			
			
			
			int no=0;
			
			for (Entity re : pq1.asIterable()) {
			 
				if(no==20)
					break;
				no++;
			  //String key = (String) re.getProperty("Keyword");
			/*  System.out.println("Deals : "+re.getProperty("Deals"));
			  System.out.println("Lattitude : "+re.getProperty("Lattitude"));
			  System.out.println("Longitude : "+re.getProperty("Longitude"));
			  System.out.println("Url : "+re.getProperty("Url"));
			  System.out.println("address : "+re.getProperty("address"));
			  System.out.println("lname : "+re.getProperty("lname"));
			  System.out.println();*/
			//	double latt=(double)(re.getProperty("Lattitude"));
				//if(latt==0.0)
			//	{
				
				List<String> list = new ArrayList<String>();
				String category=(String)re.getProperty("catid");
				
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
		  }
			sjson.put("upper",arr);
			/*List<String> list = new ArrayList<String>();
		    list.add("item1");
		    list.add("item2");
		    list.add("item3");
		    JSONObject jsonn=new JSONObject();
		    jsonn.put("Sample",list);*/
		    System.out.println("My json : "+sjson.toString());
			
			
			
		    res.setContentType("application/json");
		    res.setCharacterEncoding("UTF-8");
		    res.getWriter().write(sjson.toString());
			
		    
	
			
			/*List<String> list = new ArrayList<String>();
	    list.add("item1");
	    list.add("item2");
	    list.add("item3");
	    JSONObject jsonn=new JSONObject();
	    jsonn.put("Sample",list);

	    res.setContentType("application/json");
	    res.setCharacterEncoding("UTF-8");
	    
	    String newjson="[    {      \"Prime\": false,      \"Distance\": 0.0,      \"UnitNumber\": 2110,      \"AddressLine1\": \"66 Third Ave (11th St.)\",      \"AddressLine2\": null,      \"City\": \"New York\",      \"Latitude\": 40.7314380000,      \"Longitude\": -73.9887010000,      \"PostalCode\": \"10003\",      \"State\": \"NY\",      \"StateName\": \"New York\",       \"TheatreName\": \"AMC Loews Village 7\",      \"LongName\": \"AMC Loews Village 7\",      \"PhoneNumber\": \"888-AMC-4FUN\",      \"GuestServicesPhoneNumber\": \"2129822116\",      \"WebsiteUrl\": \"/movie-theatres/amc-loews-village-7\",      \"TheatreImageStandardUrl\": \"https://cdn.amctheatres.com/theatres/images/Primary/Standard/fallback-2.jpg\",      \"TheatreImageThumbUrl\": \"https://cdn.amctheatres.com/theatres/images/Primary/Thumb/fallback-2.jpg\",      \"TheatreImageIconUrl\": \"https://cdn.amctheatres.com/theatres/images/StoreIcon/Thumb/fallback-2.jpg\",      \"IMAX\": false,      \"CinemaSuites\": false,      \"ForkAndScreen\": false,      \"ThreeD\": true,      \"ETX\": false,      \"AMCIndependent\": true,      \"TheatreAddress\": \"66 Third Ave (11th St.), New York, NY 10003\",      \"OnlineTicketSales\": \"AMC\"    },    {      \"Prime\": false,      \"Distance\": 0.5,      \"UnitNumber\": 2112,      \"AddressLine1\": \"890 Broadway\",      \"AddressLine2\": null,      \"City\": \"New York\",      \"Latitude\": 40.7385120000,      \"Longitude\": -73.9898370000,      \"PostalCode\": \"10003\",      \"State\": \"NY\",      \"StateName\": \"New York\",      \"TheatreName\": \"AMC Loews 19th St. East 6\",      \"LongName\": \"AMC Loews 19th St. East 6\",      \"PhoneNumber\": \"888-AMC-4FUN\",      \"GuestServicesPhoneNumber\": \"2122608173\",      \"WebsiteUrl\": \"/movie-theatres/amc-loews-19th-st-east-6\",      \"TheatreImageStandardUrl\": \"https://cdn.amctheatres.com/theatres/images/Primary/Standard/fallback-2.jpg\",      \"TheatreImageThumbUrl\": \"https://cdn.amctheatres.com/theatres/images/Primary/Thumb/fallback-2.jpg\",      \"TheatreImageIconUrl\": \"https://cdn.amctheatres.com/theatres/images/StoreIcon/Thumb/fallback-2.jpg\",      \"IMAX\": false,      \"CinemaSuites\": false,      \"ForkAndScreen\": false,      \"ThreeD\": true,      \"ETX\": false,      \"AMCIndependent\": true,      \"TheatreAddress\": \"890 Broadway, New York, NY 10003\",      \"OnlineTicketSales\": \"AMC\"    },    {      \"Prime\": false,      \"Distance\": 1.0,      \"UnitNumber\": 2195,      \"AddressLine1\": \"570 Second Avenue\",      \"AddressLine2\": null,      \"City\": \"New York\",      \"Latitude\": 40.7428920000,      \"Longitude\": -73.9769140000,      \"PostalCode\": \"10016\",      \"State\": \"NY\",      \"StateName\": \"New York\",      \"TheatreName\": \"AMC Loews Kips Bay 15\",      \"LongName\": \"AMC Loews Kips Bay 15\",      \"PhoneNumber\": \"888-AMC-4FUN\",      \"GuestServicesPhoneNumber\": \"2124470638\",      \"WebsiteUrl\": \"/movie-theatres/amc-loews-kips-bay-15\",      \"TheatreImageStandardUrl\": \"https://cdn.amctheatres.com/theatres/images/Primary/Standard/2195.jpg\",      \"TheatreImageThumbUrl\": \"https://cdn.amctheatres.com/theatres/images/Primary/Thumb/2195.jpg\",      \"TheatreImageIconUrl\": \"https://cdn.amctheatres.com/theatres/images/StoreIcon/Thumb/fallback-2.jpg\",      \"IMAX\": true,      \"CinemaSuites\": false,      \"ForkAndScreen\": false,      \"ThreeD\": true,      \"ETX\": false,      \"AMCIndependent\": true,      \"TheatreAddress\": \"570 Second Avenue, New York, NY 10016\",      \"OnlineTicketSales\": \"AMC\"    }   ]";
	    
	    res.getWriter().write(newjson);*/
		    
		    
	    System.out.println("gayuuu");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
