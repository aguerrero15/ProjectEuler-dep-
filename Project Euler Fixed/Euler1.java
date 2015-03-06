
public class Euler1 {

	/**
	 * A code to sum all the multiples of 3 or 5 below 1000.
	 * author ehnoh2
	 */
	public static void main(String[] args) {
		int sum = 0; // sum is a running total of the multiples of 3 and 5
		for (int i =0; i<1000; i++){
			if(i%3== 0 || i%5==0){ // if i is divisible by 3 or 5
				sum = sum + i; // add i to sum
			}
		}
		System.out.println(sum);

	}

}
