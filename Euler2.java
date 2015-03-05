
public class Euler2 {
	public static void main(String[] args) 
	{
		/* The Fibonacci pattern is pretty simple, and it has the property
		 * of being even odd odd even odd odd even.... so this shouldn't be
		 * much of a problem.
		 */
		int currentFib = 2;  // Let's start at the first significant number...
		int previousFib = 1; // And it's previous value.
		int temp;

		int currentSum = 0;
		
		while (currentFib < 4000000)
			{
			if (currentFib % 2 == 0)
				currentSum = currentSum + currentFib;
			temp = previousFib;				//Messy way to get to the next Fib.
			previousFib = currentFib;
			currentFib = temp + currentFib;
			}
		System.out.print(currentSum);
	
	}
}
