package Problem005;
import java.util.ArrayList;
import java.util.List;

public class Primes
{
	private static List <Integer> generatePrimes(int range, int quantity)
	{
		List <Integer> primesArray = new ArrayList <Integer>();
		primesArray.add(2);
		int possiblePrime = 3;
		
		while(possiblePrime <= range || primesArray.size() < quantity)
		{
			int i = 0;
			boolean isDivisible = false;
			
			do
			{
				if(possiblePrime % primesArray.get(i) == 0 )
				{
					isDivisible = true;
					break;
				}
				
				i++;
				
				if(primesArray.size() < i + 1)
				{
					break;
				}
			}
			while(isDivisible == false && primesArray.get(i) <= Math.sqrt(possiblePrime));
			
			if(isDivisible == false)
			{
				primesArray.add(possiblePrime);
			}
			
			possiblePrime += 2;
		}
		return primesArray;
	}
	
	public static List <Integer> getInRange(int range)
	{
		List <Integer> primesArray = generatePrimes(range, 0);
		return primesArray;
	}
	
	public static List <Integer> getInQuantity(int quantity)
	{
		List <Integer> primesArray = generatePrimes(0, quantity);
		return primesArray;
	}
	
	public static boolean isPrime(int target)
	{
		boolean isPrime = false;
		List <Integer> primesArray = getInRange(target);
		if(target == primesArray.get(primesArray.size() - 1))	
		{
			isPrime = true;
		}
		return isPrime;
	}
	public static int getOrdinal(int target)
	{
		List <Integer> primesArray = getInQuantity(target);
		return primesArray.get(primesArray.size() - 1);
	}
}