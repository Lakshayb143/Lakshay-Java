package JavaMethods_KK;

public class PassingExample
{
    public static void main(String[] args)
    {
        String name = "Lakshay Bhatia";
        changeName(name);
        System.out.println("After running changeName()");
        System.out.println(name);
    }

    static void changeName(String tera_naam)
    {
        tera_naam = "Kabir"; // Creating a new object.
        // As strings are immutable.

        System.out.println("In side the changeName()");
        System.out.println(tera_naam);
    }
}
