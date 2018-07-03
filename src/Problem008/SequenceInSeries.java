package Problem008;

public class SequenceInSeries
{
	public static long getLargestProduct(String series, int sequenceLenght)
	{
		long largestProduct = 0;
		
		for(int i = 0; i <= series.length() - sequenceLenght; i++)
		{
			long curentProduct = 1;
			
			for(int j = i; j < i + sequenceLenght; j++)
			{
				curentProduct *= Character.getNumericValue(series.charAt(j));
			}
			if(curentProduct > largestProduct)
			{
				largestProduct = curentProduct;
			}
		}
		return(largestProduct);
	}
}