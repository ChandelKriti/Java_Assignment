package Assignment9;


public class Factorial {

	
	public int factorialNum(int n) throws InvalidInputException , FactorialException{
		int f=1;
		if(n<2) {
			throw new InvalidInputException("input should be greater than or equal to 2 ");
		}
		else {
		for(int i=n;i>1;i--) {
			
			if(f == 2147483647) {
				throw new FactorialException("Factorial exceeds the limit");
			}
			f=f*i;
		}
		}
		
		
		return f;
	}

}
