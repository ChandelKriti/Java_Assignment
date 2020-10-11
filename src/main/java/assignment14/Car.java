package assignment14;

import java.util.ArrayList;
import java.util.Collections;

public class Car implements Comparable<Car> {

	private String make;
	private String model;
	private int year;
	private double price;
	public Car(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	@Override
	public int compareTo(Car c) {
		
		int maker = this.make.compareTo(c.make);
		return maker;
	}
	
	ArrayList<Car> car=new ArrayList<Car>(); 
	
	public ArrayList<Car> addCar( Car c){
		 
	     /* car.add(new Car("Bmw","Corolla", 2014, 2500000.00));  
	      car.add(new Car("Toyota","Mazda", 2015, 2000000.00));
	      car.add(new Car("Nissan","Murano", 2016,1800000.00));
	      car.add(new Car("Infinity","Altima",2017, 17000000.00));
	      car.add(new Car("Maruti","Corolla", 2018, 15000000.00));*/
		car.add(c);
		return car;
	      
	}
	
	public void sortCar(){  
	      
	      /*
	       * Sorting the list using Collections.sort() method, we
	       * can use this method because we have implemented the 
	       * Comparable interface in our user defined class Car
	       */
	      Collections.sort(car);
	      for(Car str:car){  
	    	  System.out.println(str.make+" "+
	          str.model+" "+str.year+" "+str.price);  
	      } 
	   }  
	
	
}
