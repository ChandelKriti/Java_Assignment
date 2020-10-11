package assignment13;

import static org.junit.Assert.assertEquals;

import java.util.StringTokenizer;

import org.junit.Test;

public class TestSolution {
	
	Solution s = new Solution();
	
	@Test
	public void oddEvenTest(){
		
		 int num = 5;
		 assertEquals("ODD",s.odd(num));
	}
	
	@Test
	public void oddEvenTest1(){
		
		 int num = 6;
		 assertEquals("EVEN",s.odd(num));
	}
	
	@Test
	public void primeCompositeTest1(){
		
		 int num = 5;
		 assertEquals("PRIME",s.prime(num));
	}
	
	@Test
	public void primeCompositeTest2(){
		
		 int num = 4;
		 assertEquals("COMPOSITE",s.prime(num));
	}
	
	@Test
	public void palindromeTest1(){
		
		 int num = 989;
		 assertEquals("PALINDROME",s.palindrome(num));
	}
	
	@Test
	public void palindromeTest2(){
		
		 int num = 809;
		 assertEquals("NOT PALINDROME",s.palindrome(num));
	}
}
