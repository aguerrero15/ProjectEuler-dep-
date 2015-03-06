
public class FactorialDigitSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long temp = 1L;
		for(long i = 101L; i > 0; i--)
		{
			temp = temp * i;
			System.out.println(temp);
		}
		System.out.println(temp);
	}

}
