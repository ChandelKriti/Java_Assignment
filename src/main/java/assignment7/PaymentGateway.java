package assignment7;

public class PaymentGateway {

	
	
	//method to transfer the given amount from the src to target account.
		public static boolean transfer(SavingsAccount sender, SavingsAccount reciever, double amount) 
		{
			if(sender.initialBal > amount) {
				return true;
			}
			else return false;
		}
		
		public static void main(String args[]) {
		int number = SavingsAccount.getAccountNumber();
		System.out.println(number);
		}
}
