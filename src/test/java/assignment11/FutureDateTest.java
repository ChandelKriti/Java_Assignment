package assignment11;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class FutureDateTest {

	@Test
    public void testfutureDate() throws IOException {
		
		String date = "02/05/2013";
		int day = 5;
		FutureDate fe = new FutureDate();
		String expectedOutput = "7/5/2013";
		String methodOutput = fe.futureDate(date,day);
		
		Assert.assertEquals(expectedOutput, methodOutput);
	}
	
	@Test
    public void testfutureDate1() throws IOException {
		
		String date = "18/12/2024";
		int day = 2;
		FutureDate fe = new FutureDate();
		String expectedOutput = "20/12/2024";
		String methodOutput = fe.futureDate(date,day);
		
		Assert.assertEquals(expectedOutput, methodOutput);
	}
}
