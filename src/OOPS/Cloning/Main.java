package OOPS.Cloning;

import java.util.ArrayList;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Human lakshay = new Human(43,"Lakshay Bhatia");
//        Human twin = new Human(lakshay);

        // Here we are creating a copy of Human object lakshay
        // But there is a better way known as object cloning

        Human twin = (Human) lakshay.clone();
        System.out.println(twin.age + " " + twin.name);

//        System.out.println(lakshay == twin);

//        lakshay.age = 12;
//        System.out.println(lakshay.age);
//        System.out.println(twin.age);

        // above changing the age of lakshay doesn't affect the age of twin

//        twin.age = 100;
//        System.out.println(lakshay.age);
//        System.out.println(twin.age);

        // above changing the age of twin doesn't affect the age of lakshay


        System.out.println(Arrays.toString(lakshay.arr));
        twin.arr[0] = 10;
        System.out.println(Arrays.toString(lakshay.arr));

        // This is shallow copying.
        // For primitives, it is creating new copies.
        // But for objects both reference var twin.arr and lakshay.arr are pointing to same object.




    }
}
