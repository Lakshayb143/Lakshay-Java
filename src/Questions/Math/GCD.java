package Questions.Math;

public class GCD
{
    public static void main(String[] args)
    {
        int a = 4;
        int b = 8;
//        System.out.println(gcd(a,b));
//        System.out.println(recurGcd(a,b));

        System.out.println(isCoPrime(a,b));
    }

    // Using Loops.
    static int gcd(int a , int b)
    {
        while(a > 0){
            int temp = a;
            a  = (b % a);
            b = temp;

        }
        return b;

    }

    // Using recursion
    static int recurGcd(int a , int b)
    {
        if( a == 0){
            return b;
        }
        return recurGcd(b%a,a);
    }

    static boolean isCoPrime(int a , int b)
    {
        return gcd(a, b) == 1;
    }
}
