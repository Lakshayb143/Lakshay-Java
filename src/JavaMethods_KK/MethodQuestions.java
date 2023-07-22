package JavaMethods_KK;

import java.util.Scanner;

public class MethodQuestions
{
    public static void main(String[] args)
    {
/*        for(int i = 1; i<=10;i++){
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            System.out.println(isPrime(n));
        }*/

        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        System.out.println(isArmstrong(n1));



    }

    static boolean isPrime(int num)
    {
        if(num<=1){
            return false;
        }
        int c = 2;
        while(c*c <= num){
            if(num%c==0){
                return false;
            }
            c++;
        }
        return c * c > num;
    }

/*  check a 3 digit number is armstrong or not.
    Armstrong numbers -> 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748.
    In number theory, a narcissistic number in a given number base b is a number
    that is the sum of its own digits each raised to the power of the number of digits.
*/
    static boolean isArmstrong(int n)
    {
        int original = n;
        int sum = 0;
        while(n>0){
            int remainder = n%10;
//            System.out.println(remainder);

            int cube = remainder*remainder*remainder;
            sum += cube;
            n = n/10;
//            System.out.println(n);

        }
        return original==sum;
    }
}
