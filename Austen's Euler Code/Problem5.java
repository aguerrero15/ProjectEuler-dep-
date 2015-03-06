

public class Problem5 {
	public static void main(String[] args){
		long x, z; 
		
		/* The goal of this problem is to find a number that 
		 * has factors between 1 and 20 inclusively. 
		 */
		
		x = 0; 
		z = 0; 
		do  {
			
			x = x + 1;
			/*If we consider that x % 20 = 0, since 20 is even, it means 
			 * that x % 2 = 0, as well as all multiples of 2 between 2 and 20.
			 * We then can eliminate all x % __ that are not prime and/or are not
			 * factors of higher terms. 
			 */
			
				if (x % 11 == 0)
					if (x % 12 == 0)
						if (x % 13 == 0)
							if (x % 14 == 0)
								if (x % 15 == 0)
									if (x % 16 == 0)
										if (x % 17 == 0)
											if (x % 18 == 0)
												if (x % 19 == 0)
													if (x % 20 == 0)
														z = x; 
			
		} while (z < 1);
	
		System.out.println(z);
		
	}
	
}