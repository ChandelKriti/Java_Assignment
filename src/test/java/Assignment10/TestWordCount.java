package Assignment10;

import org.junit.Assert;
import org.junit.Test;

public class TestWordCount {

	
	@Test
    public void testWordount() throws Exception {
		
		String filePath = "src\\data.txt";
		WordCount fe = new WordCount();
		int expectedOutput = 6;
		int methodOutput = fe.wordCount(filePath);
		
		Assert.assertEquals(expectedOutput, methodOutput);
	}
}
