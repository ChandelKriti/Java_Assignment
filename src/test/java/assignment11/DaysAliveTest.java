package assignment11;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class DaysAliveTest {

	
	@Test
    public void testDaysAlive() throws IOException {
		
		int date  = 9;
		int month = 10;
		int year = 2012;
		DaysAlive fe = new DaysAlive();
		int expectedOutput = 732010;
		int methodOutput = fe.daysAlive(date,month,year);
		
		Assert.assertEquals(expectedOutput, methodOutput);
	}
	
}
