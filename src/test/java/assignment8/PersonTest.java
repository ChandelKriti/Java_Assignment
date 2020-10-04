package assignment8;

import org.junit.Assert;
import org.junit.Test;


public class PersonTest {
	
	@Test
    public void TestOlderOne() {
		
		Person p = new Person("ABC", 12, 9, 1998);
		Person p1 = new Person("DEF", 8, 4 , 1999);
		
		String expectedOutput = "ABC is older than DEF by 0 years 6 months 27days";
		String methodOutput = p.olderOne(p1);
		
		Assert.assertEquals(expectedOutput, methodOutput);
	}
	
	@Test
    public void TestOlderOne1() {
		
		Person p = new Person("ABC", 8, 4, 1999);
		Person p1 = new Person("DEF",  12, 6 , 1996);
		
		String expectedOutput = "DEF is older than ABC by 2 years 9 months 27days";
		String methodOutput = p.olderOne(p1);
		
		Assert.assertEquals(expectedOutput, methodOutput);
	}
	

}
