package Assignment10;


import java.util.regex.*;
import java.util.Scanner;
import java.io.*;

public class Grep 
{
	 public static void main(String[] args) throws Exception
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the file : ");
	        String file = sc.next();
	        System.out.println("Enter the string to match : ");
	        Pattern pattern = Pattern.compile(sc.next());
	        Matcher matcher = pattern.matcher("");
	        
	        BufferedReader br = null;
	        String line;
	        int cnt = 0;
	        try
	        {
	            br = new BufferedReader(new FileReader(file));
	        }
	        catch (IOException e)
	        {
	            System.err.println("Cannot read '" + file + "': " + e.getMessage());
	        }
	        while ((line = br.readLine()) != null)
	        {
	            matcher.reset(line);
	            if (matcher.find())
	            {cnt++;
	                System.out.println(file + ": " + line);
	            }
	        }
	        System.out.println(cnt + " lines are matched");
	        br.close();
	        sc.close();
	    }
}


