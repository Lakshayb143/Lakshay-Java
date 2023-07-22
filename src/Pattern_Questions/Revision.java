package Pattern_Questions;

import java.util.Scanner;

public class Revision
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        countTriangle(n);
//        countTriangleRows(n);


    }

    static void countTriangleRows(int n)
    {
        int num=1;
        for(int i = 1; i<=n;i++){
            for(int j = 1; j<=i;j++){
                System.out.print(num);
                num++;

            }
            System.out.println();
        }
    }

    static void countTriangle(int n)
    {
        int number = 1;
        for(int i = 1;i<=n;i++){
            if(number<=n){
                for(int j = 1; j<=i;j++){
                    System.out.print(number);
                    number++;
                }
            }
            System.out.println(" ");
        }


    }
}
