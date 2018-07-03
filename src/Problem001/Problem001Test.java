package Problem001;
/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
*/

public class Problem001Test
{
	public static void main(String[] args)
	{
		int sum = MultiplesOfNumbers.getSum(1000, 3,5);
		System.out.println(sum);
	}
}
