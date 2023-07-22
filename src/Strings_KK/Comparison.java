package Strings_KK;

public class Comparison
{
    public static void main(String[] args)
    {
        String a = "Lakshay";
        String b = "Lakshay";

        // ==
//        System.out.println(a == b);
        /*
        here == operator is giving true for above condition
        It means a and b are pointing to the same object
        because == checks if the reference variable are pointing to same object or not.

           */

        //Now
        // How to create different objects of same value
        // Answer - By using new keyword .

        String c = new String("Lakshay");
        String d = new String("Lakshay");

        System.out.print("Using == method --> ");
        System.out.println(c == d);

        // This will return false because now objects are created outside the pool
        // but inside the heap


        // When you only want to check/compare values, use .equals method.
        System.out.print("using .equals() method --> ");
        System.out.println(c.equals(d));

        // In strings we cannot do this c[0]
        String name = "Lakshay";
//        System.out.println(name[0]);// This will give an error
        // Instead of this we have to use charAt
        System.out.println(name.charAt(0));



    }
}
