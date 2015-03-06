
public class LargestPrimeFactor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(prime(600851475143L,6008514751L));
	}
	public static long prime(long n,long c)
	{
		if(c == 0L) return 0;
		if(n%c==0 && prime(c,c-1)==0) return c;
		return prime(n,c-1);
	}
}
