
public class EvenFibonacciNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(1,1,0));
	}
	public static int fib(int n, int m, int c)
	{
		if(n+m >= 4000000) return c;
		if((n+m) % 2 ==0) c += n+m;
		return fib(n+m,n,c);
	}

}
