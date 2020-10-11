package assignment14;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class StudentFruitTest {

	StudentFruits sf = new StudentFruits();
	@Test
	public void testInsert() {
		
	    assertEquals(6, sf.setStudentsFruits().size());
	   
	    
	  }
	
	@Test
	public void testValue() {
		
	    assertEquals("Apple", sf.findFruit().get("ABC"));
	   
	    
	  }
	
	@Test
	public void testValue1() {
		
	    assertEquals("Grapes", sf.findFruit().get("XYZ"));
	   
	    
	  }
}
