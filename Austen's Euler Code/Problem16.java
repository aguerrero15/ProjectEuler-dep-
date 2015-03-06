
public class Problem16 {
	public static void main(String[] args){
		long i, e, count, product; 
		

		i = 1; 
		e = 1; 
		/*
		 Your best bet for solving this is to store 2^1000 into a string, then 
		 take each digit an put it into an int array, then multiple out the
		 integers to get a final value. 
		 */
		/*
		 What if I used wolfram alpha to find 2^1000, store it in a Text File, 
		 then read the text file for the integer values and then store those values
		 into an array, multiply them out, and bam. instant winning. 
		 
		 import math
		 det fast_exp(n,x);
		 if (x%2 == 1);
		 return x&fastexp*math.pow(x,2),(n/2))
		 else:
		 return fast_exp(math.pow(x,2),(n/2))
		 
		 res = 0
		 string = str(fast_exp(2,1000)
		 for i in range(len(string))
		 rest = string[i]
		 
		 print(res)
		 
		 
		 int/long i = 2 
		 while (i*i < n)
		 while n% i == 0
		 n /= i
		 i++
		 
		 */
		for(count = 1; count < 1001; count++){
			e = e * 2; 
		}
		
		System.out.println("2^15 = " + e);
	}

}
