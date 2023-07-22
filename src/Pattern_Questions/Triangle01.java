package Pattern_Questions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Triangle01 {
    public static void main(String[] args) {
        simpleTriangle();
        simpleTriangle2();
        intTriangle2();
        intTriangle3();
        intTriangle4();

    }

    static void simpleTriangle() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println(" ");
        }

    }

    static void simpleTriangle2() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");

            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    static void intTriangle() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 1;
        while (i <= n) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
            i++;
        }


    }

    static void intTriangle2() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 1;
        while (i <= n) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
            i++;
        }
    }

    static void intTriangle3() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 1;
        while (i <= n) {
            for(int k = 1;k<=(n-i);k++){
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            i++;
        }
    }

    static void intTriangle4() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 1;
        while (i <= n) {

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            i++;
        }
    }


}
