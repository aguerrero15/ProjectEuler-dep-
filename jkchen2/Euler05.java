
public class Euler05 {

//	2520 is the smallest number that can be divided by each of the numbers from
//	1 to 10 without any remainder.
//
//	What is the smallest positive number that is evenly divisible by all of the
//	numbers from 1 to 20?
			
	public static void main(String[] args) {
		
		long i = 2520;
		
		// Runs through all possible numbers in increments of 20
		for ( ; !isDivisible(i); i += 20) {
		}
		
		System.out.println(i);

	}
	
	// Checks if the number is divisible by 1 through 20
	public static boolean isDivisible(long num) {
		for (int i = 1; i <= 20; i++) {
			if (num % i != 0)
				return false;
		}
		return true;
	}
}
