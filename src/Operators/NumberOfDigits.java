package Operators;

import java.util.Scanner;

public class NumberOfDigits
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(digits(n,2));

    }

    private static int digits(int num , int base)
    {
        return (int)(Math.log(num)/Math.log(base)) + 1;
    }
}
