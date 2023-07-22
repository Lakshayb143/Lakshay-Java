package OOPS.Introduction;

public class WrapperExample
{
    public static void main(String[] args)
    {
//        int a = 10; // Here 10 is primitive stored in stack memory.

        Integer a = 100;
        Integer b = 200;


        swap(a,b);
        System.out.println(a + " " + b);
        // As the output , the values are not swapped by the function despite a and b are objects.
        // The ans is final in the Integer class statement.

        /*
        The final keyword is a non-access modifier used for classes, attributes and methods,
        which makes them non-changeable (impossible to inherit or override).
        The final keyword is useful when you want a variable to always store the same value, like PI (3.14159...).
         */

        final int EXPONENT = 4324324;
//        EXPONENT = 100; // It is giving a error saying can assign a value to final variable.




}

    static void swap(Integer a, Integer b)
    {
        Integer temp = a;
        a = b;
        b = temp;


    }
}
