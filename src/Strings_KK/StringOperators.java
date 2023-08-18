package Strings_KK;

import java.util.ArrayList;

public class StringOperators
{
    public static void main(String[] args)
    {
        System.out.println('a' + 'b' - 'b');
        System.out.println('a' +1-1);
        // In above statement it adds the ascii values of characters.
        System.out.println("a"+"b");
        // And here in Strings , + operator results in string concatenation.
        System.out.println((char)('a'+5));

        System.out.println("L" + 1);
        // this int will be converted to Integer then it will call toString()
        // After this this will be same as : "L" + "1"
        // Then output will be L1

        System.out.println("Lakshay" + new ArrayList<>());
        System.out.println("Lakshay" + new Integer(93));
//        System.out.println(new Integer(92)+ new ArrayList<>()); // this statement is not valid because
        // + operator is valid for primitives and for objects one should be of type string.
        System.out.println();
    }



}
