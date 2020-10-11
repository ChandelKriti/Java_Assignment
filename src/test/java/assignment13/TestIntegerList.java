package assignment13;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestIntegerList {

	IntegerList il = new IntegerList();
	
	@Test
	public void testInsert() {
		
	    assertEquals(5, il.getNumList().size());
	   
	    
	  }
	
	@Test
	public void operationsTest(){
		il.integerList();
	}
}
