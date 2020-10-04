package assignment7;

import java.util.Random;

import org.apache.logging.log4j.core.Logger;
import org.junit.Before;

public class SavingsAccount {
  String name;
  double initialBal;
 private static int accountNumber;
 
 public static Logger logger = null;
 
 @Before
 public static void loadLog4J() {
	 String log4Jpath = System.getProperty("user.dir") + "/log4j.properties";
 }
 
public SavingsAccount(String name, double initialBal) {
	super();
	this.name = name;
	this.initialBal = initialBal;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public  double getInitialBal() {
	return initialBal;
}

public void setInitialBal(int initialBal) {
	this.initialBal = initialBal;
} 

	
public double withdraw(double withdrawAmt,double initialBal) {
	if(initialBal > withdrawAmt) {
	initialBal -= withdrawAmt;
	return initialBal;
	
	}
	return 0;
}

public double deposit(double depositAmt,double initialBal) {
	initialBal += depositAmt;
	return initialBal;
}
 
public static int getAccountNumber() {
	Random rand = new Random();
	accountNumber = rand.nextInt();
	return accountNumber;
}



}
