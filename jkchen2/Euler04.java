
public class Euler04 {

//	A palindromic number reads the same both ways. The largest palindrome made
//	from the product of two 2-digit numbers is 9009 = 91 × 99.
//
//	Find the largest palindrome made from the product of two 3-digit numbers.
	
	public static void main(String[] args) {
		
		int highest = 0;
		int c = 0;
		int i = 0;
		
		//System.out.println(isPalindrome(01001));
		
		// Loops a multiplication of each number
		// Then checks if the result is a palindrome
		for (i = 100; i < 1000; i++) {
			for (c = 100; c < 1000; c++) {
				if (isPalindrome(c * i) && highest < c * i)
					highest = c * i;
			}
		}
		
		System.out.println(highest);

	}
	
	public static boolean isPalindrome(int num) {
		
		int compare = num;
		int reverse = 0;
		
		// Produces a reverse of the input num
		while (num != 0) {
			reverse = reverse * 10 + num % 10;
			num = num / 10;
		}
		
		if (reverse == compare)
			return true;
		return false;
		
	}

}
