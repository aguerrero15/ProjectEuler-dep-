
public class Euler7 {
	public static void main(String[] args)
	{
		int test = 1;		// How many primes we've found, basically
		int candidate = 1;	// Which number we are currently testing
		int divider = 1;	// What we will be dividing the candidate by
		
		while (test <= 10001)
		{
			divider = 1; // Reset for each test
			candidate ++;
			while (true)
			{
				divider ++;
				if (candidate == divider)
				{
					test++; // We found one, yay!
					break;
				}
				
				else if ((candidate % divider == 0) && (candidate != divider))
					break; // Not Prime!
			}
		}
		System.out.print(candidate);
	}
}