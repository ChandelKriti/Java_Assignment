package assignment14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class StudentFruits {

	Map<String, String> student_fruits = new HashMap<String, String>();
	
	
	public Map<String, String> findFruit() 
    { 
		StudentFruits s = new StudentFruits();
		
		Map<String, String> student_fruits_new = new HashMap<String, String>();
		
		student_fruits_new = s.setStudentsFruits();
		
		String value = student_fruits_new.get("ABC"); // get 
	    System.out.println("Key = ABC, Value : " + value);
	    
	    String value1 = student_fruits_new.get("MNO"); // get 
	    System.out.println("Key = MNO, Value : " + value1);
	    
	    String value2 = student_fruits_new.get("STU"); // get 
	    System.out.println("Key = STU, Value : " + value2);
		
        
	    Iterator <String> it = student_fruits_new.keySet().iterator();        
	    while(it.hasNext())  
	    {  
	    String key=(String)it.next();  
	    System.out.println("Name: "+key+"     fruit: "+student_fruits_new.get(key));  
	    }  
	    
	    return student_fruits_new;
    }
	
	
public Map<String,String> setStudentsFruits() {
		
		
	student_fruits.put("ABC","Apple");
	student_fruits.put("DEF","Banana");
	student_fruits.put("XYZ","Grapes");
	student_fruits.put("MNO","Mango");
	student_fruits.put("STU","Papaya");
	student_fruits.put("PQR","Orange");
	
		
		return student_fruits;
	}
	

}
