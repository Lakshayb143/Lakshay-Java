package Recursion.Easy;

public class Reverse
{
    public static void main(String[] args)
    {
        System.out.println(recurReverse(1345));


    }

    static int sum = 0;
    static void reverse(int n)
    {
        // This is not proper recursion.
        if(n == 0){
            return;
        }
        sum = sum*10+(n%10);
        reverse(n/10);
    }

    static int recurReverse(int n)
    {
        // Sometimes we might need some additional variables in our argument.
        // Then create additional functions.
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n,digits);
    }

    private static int helper(int n, int digits) {
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        return (int) (rem * Math.pow(10,digits-1) + helper(n/10,digits - 1));
    }

    static int reverseLoop(int n)
    {
        int ans = 0;
        while(n > 0){
            ans = (ans*10) + n%10;
            n /= 10;
        }
        return ans;

    }
}
