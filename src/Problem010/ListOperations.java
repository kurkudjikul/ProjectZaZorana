package Problem010;
import java.util.List;

public class ListOperations
{
	public static long getSum(List <Integer> list)
	{
		long sum = 0;
		for(int i = 0; i < list.size(); i++)
		{
			sum += list.get(i);
		}
		return sum;
	}
}
