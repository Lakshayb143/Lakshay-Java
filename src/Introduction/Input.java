package Introduction;

import java.util.Scanner;

public class Input
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

//        System.out.print("Enter your age = ");
//        int age = scan.nextInt();
//        System.out.println(age);
//
//        String name = scan.next();
//        System.out.println(name);
//        String FullName = scan.nextLine();
//        System.out.println(FullName);


        float marks = scan.nextFloat();
        System.out.println(marks);

        System.out.println(scan.hasNextInt());



    }
}
