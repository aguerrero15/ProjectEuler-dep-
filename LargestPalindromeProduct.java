
public class LargestPalindromeProduct {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp = 0;
		for(int i = 999; i > 100; i--)
		{
			for(int j = 999; j > 100;j--)
			{
				if(pal(i,j) && temp < i * j)
					temp = i*j;
			}
		}
		System.out.println(temp);
	}
	public static boolean pal(int m, int n)
	{
		int temp = m * n;
		String inputString = Integer.toString(temp);
		 
	    int length  = inputString.length();
	    int i, begin, end, middle;
	 
	    begin  = 0;
	    end    = length - 1;
	    middle = (begin + end)/2;
	 
	    for (i = begin; i <= middle; i++) 
	    {
	      if (inputString.charAt(begin) == inputString.charAt(end)) {
	        begin++;
	        end--;
	      }
	      else   
	    	  break;
	    }
	    if (i == middle + 1) {
	      return true;
	    }
	    return false;
	   
		//if(m <500 && n < 500) return 0;
		//if(((n*m)/100000)%10 == (n*m)%10)
			//System.out.println((n*m/100000)%10);
			//if(((n*m)/10000)%10 == (n*m)%100)
				//if(((n*m)/1000)%10 == (n*m)%1000)
				//	return m*n;
		//return 0;
	    }
	}

