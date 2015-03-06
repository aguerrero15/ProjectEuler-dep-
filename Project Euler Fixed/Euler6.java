
public class Euler6 {

	/**
	 * Euler Problem 6: Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
	 * ehnoh2
	 */
	public static void main(String[] args) {
		int num1 = 0;  // sum of the squares
		int num2 = 0; // square of the sum
		
		for(int i=1;i<=100;i++)
		{
			num1 = num1 + i*i;
			num2 = num2 + i;
		}
		num2 = num2*num2;
		
		System.out.println(num2-num1);

	}

}
