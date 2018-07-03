package Problem006;
/*
The sum of the squares of the first ten natural numbers is,
12 + 22 + ... + 102 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)2 = 552 = 3025

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/

import java.lang.Math;

public class Problem006Test
{
    public static void main(String[] args)
    {
        int power = 2;
        int range = 100;
        int difference = (int) Math.pow(NaturalNumbers.getSum(range),power) - NaturalNumbers.getSumPow(range, power);
        
        System.out.println(difference);
    }
}

