
public class Problem3 {
	public static void main(String[] args){
		int x; 
		double prime, value, primefind,primedetermine;
		double mod1, mod2; 
		boolean status; 
		
		/*z = 600851475143;
		 * Originally testing with the value they gave us first.
		 * Supposedly the value they want us to test is too large...? 
		 */
		value = 13195;
		primefind = 13195;
		x = 1;	
		primefind = value - 1; 
		primedetermine = 1;
		mod2 = 1; 
		prime = 1; 
		mod1 = 1; 
		
		status = false; 
		
		do  {

			mod1 = value % primefind; 
			/*
			 * Idea was to check if the value could be divisible by any
			 * value. If it was, it would put the number found (primefind) 
			 * into another loop to determine if it is prime.
			 */
			 
			if (value % primefind == 0) 
					do {
						primedetermine = primefind - 1;
						mod2 = primefind%primedetermine;
						/*
						 * Here is a loop to determine if primefind is 
						 * actually prime. To do this, it must have remainders
						 * with every value from 2 to primefind - 1. 
						 */
						if (mod2 == 0)
								x = 1; 
						if (primedetermine == 0);
							x = 1;
						if (mod2 == 0)
							status = true;
						if (mod2 == 0);
							prime = primefind;
						
					} while (x != 1);
			
			if (status = true)
				primefind = 0; 	
			else primefind = primefind - 1; 
		} while (primefind <= 1);
			
		System.out.println(prime);
	}
	
}
