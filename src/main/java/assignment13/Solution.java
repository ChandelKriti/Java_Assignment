package assignment13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

	 public static void main(String[] args) throws IOException {
	 //Streams2 ob = new Streams2();
		 System.out.println("enter the no.");
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  int T = Integer.parseInt(br.readLine());
	  PerformOperation op;
	  boolean ret = false;
	  String ans = null;
	  while (T--> 0) {
	   String s = br.readLine().trim();
	   StringTokenizer st = new StringTokenizer(s);
	   int ch = Integer.parseInt(st.nextToken());
	   int num = Integer.parseInt(st.nextToken());
	   if (ch == 1) {
	    op = Streams2.isOdd();
	    ret = Streams2.checker(op, num);
	    ans = (ret) ? "ODD" : "EVEN";
	   } else if (ch == 2) {
	    op = Streams2.isPrime();
	    ret = Streams2.checker(op, num);
	    ans = (ret) ? "PRIME" : "COMPOSITE";
	   } else if (ch == 3) {
	    op = Streams2.isPalindrome();
	    ret = Streams2.checker(op, num);
	    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

	   }
	   System.out.println(ans);
	  }
	 }
	}
