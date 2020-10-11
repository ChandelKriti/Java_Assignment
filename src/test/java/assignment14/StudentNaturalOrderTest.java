package assignment14;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StudentNaturalOrderTest {

	@Test
	public void testInsert() {
		
		StudentNaturalOrder s =  new StudentNaturalOrder();
		
	    assertEquals(6, s.setStudents().size());
	    
	    
	  }
	
}
