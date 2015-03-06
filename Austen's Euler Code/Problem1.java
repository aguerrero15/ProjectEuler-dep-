
public class Problem1 {
	public static void main(String[] args){
		int x, y, z; 
		
		/*
		 The goal is to find the sum of all the multiples of 3 or 5 
		 below 1000, not including 1000. 
		 */
		
		x = 999; 
		y = 0; 
		z = 1; 
		do  {
			
			z = z + 1;
			if (z % 3 == 0)  
				y = y + z; 
			else if (z % 5 == 0)
				y = y + z;
			System.out.println(y);
			
		} while (z != x);
		
	}
	
}