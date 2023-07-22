package JavaMethods_KK;
import java.util.*;
public class Sum
{
    public static void main(String[] args)
    {
        //
//        sum();
//        int result = sum2();
//        System.out.println(result);
        System.out.println(sum(2,3));

    }


    static int sum(int a , int b)
    {
        int sum = a+b;
        return sum;
        // or you can directly write
        // return a+b;
    }
    static int sum2()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number = ");
        int n1 = input.nextInt();
        System.out.print("Enter the second number = ");
        int n2 = input.nextInt();
        int result = n1+n2;
        return result;



    }
    static void sum()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number = ");
        int n1 = input.nextInt();
        System.out.print("Enter the second number = ");
        int n2 = input.nextInt();

        int sum = n1 + n2 ;
        System.out.println("The sum is = " + sum);

    }

}
