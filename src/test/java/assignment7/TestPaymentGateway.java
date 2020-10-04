package assignment7;

import org.junit.Assert;
import org.junit.Test;

public class TestPaymentGateway {

	@Test
    public void testTransfer() {
		
		double amount=12000.0;
		SavingsAccount sa = new SavingsAccount("ABC",10000);
		SavingsAccount sb = new SavingsAccount("DEF",11000);
		boolean expectedOutput = false;
		boolean methodOutput = PaymentGateway.transfer(sa,sb,amount);
		
		Assert.assertEquals(expectedOutput, methodOutput);
	}
	
	@Test
    public void testTransfer1() {
		
		double amount=12000.0;
		SavingsAccount sa = new SavingsAccount("ABC",15000);
		SavingsAccount sb = new SavingsAccount("DEF",11000);
		boolean expectedOutput = true;
		boolean methodOutput = PaymentGateway.transfer(sa,sb,amount);
		
		Assert.assertEquals(expectedOutput, methodOutput);
	}
}
