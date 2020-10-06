package Assignment10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainDeserialization  {

	
	public static void main(String args[]) {
		
		Employee object1 = null; 
		String filename = "src\\ExampleSerialize";
		  
        try
        {    
            
            FileInputStream file = new FileInputStream(filename); 
            ObjectInputStream in = new ObjectInputStream(file); 
              
            
            object1 = (Employee)in.readObject(); 
              
            in.close(); 
            file.close(); 
              
            System.out.println("Object has been deserialized "); 
            System.out.println("id = " + object1.id); 
            System.out.println("name = " + object1.name);
            System.out.println("salary = " + object1.salary);
        } 
          
        catch(IOException e) 
        { 
            System.out.println("IOException is caught"); 
        } 
          
        catch(ClassNotFoundException e) 
        { 
            System.out.println("ClassNotFoundException is caught"); 
        } 
  
	}
}
