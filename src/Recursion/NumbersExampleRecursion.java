package Recursion;

public class NumbersExampleRecursion
{
    public static void main(String[] args)
    {
        // Write a function that takes a number and print first 5 numbers

        print(1);
    }

    static void print(int n) {
        // In recursion, each call can be treated as seperated call in the memory.

        // base condition
        if (n>5){
            return;
        }
        System.out.println(n);
        // This is known as tail recursion.
        // This is the last function call.
        print(n+1);
    }

}
