package JavaMethods_KK;

public class MethodOverloading
{
    public static void main(String[] args)
    {
        sample(100);
        sample("Lakshay Bhatia");
        System.out.println(sum(10,20));


    }

    static int sum(int a , int b )
    {
        return a +b ;
    }

    static int sum(int a , int b , int c)
    {
        return a + b + c;
    }

    /*static void sum(int a , int b)
    {
        // This method will give an error because overloading can't be done
        // by changing return_type of the method.
    }
    */

    static void sample(String name)
    {
        System.out.println("First One(String wala)");
        System.out.println("Hello "+name);
    }

    static void sample(int num)
    {
        System.out.println("Second one(integer wala)");
        System.out.println(num);
    }
}
