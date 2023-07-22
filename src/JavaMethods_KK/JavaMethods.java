package JavaMethods_KK;

import java.util.Scanner;

public class JavaMethods
{
    public static void main(String[] args)
    {
        // Q:Take input of two numbers and print the sum.
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number = ");
        int n1 = input.nextInt();
        System.out.print("Enter the second number = ");
        int n2 = input.nextInt();

        int sum = n1 + n2 ;
        System.out.println("The sum is = " + sum);

        
    }
}
