package assignment15;

import java.util.Comparator;

public class SavingsAccountComparator implements Comparator<SavingsAccount> {

	public int compare(SavingsAccount s1, SavingsAccount s2 ) {
        return s1.getAccId() - s2.getAccId() ;
    }  
}
