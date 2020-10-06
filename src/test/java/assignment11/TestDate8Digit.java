package assignment11;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;


public class TestDate8Digit {

	
	/*@Test
    public void testDate8Digit() throws IOException {
		
		String date = "02052013";
		Date8Digit fe = new Date8Digit();
		String expectedOutput = "02 May, 2013";
		String methodOutput = fe.date8Digit(date);
		
		Assert.assertEquals(expectedOutput, methodOutput);
	}*/
	
	@Test
    public void testDate8Digit1() throws IOException {
		
		String date = "02052013";
		Date8Digit fe = new Date8Digit();
		String expectedOutput = "02/05/2013";
		String methodOutput = fe.date8Digit(date);
		
		Assert.assertEquals(expectedOutput, methodOutput);
	}
	
	@Test
    public void testDate8Digit3() throws IOException {
		
		String date = "12111963";
		Date8Digit fe = new Date8Digit();
		String expectedOutput = "12/11/1963";
		String methodOutput = fe.date8Digit(date);
		
		Assert.assertEquals(expectedOutput, methodOutput);
	}
	
	@Test
    public void testDate8Digit2() throws IOException {
		
		String date = "252013";
		Date8Digit fe = new Date8Digit();
		String expectedOutput = "Wrong Input";
		String methodOutput = fe.date8Digit(date);
		
		Assert.assertEquals(expectedOutput, methodOutput);
	}
	
	
	
	
}
