
public class Euler03 {

//	The prime factors of 13195 are 5, 7, 13 and 29.
//
//	What is the largest prime factor of the number 600851475143 ?

	public static void main(String[] args) {
		
		long largestprime = 0;
		long stupid = 600851475143L;
		
		for (int i = 1; i < stupid; i += 2) {
			
			// For every divisible iteration, divide the original number
			// to exponentially reduce the number of test cases.
			if (stupid % i == 0){
				stupid = stupid / i;
			}
			
		}
		
		// The last value is then the largest prime
		largestprime = stupid;
		
		System.out.println(largestprime);

	}

}
