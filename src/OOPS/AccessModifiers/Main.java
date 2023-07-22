package OOPS.AccessModifiers;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        Sample1 obj = new Sample1(10,"Lakshay" , 7.23f);

        // We need to do a few things
        // 1.Access the data members.
        // 2.Modify the data members.

//        System.out.println(obj.num);// As num is private , we cannot access it outside the class.
        System.out.println(obj.getNum());

        Subclass obj2 = new Subclass(23,"lakshaY ",9.4f);
        System.out.println(obj2 instanceof  Sample1);
        System.out.println(obj2 instanceof  Subclass);


        System.out.println(Arrays.toString(obj.getClass().getConstructors()));
    }
}
