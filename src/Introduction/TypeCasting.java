package Introduction;

import java.util.Scanner;


public class TypeCasting {
    public static void main(String[] args)
    {
//        System.out.println(00000000000000000000000000000000000000000000000);
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);
        // In above case , java has done a type conversion when i entered a integer
        // as a input and it converted it into a float.

        /*
        This type conversion takes place if :
            1) The 2 data types should be  compatible.
            2) The destination type should be greater than the source type.
              just like the above example.

        Java also performs automatic conversion when
        we add a integer constant into variable of type like Byte , short , long
        and sometimes char

         */

        // Type Casting
        int numberr = (int)(23.99f);
//        System.out.println(number);


        // automatic type promotion in expression.
//        int a = 257;
//        byte b = (byte)(a); // 257 - 256 = 1
//        System.out.println(b);
//
//        int c  = 300;
//        byte d = (byte)(c); // 300 - 256 = 44
//        System.out.println(d);

        byte a = 40;
        byte b = 50;
        byte c = 100;
        int d  = a*b/c;
        System.out.println(d);

//        byte e = 50;
//        e = e*2; // This will give an error.

        // Now conversion of integer and character.
        int alphabet = 'A';
        System.out.println(alphabet);

        alphabet = 'a';
        System.out.println(alphabet);

        char number = 65;
        char number2 = 97;
        System.out.println(number);
        System.out.println(number2);

        // Java follows unicode principles.
        System.out.println("नमस्ते मेरा नाम लक्ष्य है\n");

        System.out.println(3*2.4f);

        //



    }
}
