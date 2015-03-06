
public class Euler2 {

	/**
	 * find the sum of the even-numbered terms in the Fibonacci sequence below one million
	 * author: ehnoh2
	 */
	public static void main(String[] args) {
		int total = 0; //running sum of even terms
		int j = 1; // previous Fibonacci term
		int k = 0; // next previous Fibonacci term
		int i = j + k; // current Fibonacci term
		while(i<4000000){
			if(i%2==0){ //if term is even
				total = total + i; //add i to running total
			}
			i = j+k; //i becomes sum of next two terms
			k = j;	//k advancing the second previous term
			j = i; //j becomes the previous term
			
		}
		System.out.println(total);
	}
}
