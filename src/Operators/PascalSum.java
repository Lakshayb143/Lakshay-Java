package Operators;
import java.util.Scanner;

public class PascalSum
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the nth row number = ");
        int n = scanner.nextInt();

        int sum = 1 << (n-1);
        System.out.println(sum);

    }
}
