package JavaMethods_KK;

public class Shadowing
{
    static int number = 100; // This will be shadowed at line 12.
    public static void main(String[] args)
    {
        System.out.println(number); // 100
        int number; // The class variable at line 5 will be shadowed by this.
//        System.out.println(number); // Scope will begin when variable is initialised
        number = 500;
        System.out.println(number); //500
        demo();

    }

    static void demo()
    {
        System.out.println(number);//100
    }
}
