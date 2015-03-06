
public class Problem9 {
	public static void main(String[] args){
		
		int a, b, c, n, k, m, cs, as, bs, product, i, count;
		Boolean escape; 
		
		/*
		 The goal is to find a pythagorean triplet that
		 satisfies the condition a + b + c = 1000. 
		 */
		
		a = 0;
		n = 1;
		count = 1; 
		m = 2;
		b = 1;
		c = 2; 
		cs = as = bs = 1; 
		product = 0; 
		escape = false; 
		
		do
		{
			count = count + 1; 
			/*
			 The following formula was obtained from wikipedia. 
			 */
			k = 0; 
			a = m*m - n*n;
			b = 2*m*n;
			c = m*m + n*n; 
			if (m > n)
			/*
			 Currently a process to generate unique pythagorean triples. 
			 */
			{
				do
				{
					k = k + 1; 
					a = k * a;
					b = k * b;
					c = k * c; 
					/*
					 The k will allow other Pythagorean triples to generate.
					 */
					cs = c * c;
					as = a * a;
					bs = b * b; 
					if (a + b + c == 1000)
						escape = true; 
					if (escape != true)
					{
						/*
						 Returns a, b, and c to their original value to be modified
						 by k + 1 in the next loop. 
						 */
						a = a / k;
						b = b / k;
						c = c / k; 
					}
					else k = 100;
				} while (k < 100 );
			}
			m = m + 1;
			if (m > 500)
			{
				n = n + 1;
				m = 1;
			}
	
		} while (escape != true);
		
		System.out.print(a);
		System.out.print("    ");
		System.out.print(b);
		System.out.print("    ");
		System.out.print(c);
		System.out.print("    ");
		product = a * b * c; 
		System.out.println(product);
	}
	
}
