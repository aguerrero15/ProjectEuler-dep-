
public class SumSquareDifference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long temp = 0;
		long cat = 0;
		for(int i = 1; i < 101;i++)
		{
			temp += i*i;
			cat += i;
		}
		System.out.println(temp);
		System.out.println(cat*cat);
		System.out.println((cat*cat)-temp);
			
	}

}
