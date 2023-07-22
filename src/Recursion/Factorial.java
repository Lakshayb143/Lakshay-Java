package Recursion;

public class Factorial
{
    static int factorial(int n)
    {
        int fact = 1;
        for(int i = n ; i > 0; i--){
            fact = fact * i;
        }
        return fact;
    }

    static long recurFactorial(int n)
    {
        if(n == 2){
            return 2;
        }
        if (n < 2){
            return 1;
        }


        return n * recurFactorial(n-1);
    }
}








