package assignment12;



import java.io.File;

import org.junit.Test;

import assignment12.SortFilesDirectories;


public class FilesTest {

	@Test
	 public void getFilesFolders() {
		 
		 SortFilesDirectories f = new SortFilesDirectories();
		 
         f.allDirectories(new File("C:\\Program Files\\Java\\jre1.8.0_162"));
	        System.out.println("========================");
	        f.allFiles(new File("C:\\Program Files\\Java\\jre1.8.0_162"));
	        System.out.println("========================");
	        f.sortDirectoryContent(new File("C:\\Program Files\\Java\\jre1.8.0_162"));
	    }
}
