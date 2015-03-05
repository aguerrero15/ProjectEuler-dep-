
public class Euler3 {
	public static void main(String[] args)
	{
		long testedNumber = 600851475143L;
		long testCounter = 1L;
		
		while (testCounter < testedNumber)
		{
			if (testedNumber % testCounter == 0) //Does it divide?
				System.out.println(testCounter);
			testCounter++;

			
		}
	}
}
// This will print the factors of the number, but it's still up to me to find the largest prime one.
// Very simple program to reduce my work from A LOT to A LITTLE, that's good enough for me.
