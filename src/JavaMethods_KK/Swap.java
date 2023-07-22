package JavaMethods_KK;

public class Swap
{
    public static void main(String[] args)
    {
        int a = 1;
        int b = 2;

        // Program for swaping the values of two variables
/*
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
*/

        swap(a,b);
        System.out.println("After running swap function");
        System.out.println(a + " " + b);

    }

    static void swap(int a , int b )
    {
        int temp = a;
        a = b;
        b = temp;

        // This change will only be valid in this function scope only.
        System.out.println("In the swap function");
        System.out.println(a + " " + b);
        System.out.println("\n\n\n");


    }


}
