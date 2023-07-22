package JavaMethods_KK;

import java.util.Arrays;

public class VarArgs
{
    public static void main(String[] args)
    {
        fun(1,23,6,4,5,7,5,8,5,4,55,5,4,5,4,4,5,5,85,45,748,5415,54);
        System.out.println(many(1,3,"Lakshay Bhatia","Harshal","Vishesh","Akshat","Animesh","Aryan"));
        // There is one more rule variable length arguments will always be at the end in list.
        demo(10,202,0,20,2,0,2);
        demo('a','b','c','d','e');

    }

    static void demo(char ...V)
    {
        System.out.println(Arrays.toString(V));
    }

    static void demo(int ...V)
    {
        System.out.println(Arrays.toString(V));
    }

    // This is for providing minimum number of arguments.
    static int many(int n1 , int n2 , String ...V)
    {
        System.out.println(Arrays.toString(V));
        return n1+n2;
    }

    static  void fun(int ...V)
    {
        System.out.println(Arrays.toString(V));
    }
}
