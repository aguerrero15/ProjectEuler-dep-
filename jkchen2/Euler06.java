
public class Euler06 {

//	Find the difference between the sum of the squares of the first one
//	hundred natural numbers and the square of the sum.
	
	public static void main(String[] args) {
		
		long sumsquare = 0;
		long squaresum = 0;
		
		for (int i = 1; i <= 100; i++) {
			sumsquare += i * i;
		}
		
		for (int i = 1; i <= 100; i++) {
			squaresum += i;
		}	squaresum *= squaresum;
		
		System.out.println(squaresum - sumsquare);
		
	}

}
