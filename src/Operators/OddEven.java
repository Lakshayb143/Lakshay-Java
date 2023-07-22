package Operators;

import java.util.Scanner;

public class OddEven
{
    public static void main(String[] args)
    {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println(isOdd(n));

    }
    static boolean isOdd(int n) {
        return (n&1) == 1;
    }
}
