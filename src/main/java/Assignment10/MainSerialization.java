package Assignment10;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainSerialization {

	
	
    public static void main (String args[]) {
    	
    	Employee object = new Employee(1, "ABC", 30000.00); 
    	String filename = "src\\ExampleSerialize"; 
    // Serialization  
    try
    {    
        
        FileOutputStream file = new FileOutputStream(filename); 
        ObjectOutputStream out = new ObjectOutputStream(file); 
          
        out.writeObject(object); 
          
        out.close(); 
        file.close(); 
          
        System.out.println("Object has been serialized"); 

    } 
      
    catch(IOException ex) 
    { 
        System.out.println("IOException is caught"); 
    } 
    
    
    
    
    }
}
