package Recursion.Easy;

import java.nio.file.FileSystemNotFoundException;

public class NumberToOne
{
    public static void main(String[] args)
    {
//        numToOne(5);

        oneToOne(5) ;
    }

    static void numToOne(int n)
    {
        if(n == 0){
            return;
        }
        System.out.println(n);
        numToOne(n - 1);

    }
    static void oneToNum(int n)
    {
        if(n == 0){
            return;
        }
        oneToNum(n -1 );
        System.out.println(n);
    }

    static void oneToOne(int n)
    {
        if(n == 0){
            return;
        }
        System.out.println(n);
        oneToOne(n - 1);
        System.out.println(n);
    }
}
