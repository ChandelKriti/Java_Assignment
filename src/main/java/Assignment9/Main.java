package Assignment9;

public class Main {
	
	public static void main (String args[]) {
		
		Factorial f = new Factorial();
		try {
			int ans = f.factorialNum(1000);
			System.out.println(ans);
		}
		catch(InvalidInputException e) {
			System.out.println(e.getMessage());
		}
		catch(FactorialException e) {
			System.out.println(e.getMessage());
		}
	}

}
