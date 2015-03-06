
public class Problem2 {
	public static void main(String[] args){
		int x, y, z, sum, zstore; 
		
		/*
		 The goal was to find the sum of all even number Fibonacci numbers
		 between 1 and 4 million. 
		 */
		
		x = 4000000; 
		y = 1; 
		z = 1; 
		sum = 0; 
		
		do  {
			
			if (z % 2 == 0)
				sum = sum + z; 
			
			zstore = z;
			z = y + z; 
			y = zstore; 
			
		} while (z <= x);
		
		System.out.println(sum);
	}
	
} 