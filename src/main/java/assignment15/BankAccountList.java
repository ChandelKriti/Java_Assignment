package assignment15;

import java.util.*; 
  

public class BankAccountList {

	 HashSet<SavingsAccount> savings_account = new HashSet<SavingsAccount>();
	 TreeSet<SavingsAccount> treeSetSubjects = new TreeSet<SavingsAccount>(new SavingsAccountComparator());
	
	public  HashSet<SavingsAccount> savings_accountadd () 
    { 
		
		SavingsAccount sa1 = new SavingsAccount(10000.00, 1 , "ABC", true);
		SavingsAccount sa2 = new SavingsAccount(20000.00, 2 , "DEF", false);
		SavingsAccount sa3 = new SavingsAccount(30000.00, 3 , "GHI", true);
		SavingsAccount sa4 = new SavingsAccount(40000.00, 4 , "JKL", false);
		SavingsAccount sa5 = new SavingsAccount(50000.00, 5 , "MNO", true);
		SavingsAccount sa6 = new SavingsAccount(50000.00, 5 , "MNO", true);
		
		
        // Creating an empty Set 
       
  
        savings_account.add(sa1);
		savings_account.add(sa2);
		savings_account.add(sa3);
		savings_account.add(sa4);
		savings_account.add(sa5);
		savings_account.add(sa6);
		
        // Displaying the Set 
       
		//return savings_account;
		
		//System.out.println("Set: " + savings_account); 
		return savings_account;
      
    } 
	

	public TreeSet<SavingsAccount> sort ( HashSet<SavingsAccount> savings_account) 
    { 
        
        treeSetSubjects.addAll(savings_account);
       
       //System.out.println("Sorted  ");
       //System.out.println(treeSetSubjects);
        return treeSetSubjects;
    }
}
