package Problem003;
/*The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
*/

public class Problem003Test 
{
	public static void main(String[] args)
	{
		PrimeFactors largestFactor = new PrimeFactors();
		largestFactor.generateFactors(600851475143L);
		System.out.println(largestFactor.getLargestFactor());
	}
}