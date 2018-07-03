package Problem004;
/*
A palindromic number reads the same both ways.
The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 � 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/

public class Problem004Test
{
	public static void main(String[] args)
	{
		LargestPalindromeProduct test = new LargestPalindromeProduct();
		int largestPalindrome = test.findLargestPalindromeProduct(3);
		System.out.println(largestPalindrome);
	}
}
