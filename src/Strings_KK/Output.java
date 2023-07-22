package Strings_KK;

import java.util.Arrays;

public class Output
{
    public static void main(String[] args)
    {
        System.out.println(39);
//        Integer number = new Integer(39);
//        System.out.println(number.toString());
        // Or
//        System.out.println(Integer.toString(number));
//        System.out.println("Lakshay");


        // In println() method, no matter what data type you enter
        // It will convert it to string (using toString() method) and then print
//        System.out.println(new int[]{1,2,3,4}); // Output -->[I@58372a00
//        This will print a string representation of the object.

//        But if we specify toString for a particular object type, like done below

        System.out.println(Arrays.toString(new int[] {1,2,3,4}));



    }
}
