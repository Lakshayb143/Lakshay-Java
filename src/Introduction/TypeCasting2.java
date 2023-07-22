package Introduction;

public class TypeCasting2
{
    public static void main(String[] args)
    {
        byte b = 100;
        char c = 'a';
        short s = 2000;
        int i = 500000;
        float f = 2.2f;
        double d = 9.5678;

        System.out.println((f*b)+ " " + " "+(i+c)+" "+(s-d));
        double result = (f*b) + (i+c)+(s-d);
        // float + integer + double = double.

        System.out.println(result);
    }
}
