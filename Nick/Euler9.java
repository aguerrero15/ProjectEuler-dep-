
public class Euler9 {
	/* I'm just going to do brute force math.
	 * 
	 * 
	 * 
	 * a^2 + b^2 = c^2
	 * a + b + c = 1000
	 * 
	 * all must be integers.
	 * 
	 * I made a table of squares in excel, down all the way to 1000
	 * Staring at it and watching for patterns, I noticed that the multiples of 5 are the most promising.
	 * (The numbers either end in 25 or 00, based on if their root ends with 0 or 5)
	 * So I remade the table only by 5s. (Throwing stuff at the wall and seeing if it sticks, basically.)
	 * 
	 * Since they all end in 25 or 00, the answer should be a combination of a 0 number and a 5 number
	 * To make sure c^2 does not outpace a^2 and b^2, I decided that a and b would likely be below 400,
	 * so I eliminated all numbers above 600. c is between 400 and 600. BUT it must end in 5. that's 405 to 595.
	 * I can brute force that no problem.
	 * 
	 * 
	 * SO!
	 * a will be a number ending in 5
	 * b will be a number ending in 0
	 * c will be a number ending in 5
	 * 
	 * some brute force later, I arrive at c = 425, which worked perfectly.
	 * 
	 * a = 200
	 * b = 375
	 * c = 425
	 * 
	 * a + b + c = 1000		CHECK
	 * a^2 + b^2 = c^2 		CHECK
	 *  
	 * abc = 31875000 
	 * 
	 * and it only took me about 20 minutes, and then another 10 to write this up.
	 * I'm probably missing the point of these exercises, but oh well.
	 * 
	 */
	public static void main(String[] args)
	{
		int a = 200;
		int b = 375;
		int c = 425;
		System.out.print(a*b*c);
	}
}
