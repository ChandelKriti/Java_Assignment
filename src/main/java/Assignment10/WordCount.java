package Assignment10;

import java.io.BufferedReader;
import java.io.FileReader;

public class WordCount {

	
	public int wordCount(String filePath) throws Exception {  
        String line;  
        int count = 0;  
          
        FileReader file = new FileReader(filePath);  
        BufferedReader br = new BufferedReader(file);  
 
        while((line = br.readLine()) != null) {  
            //Splits each line into words  
            String words[] = line.split(" ");  
            //Counts each word  
            count = count + words.length;  
        }  
           
        br.close();
		return count;  
    }  
}
