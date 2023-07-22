package Strings_KK;

public class PrettyPrinting
{
    public static void main(String[] args)
    {
        float number = 143.1234f;
        System.out.printf("The formatted string %.2f \n",number);

        float num = 153.1299f;
        System.out.format("The formatted String = %.3f \n ",num); // It also round off the number

        System.out.println(Math.PI);
        System.out.printf("Pie : %.3f\n",Math.PI);

        // For other data types
        System.out.printf("My name is %s","Lakshay");

        // %f, %s -- these are known as placeholders in java


    }
}
