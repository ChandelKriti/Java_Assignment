package Assignment10;


import org.junit.Assert;
import org.junit.Test;

public class FileExistTest {

	
	@Test
    public void testFileExist() {
		
		String filePath = "src\\data.txt";
		FileExist fe = new FileExist();
		boolean expectedOutput = true;
		boolean methodOutput = fe.fileExist(filePath);
		
		Assert.assertEquals(expectedOutput, methodOutput);
	}
	
	
	@Test
    public void testFileExist1() {
		
		String filePath = "src\\example.txt";
		FileExist fe = new FileExist();
		boolean expectedOutput = false;
		boolean methodOutput = fe.fileExist(filePath);
		
		Assert.assertEquals(expectedOutput, methodOutput);
	}
}


