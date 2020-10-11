package assignment14;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StudentTest {

	@Test
	public void testInsert() {
		
		Student s =  new Student();
		
	    assertEquals(6, s.setStudents().size());
	    
	    
	  }
}
