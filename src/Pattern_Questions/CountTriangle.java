package Pattern_Questions;

import java.util.Scanner;

public class CountTriangle
{
    public static void main(String[] args)
    {
        countTriangle();
//        countTriangleRows();
    }

    static void countTriangle()
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int num = 1;

        for(int j =1;j<=n;j++){
            if(num<n) {
                for (int k = 1; k <= j; k++) {
                    System.out.print(num);
                    num++;
                }
            }
            System.out.println();



        }
    }

    static void countTriangleRows()
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int num = 1;

        for(int j =1;j<=n;j++){
            for(int k = 1; k<=j;k++){
                System.out.print(num);
                num++;
            }
            System.out.println();



        }
    }
}
