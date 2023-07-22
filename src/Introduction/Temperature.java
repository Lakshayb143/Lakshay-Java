package Introduction;

import java.util.Scanner;

public class Temperature
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in celusius = ");
        float temp = input.nextFloat();

        float new_temp = (temp*1.8f)+32;
        System.out.println("The temperature in Fahrenheit = " + new_temp);


    }
}
