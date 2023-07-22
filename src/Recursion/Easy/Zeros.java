package Recursion.Easy;

public class Zeros
{
    public static void main(String[] args)
    {
        System.out.println(count(10000));

    }

    // Special pattern for how to pass a value to above function calls in recursion.
    static int count(int n)
    {
        return helper( n , 0);
    }

    static int helper(int n , int c)
    {
        if(n  == 0){
            return c;
        }

        if(n%10 == 0){
            return helper(n/10,c+1);
        }else{
            return helper(n/10,c);
        }

    }
}
