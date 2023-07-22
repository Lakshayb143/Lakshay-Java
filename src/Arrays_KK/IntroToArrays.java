package Arrays_KK;

import java.util.Arrays;

public class IntroToArrays
{
    public static void main(String[] args)
    {
        // Q : Store a roll number.
        int rollno = 59;

        // Q : Store a name
        String name = "Lakshay Bhatia";

        // Q : Store 5 roll no
        int roll1 = 43;
        int roll2 = 22;
        int roll3 = 29;
        int roll4 = 9;
        int roll5 = 78;
        // This is not an efficient method.
        // For solving this problem we have Arrays.


        /*
        Syntax of Arrays
        dataype[] reference_variable = new datatype[size];
        or directly we can
        datatype[] reference_variable = {datatype values};
        */

        // Q: Store 5 roll no.
        //int[] roll = new int[5];
        // or directly we can
        int[] roll = {42,56,79,45,53};
//        System.out.println(Arrays.toString(roll));

        int[] arr; // Declaration of array. arr is getting defined in the stack memory.
        arr = new int[5]; // Initialisation : Actually here the object is being created in the heap memory.
        // Array just after initialisation (Above array will be like this) -> [0,0,0,0,0]
        System.out.println(arr[0]);
        System.out.println(arr[1]);

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
