
public class Euler1 {
	public static void main(String[] args) 
	{
		// Easy info
		int nThrees = 333; // There are 333 multiples of 3 up to 1000
		int nFives = 199;  // There are 199 multiples of 5 up to (but not including) 1000
		int nFifteens = 66;// There are 66 multiples of 15 up to 1000
		
		// Summations are below
		int nSumThrees = (summation(nThrees) * 3);
		int nSumFives = (summation(nFives) * 5);
		int nSumFifteens = (summation(nFifteens) * 15);
		
		// Final calculation
		int finalSum = (nSumThrees + nSumFives - nSumFifteens);
		System.out.println(finalSum);
		
		/* This works well because 3s and 5s share the fifteens.
		 * Simply add up all the 3s and 5s, and subtract the fifteens.
		 * Easy. I did this on my calculator initially but apparently 
		 * we need to program something, so here it is.
		 */
		
	}
    public static int summation(int n)
    {
        int totalSum = 0;
        for (int i = 0; i <= n; i++)
            totalSum += i;
        return totalSum;
    }
}
