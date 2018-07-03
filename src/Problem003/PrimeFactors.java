package Problem003;
import java.util.ArrayList;

/*The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
*/

public class PrimeFactors
{
	private ArrayList <Long> factors = new ArrayList<>();
	private long largestFactor;
	
	public void generateFactors(long number)
	{
		largestFactor = number;
		
		for(long posiblePrime = 2; posiblePrime <= largestFactor; posiblePrime++)
		{
			while(largestFactor % posiblePrime == 0 && largestFactor / posiblePrime > 1)
			{
				largestFactor/=posiblePrime;
				factors.add(posiblePrime);
			}
		}
		factors.add(largestFactor);
	}
	
	public long getLargestFactor()
	{
		return(largestFactor);
	}
}
