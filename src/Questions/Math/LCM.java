package Questions.Math;

import static Questions.Math.GCD.gcd;

public class LCM
{
    public static void main(String[] args)
    {
//        System.out.println(lcm(4,5));

    }

    static int lcm(int a , int b)
    {
        return ( a * b )/ gcd(a,b);
    }
}
