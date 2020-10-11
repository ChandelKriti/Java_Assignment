package assignment15;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class ParkedCarTest {

	
	ArrayList<Parked_CarOwner_Details> parked_carList = new ArrayList<Parked_CarOwner_Details>();
	Parked_CarOwenerList md = new Parked_CarOwenerList();
	
	Parked_CarOwner_Details md2 = new Parked_CarOwner_Details("ABC",123,321,56789,"ABC!@#");
	Parked_CarOwner_Details md3 = new Parked_CarOwner_Details("DEF",789,987,1112233,"DEF!@#");
	Parked_CarOwner_Details md4 = new Parked_CarOwner_Details("GHI",456,654,987989,"GHI!@#");
	
	@Test
	public void testInsert() {
		
	    assertEquals(1, md.add_new_car(md3).size());
	    assertEquals(2, md.add_new_car(md2).size());
	    
	  }
	
	@Test
	public void testRemove() {
	
	     md.add_new_car(md3);
	     md.add_new_car(md2);
	     md.add_new_car(md4);
	    assertEquals(2, md.remove_car(md2).size());
	    
	  }
	
	@Test
	public void testGetLoc() {
	
	     md.add_new_car(md3);
	     md.add_new_car(md2);
	     md.add_new_car(md4);
	    assertEquals(1, md.get_parked_car_location(md2));
	    
	  }
	
}
