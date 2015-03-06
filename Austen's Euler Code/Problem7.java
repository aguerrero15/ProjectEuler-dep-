
public class Problem7 {
	
	public static void main(String[] args){
		int candidate, i, max, c; 
		int[] primestore;
		float flow;
		boolean test;
		
		primestore = new int[10002];
		primestore[1] = 1; 
		primestore[2] = 2; 
		primestore[3] = 3;
		primestore[4] = 5; 
		primestore[10001] = 0; 
		c = 4; 
		candidate = 4; 
		test = false; 
		max = 3; 
		do 
		{
			c = c + 1;
			candidate = candidate + 1;
			i = c; 
			do
			{
				/*
				 if no remainder returns, then the candidate is 
				 not prime. 
				 */
				flow = candidate%primestore[i];
				System.out.print("c: "+c+"     candidate: "+candidate+"     i: "+i+"     primestore max: "+primestore[max]+"     flow: ");
				System.out.print(flow);
				if (flow == 0)
					i = 1;
				else
					{i = i - 1; 
						if (i == 1)
						{
							primestore[c] = candidate;
							i = 1;
							max = max + 1; 
							test = true; 
						}
					}
				TextIO.getln();
			} while (test = false);
		}while (primestore[10001] == 0); 
	}

}
