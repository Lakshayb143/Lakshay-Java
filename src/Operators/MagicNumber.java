package Operators;

import java.util.Scanner;

public class MagicNumber 
{
    public static void main(String[] args)
    {
        int n ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number = ");
        n = scanner.nextInt();
        System.out.println(magicNumber(n));
        
    }


    private static int magicNumber(int n) 
    {
        int sum = 0;

        for (int i = 1; n > 0; i++) {
            int num = n&1;
            sum += Math.pow(5,i)*num;
            n = n>>1;

        }

        return sum;
    }
}
