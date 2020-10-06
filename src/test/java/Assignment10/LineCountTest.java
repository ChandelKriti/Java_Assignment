package Assignment10;

import org.junit.Assert;
import org.junit.Test;

public class LineCountTest {

	
@Test
    public void testLineCount() {
		
		String filePath = "src\\data.txt";
		LineCount lc = new LineCount();
		int expectedOutput = 3;
		int methodOutput = lc.fileLineCount(filePath);
		
		Assert.assertEquals(expectedOutput, methodOutput);
	}

	
}
