package assignment7;

import org.junit.Assert;
import org.junit.Test;

public class SavingsAccountTest {

	
	@Test
    public void testWithdraw() {
		
		String name="Kriti";
		double initialBal=10000.00;
		double withdraw_amount = 5000.00;
		SavingsAccount sa = new SavingsAccount(name,initialBal);
		double expectedOutput = 5000.00;
		double methodOutput = sa.withdraw(withdraw_amount,initialBal);
		Assert.assertEquals(expectedOutput, methodOutput,0);
	}
	
	@Test
    public void testWithdraw1() {
		
		String name="Kriti";
		double initialBal=10000.00;
		double withdraw_amount = 11000.00;
		SavingsAccount sa = new SavingsAccount(name,initialBal);
		double expectedOutput = 0.00;
		double methodOutput = sa.withdraw(withdraw_amount,initialBal);
		
		Assert.assertEquals(expectedOutput, methodOutput,0);
	}
	
	@Test
    public void testDeposit() {
		
		String name="Kriti";
		double initialBal=10000.00;
		double deposit_amount = 5000.00;
		SavingsAccount sa = new SavingsAccount(name,initialBal);
		double expectedOutput = 15000.00;
		double methodOutput = sa.deposit(deposit_amount,initialBal);
		
		Assert.assertEquals(expectedOutput, methodOutput,0);
	}
	
	
	
	
}
