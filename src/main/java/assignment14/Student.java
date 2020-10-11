package assignment14;

import java.util.ArrayList;

public class Student {
	
	 ArrayList<String> student = new ArrayList<String>(); 
 
	public void printList(String s) 
    { 
		Student s1 = new Student();
		
        //System.out.println("Original List : \n" + s.setStudents() ); 
		for(String str: s1.setStudents()) System.out.print(" "+str);
	
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
