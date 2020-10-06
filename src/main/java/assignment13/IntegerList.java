package assignment13;

import java.util.ArrayList;
import java.util.List;

public class IntegerList {


	    // create an object of list using ArrayList
	    static List<Integer> numList = new ArrayList<Integer>();

	    // preparing our data
	    public static List getNumList(){

	        
	    	numList.add(2);
	    	numList.add(3);
	    	numList.add(19);
	    	numList.add(56);
	    	numList.add(12);

	        return numList;
	    }

	    public static void main( String[] args ) {

	        List<Integer> numberList = getNumList();
	    	
	    	System.out.println("list values");
	        numberList.forEach((Integer value) -> System.out.println(value));
	        
	        System.out.println("even values");
	        numberList.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
	        
	        System.out.println("odd values");
	        numberList.stream().filter(n -> n % 2 != 0).forEach(System.out::println);
	        
	        System.out.println(" values divisible by 6");
	        numberList.stream().filter(n -> n % 6 == 0).forEach(System.out::println);
	        
	        System.out.println("values less than 12");
	        numberList.stream().filter(n -> n < 12).forEach(System.out::println);
	        
	        System.out.println("values greater tha 50");
	        numberList.stream().filter(n -> n > 50).forEach(System.out::println);
	    }

	
}
