package assignment14;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class TestCar {

	ArrayList<Car> car=new ArrayList<Car>(); 
	Car c1 = new  Car("Toyota","Mazda", 2015, 2000000.00) ;
	Car c2 = new Car ("Nissan","Murano", 2016,1800000.00);
	
	@Test
	public void testInsert() {
		
	    assertEquals(1, c1.addCar(c1).size());
	    //assertEquals(2, c2.addCar(c2).size());
	    
	  }
	
	@Test
	public void testInsert2() {
		
	    assertEquals(1, c1.addCar(c1).size());
	   assertEquals(2, c2.addCar(c2).size());
	    
	  }
}
