package Problem005;
import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization
{
	public static List <List <Integer>> getFactors(int number)
	{
		List <List <Integer>> factors = new ArrayList<List <Integer>>();
		factors.add(Primes.getInRange((int) Math.sqrt(number)));
		return factors;
	}
	
}
