
public class MultiplesOf3And5 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(multiples(1,0));
	}
	public static int multiples(int n, int c)
	{
		if(n == 1000) return c;
		if(n%3 == 0 || n%5 == 0) c += n;
		return multiples(n+1,c);
	}
}
