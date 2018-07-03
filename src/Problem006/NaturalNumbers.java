package Problem006;
public class NaturalNumbers
{
       public static int getSum(int range) // Calculates the sum of natural numbers in a given range
       {
            int sum = range*(range + 1) / 2;
            
            return(sum);
       }

		public static int getSumPow(int range, int power) // Calculates the sum of powered natural numbers in a given range
		{
				int sum = 0;							  // How to make it more efficient?
    
				for(int i = 1; i <= range; i++)
				{
					sum += (int) Math.pow(i, power);
				}
				return(sum);
		}
}

