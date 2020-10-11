package assignment15;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.TreeSet;

import org.junit.Test;

public class TestBankAccount {

	
	BankAccountList b = new BankAccountList();
	HashSet<SavingsAccount> savings_account = new HashSet<SavingsAccount>(); 
	TreeSet<SavingsAccount> treeSetSubjects = new TreeSet<SavingsAccount>(new SavingsAccountComparator());
	
	SavingsArrayList sa = new SavingsArrayList();
	
	@Test
	public void testInsert() {
		
	    assertEquals(5,b.savings_accountadd().size());
	    
	  }
	
}
