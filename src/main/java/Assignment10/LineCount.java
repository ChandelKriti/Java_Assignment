package Assignment10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Scanner;

public class LineCount {

	public int fileLineCount(String filePath ) {
		int lineCount = 0;
		
		try {
			
			File f = new File(filePath);
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String str;
			while((str = br.readLine())!= null) {
				lineCount++;
			}
			fr.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return lineCount; 
	}
	
	
}
