
public class Problem6 {
	public static void main(String[] args){
		int x, y, z, sum, total; 
		
		/*
		 The Goal of this problem is to find the sum of squares,
		 and the square of the sum of the numbers 1 to 100 inclusively. 
		 */
		
		x = 1; 
		y = 0; 
		z = 0; 
		sum = 0; 
		total = 0; 
		do  {
			z = z + 1; 
			x = z * z;
			y = y + x; 
			sum = sum + z; 
		} while (z < 100);
		
		sum = sum * sum;
		total = sum - y; 
		System.out.println(total);
		
	}
	
} 