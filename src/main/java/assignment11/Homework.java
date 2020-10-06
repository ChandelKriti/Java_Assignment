package assignment11;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Map.*;

public class Homework {

	
		static Scanner sc = new Scanner(System.in);
		static HashMap<Date, String> hwmap = new HashMap<Date, String>();
		static DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");


		public static void main (String[] args) throws ParseException
		{
			//Insertion
			hwmap.put(dateFormat.parse("31-05-2011"),"Assignment-1");
			hwmap.put(dateFormat.parse("01-06-2011"),"Assignment-2");
			hwmap.put(dateFormat.parse("10-06-2011"),"Assignment-4");
			hwmap.put(dateFormat.parse("25-05-2011"),"Assignment-3");
			 

			//Display
			System.out.println("Actual list of Assignments" );
			if(!hwmap.isEmpty()) {
		         Iterator it = hwmap.entrySet().iterator();
		         while(it.hasNext()) {
		            Map.Entry obj = (Entry)it.next();
		            System.out.println("key = " + obj.getKey() + "Value = " +obj.getValue() );
		         }
			}
			//Remove
			
			hwmap.remove(dateFormat.parse("01-06-2011")); 
			
			
			//sort
			
			TreeMap<Date, String> sorted = new TreeMap<>(); 
			  
	        // Copy all data from hashMap into TreeMap 
	        sorted.putAll(hwmap); 
	  
	        // Display the TreeMap which is naturally sorted 
	        
	        System.out.println("\n list of Assignments after removal and sorting" );
	        for (Map.Entry<Date, String> entry : sorted.entrySet())  {
	            System.out.println("Key = " + entry.getKey() +  
	                         ", Value = " + entry.getValue()); 
			
		}
		
}
		}



