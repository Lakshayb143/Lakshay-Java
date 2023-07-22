package Recursion;

public class NumbersExample
{
    public static void main(String[] args)
    {
        // Write a function that takes a number and print first 5 numbers

        print1(1);
    }

    static void print1(int n) {
        System.out.println(n);
        print2(2);
    }
    static void print2(int n) {
        System.out.println(n);
        print3(3);
    }
    static void print3(int n) {
        System.out.println(n);
        print4(4);
    }
    static void print4(int n) {
        System.out.println(n);
        print5(5);
    }
    // here the function body changes.
    static void print5(int n) {
        System.out.println(n);

    }
}
