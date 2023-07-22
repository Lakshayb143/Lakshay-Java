package Recursion;

public class basics
{

    public static void main(String[] args)
    {
        print(1);

    }

    static void print( int n ){

        System.out.println(n);
        print(n+1);
    }
}
