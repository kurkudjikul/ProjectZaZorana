package Problem004;
/*
A palindromic number reads the same both ways.
The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 � 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/



//This class can be used for finding the largest palindrome made from the product of two numbers of same but any number of digits

import java.lang.Math;

public class LargestPalindromeProduct
{
	int findLargestPalindromeProduct(int numberOfDigits)
	{
		int largestMultipleValue=0;
		
		for(int i=0;i<=numberOfDigits-1;i++)
		{
			largestMultipleValue+=9*Math.pow(10, i);
		}
		
		int smallestMultipleValue=largestMultipleValue/10;
		int multiplication=0;
		int largestPalindromeNumber=0;
		int firstMultiplier=largestMultipleValue;
		int secondMultiplier=largestMultipleValue;
		boolean validPalindromeNumber=false;
		
		while(firstMultiplier>smallestMultipleValue && (firstMultiplier*firstMultiplier)>largestPalindromeNumber)
		{
			secondMultiplier=firstMultiplier;
			
			while(secondMultiplier>smallestMultipleValue || validPalindromeNumber==false)
			{
				multiplication=firstMultiplier*secondMultiplier;
				validPalindromeNumber = Palindrome.isPalindromic(multiplication);
				if(validPalindromeNumber==true && multiplication>largestPalindromeNumber) 
				{
					largestPalindromeNumber=multiplication;
				}
				secondMultiplier--;
			}
			firstMultiplier--;
		}
		return(largestPalindromeNumber);	
	}
}

