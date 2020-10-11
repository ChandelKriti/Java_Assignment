package assignment13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

	
	PerformOperation op;
	  boolean ret = false;
	  String ans = null;
	  
	 public void operations() throws IOException {
	 //Streams2 ob = new Streams2();
		 System.out.println("enter the no.");
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  int T = Integer.parseInt(br.readLine());
	  
	  while (T--> 0) {
	   String s = br.readLine().trim();
	   StringTokenizer st = new StringTokenizer(s);
	   int ch = Integer.parseInt(st.nextToken());
	   int num = Integer.parseInt(st.nextToken());
	   if (ch == 1) {
	    ans = odd(num);
	   } else if (ch == 2) {
	    
	    ans = prime(num);
	   } else if (ch == 3) {
	   
	    ans = palindrome(num);

	   }
	   //System.out.println(ans);
	  }
	 }
	 
	 public String odd(int num) {
		 op = Streams2.isOdd();
		    ret = Streams2.checker(op, num);
		    ans = (ret) ? "ODD" : "EVEN";
		    return ans;
	 }
	 
	 public String prime(int num) {
		 op = Streams2.isPrime();
		    ret = Streams2.checker(op, num);
		    ans = (ret) ? "PRIME" : "COMPOSITE";
		    return ans;
	 }
	 
	 public String palindrome(int num) {
		 op = Streams2.isPalindrome();
		    ret = Streams2.checker(op, num);
		    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";
		    return ans;
	 }
	}
