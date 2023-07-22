package Strings_KK;

import java.util.Arrays;

public class StringMethods
{
    public static void main(String[] args)
    {
        String name = "Lakshay Bhatia";
        char[] array = name.toCharArray();
        System.out.println(Arrays.toString(array));


        System.out.println(name.length());

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println("Original String--> " + name);


        System.out.println(name.indexOf('a'));

        System.out.println("        Lakshay         ".strip());

        System.out.println(Arrays.toString(name.split("a")));



    }
}
