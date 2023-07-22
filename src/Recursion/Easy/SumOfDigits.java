package Recursion.Easy;

import java.util.EnumMap;
import java.util.Enumeration;

public class SumOfDigits
{
    public static void main(String[] args)
    {
        int num = 0;
        System.out.println(digitProduct(num));


    }

    static int digitsSum(int n)
    {
        if (n == 0){
            return 0;
        }
        int remainder = n % 10;
        return remainder + digitsSum(n/10);


    }

    static int digitProduct(int n)
    {
        if (n%10 == n){
            return n;
        }
        return n%10 * digitProduct(n/10);
    }
}
