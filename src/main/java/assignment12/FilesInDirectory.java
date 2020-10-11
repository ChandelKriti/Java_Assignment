package assignment12;

import java.io.*; 

public class FilesInDirectory {

 
	    	public File getFiles() {
	    	    // Folder from which files are fetched
	    	    File file = new File("C:\\Program Files\\Java\\jre1.8.0_162");
	    	    // Implemented as lambda. filter all the files
	    	    // having .txt extension
	    	    File[] fileList = file.listFiles((d,f)-> f.toLowerCase().endsWith(".txt"));
	    	    // Listing all the included files
	    	    for(File f : fileList) {
	    	      System.out.println(f.getName());
	    	    }
				return file;
	    	  }
}
