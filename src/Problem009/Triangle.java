package Problem009;
public class Triangle
{
	public static double getHypotenuse(double a, double b)
	{
		double hypotenuse = Math.hypot(a, b);
		return hypotenuse;
	}
	
	public static boolean isTriangle(double a, double b, double c)
	{
		return(a + b > c && b + c > a && a + c > b);
	}
	
	public static boolean isRight(double a, double b, double c)
	{
		
		return (isTriangle(a, b, c) && (Math.hypot(a, b) == c || Math.hypot(b, c) == a || Math.hypot(a, c) == b));
	}
	
	public static double getArea(double a, double b, double c)
	{
		double S = (a + b + c) / 2;
		double area = Math.sqrt(S * (S - a) * (S - b) * (S - c));
		return area;
	}
}
