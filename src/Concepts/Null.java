package Concepts;

public class Null
{
    public static void main(String[] args)
    {
//        int a = null ;
//        System.out.println(a);// This will give an error because this is a primitive data type.

        String str = null;
        System.out.println(str);

        String[] arr1 = new String[3];
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        // All the elements of array above are null.
       /*
       null doesn't have any data type it means we can't create a variable of this type.
       It is a special literal which we can assign to a reference variable of non primitive data tpe. e.g.-String
       we cannot assign it to variable of primitive data type.
       We can compare it with None in python.

       */
        String var = null; // String is a non primitive.
        System.out.println(var);
//        int nv = null;// This will give an error because we are assigning null to a primitive.


    }

}
