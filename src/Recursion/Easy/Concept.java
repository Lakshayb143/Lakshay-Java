package Recursion.Easy;

import Strings_KK.StringPerformance;

public class Concept
{
    public static void main(String[] args)
    {
        fun(5);

    }

    static void fun(int n)
    {
        if(n == 0){
            return;
        }
        System.out.println(n);
//        fun(n--);
        // above statement will make a infinite recursion that will result in a stackoverflow error.
        // because of there is a difference between n-- v/s --n.(despite fact both mean n = n -1.
        /*
        difference:
        n-- mean first pass the value than decrement.
        --n means first decrement the value then pass.
        */
        fun(--n);
    }
}
