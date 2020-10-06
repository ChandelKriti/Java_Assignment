package assignment11;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class TodayDateTest {

	@Test
    public void testTodayDate() throws IOException {
		
		
		TodayDate fe = new TodayDate();
		String expectedOutput = "Wed, October 07, 2020";
		String methodOutput = fe.todayDate();
		
		Assert.assertEquals(expectedOutput, methodOutput);
	}
	
}
