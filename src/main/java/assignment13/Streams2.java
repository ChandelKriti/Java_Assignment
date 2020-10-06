package assignment13;
interface PerformOperation {
	 boolean check(int a);
	}

class Streams2 {
 
	public static boolean checker(PerformOperation p, int num) {
		  return p.check(num);
		 }
		public static PerformOperation isOdd() {
		        return n -> (n & 1) == 1;
		    }

		    public static PerformOperation isPrime() {
		        return n -> {
		            if (n < 2) {
		                return false;
		            } else if (n == 2) {
		                return true;
		            } else if (n % 2 == 0) {
		                return false;
		            }
		            int sqrt = (int) Math.sqrt(n);
		            for (int i = 3; i <= sqrt; i += 2) {
		                if (n % i == 0) {
		                    return false;
		                }
		            }
		            return true;
		        };
		    }

		    public static PerformOperation isPalindrome() {
		        return n -> {
		            String original = Integer.toString(n);
		            String reversed = new StringBuilder(Integer.toString(n)).reverse().toString();
		            return original.equals(reversed);
		        };
		    }
}
   
