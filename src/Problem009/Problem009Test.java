package Problem009;

public class Problem009Test {

	public static void main(String[] args)
	{
		int a = 1, b = 1, c =1;
		int sum = 1000;
		
		for(int i = 1; i < sum - 1; i++)
		{
			for(int j = i; j < sum - i; j++)
			{
				double temp = Triangle.getHypotenuse(i, j);
				if(i + j + temp == sum)
				{
					a = i;
					b = j;
					c = (int)temp;
					break;
				}
			}
		}
		System.out.println(a*b*c);
	}
}