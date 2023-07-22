package JavaMethods_KK;

public class Scope
{
    public static void main(String[] args)
    {
        // Scoping
        // Scope basically means where we can access our variables.

        int a = 10;
        int b = 20;

        // Scooping in for loops.
        for(int i = 0; i < 10 ; i++)
        {
            System.out.println(i);
            int num = 30;
//            int a = 20; // This will give an error.


        }

        }

    static void demo()
    {
//        System.out.println(a);
        // Function scope means variable created inside a function can only accessed inside a function'
        // same goes for arguments.

    }
}
