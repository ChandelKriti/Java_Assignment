package assignment14;

import java.util.ArrayList;
import java.util.Collections;

public class StudentNaturalOrder {

	ArrayList<String> student = new ArrayList<String>(); 

	public ArrayList<String> naturalOrder() 
    { 
		ArrayList<String> studentNew = new ArrayList<String>();
		Student s = new Student();
		studentNew  = s.setStudents();
		Collections.sort(studentNew);
        //System.out.println(studentNew ); 
        for(String str: studentNew) System.out.print(" "+str);
        return studentNew;
  
    }
	
	public ArrayList<String> setStudents() {
		student.add("ABC"); 
		student.add("DEF");
		student.add("XYZ");
		student.add("MNO");
		student.add("STU");
		student.add("PQR");
		
		return student;
	}
}