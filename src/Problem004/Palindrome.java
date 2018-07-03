package Problem004;
//Checks if the given number palindromic

public class Palindrome
{
	public static boolean isPalindromic(int numberToCheck)
	{
		int number=numberToCheck;
		int reversedNumber=0;
		
		while(number!=0)
		{
			reversedNumber = reversedNumber*10 + number%10;
			number/=10;
		}
		return(numberToCheck==reversedNumber);
	}
}