package Problem002;
import java.util.ArrayList;

public class FibonacciSequence
{
	private ArrayList <Integer> fibonacciArray = new ArrayList<>();
	
	private void generateArray(int range, int quantity)
	{
		int previousNumber = 0;
		int currentNumber = 1;
	
		while(currentNumber <= range || fibonacciArray.size() <=  quantity)
		{
			fibonacciArray.add(currentNumber);
			int tempNumber = currentNumber;
			currentNumber += previousNumber;
			previousNumber = tempNumber;
		}
	
	}
	
	public void generateInRange(int range)
	{
		generateArray(range, 0);
	}
	
	public void generateInQuantity(int quantity)
	{
		generateArray(0, quantity);
	}
	
	public ArrayList <Integer> getArray()
	{
		return(fibonacciArray);
	}
	
	public int sumEven()
	{
		int sum = 0;
		
		for(int i = 0; i < fibonacciArray.size(); i++)
		{
			if(fibonacciArray.get(i) % 2 == 0)
			{
				sum += fibonacciArray.get(i);
			}
		}
		return(sum);
	}
}
