
public class Problem4 {
	public static void main(String[] args){
		
		/*
		 The goal is to find a palindrome number made from 
		 multiplying two large numbers together between 1 and 999
		 inclusively. 
		 */

		int n1, n2, truedrome, drome, i;
		String value;
		char[] numval;
		boolean success;
		
		n1 = 1000; 
		n2 = 1000; 
		drome = truedrome = 100; 
		numval = new char[11];
		success = false;
		
		/*
		 Loop to find the palindrome. 
		 */
		do {
			success = false;
			i = 0; 
			drome = n1 * n2; 	
			value = String.valueOf(drome);
			/*
			 A loop to assign the characters of value to an array.
			 */
			do {
				numval[i+1] = value.charAt(i); 
				i = i + 1;
			} while (i != value.length());
		
			/*
		 	The check is done by doing something like if numval[0] = numval[value.length()-1]
		 	and do continuous repeat statements by incriments of 1, we can prove that drome
		 	is a palindrome.  
			 */
			if (value.length() == 6)
				if (numval[1] == numval[6])
						if (numval[2] == numval[5])	
							if (numval[3] == numval[4])
								success = true;
			/*
			 When you multiple 1000 x 1000, you get a 7 digit number, so 999 x 999 will be 
			 6 digits. Since we have a possiblilty of digits up to 0, we will run a check 
			 on 6 and 5 digit number results because they might have the largest palindrome
			 number.
			 */
			else
				if (numval[1] == numval[5])
					if (numval[2] == numval[4])
						success = true;
			/*
			 If the check passes, we must see how the value of the palindrome compares to the previously stored value. 
			 */
			if (success == true)
				if (drome > truedrome)
					truedrome = drome;
			n1 = n1 - 1; 
			if (n1 == 0) 
					{
					n2 = n2 - 1;
					n1 = 999; 
					}
		} while (n2 != 0);
		System.out.println(truedrome);
	}
}