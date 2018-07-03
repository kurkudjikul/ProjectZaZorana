package Problem001;
public class MultiplesOfNumbers
{
	public static int getSum(int range, int X, int Y)  // Calculates the sum of all the multiples of X or Y below range
	{
		int sum = 0;
		
		for(int i = 1; i < range; i++)
		{
			if(i % X == 0 || i % Y == 0)
			{
				sum += i;
			}
		}
		return(sum);
	}
}
