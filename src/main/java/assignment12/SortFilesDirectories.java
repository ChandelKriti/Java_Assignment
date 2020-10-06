package assignment12;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;


public class SortFilesDirectories {

	    public static void allDirectories(File file) {
	        File[] listOfFiles = file.listFiles(pathname -> true);
	        if (listOfFiles != null) {
	            for (File listOfFile : listOfFiles) {
	                if (listOfFile.isDirectory()) {
	                    allDirectories(listOfFile);
	                    System.out.printf("Directory: %s%n", listOfFile.getAbsolutePath());
	                }
	            }
	        }
	    }

	    public static void allFiles(File file) {
	        File[] listOfFiles = file.listFiles(pathname -> true);
	        for (File listOfFile : listOfFiles) {
	            if (listOfFile.isFile()) {
	                System.out.printf("File: %s%n", listOfFile.getName());
	            } else {
	                allFiles(listOfFile);
	            }
	        }
	    }

	    
	    public static void sortDirectoryContent(File file) {
	        File[] files = file.listFiles();
	        Arrays.sort(files, Comparator.comparing(File::isDirectory));
	        Arrays.toString(files);
	    }

	    public static void main(String[] args) {
            allDirectories(new File("C:\\Program Files\\Java\\jre1.8.0_162"));
	        System.out.println("========================");
	        allFiles(new File("C:\\Program Files\\Java\\jre1.8.0_162"));
	        System.out.println("========================");
	        sortDirectoryContent(new File("C:\\Program Files\\Java\\jre1.8.0_162"));
	    }
}
