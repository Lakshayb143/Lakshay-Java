package Patterns_KK;

import java.awt.datatransfer.SystemFlavorMap;
import java.util.Scanner;

public class PatternAnswers
{
    public static void main(String[] args)
    {
        // You can Refer to Questions in the PatternQuestionList.txt file in this package
        // I have created function for seperate questions acc to the file

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
//        question1(num);
//        question2(num);
//        question3(num);
//        question3Sol(num);
//        question4(num);
//        question5Sol(num);
//        question6(num);
//        question28(num);
//        question7(num);
//        question8(num);
//        question9(num);
//        question10(num);
//        question11(num);
//        question12(num);
//        question13(num);
        question13Sol(num);
    }
    


    static void question1(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int column = 0; column < n; column++) {
                System.out.print('*');
            }
            System.out.println();

        }
    }

    static void question2(int n)
    {
        for (int row = 0; row <= n; row++) {
            for (int column = 0; column < row; column++) {
                System.out.print('*');
            }
            // when one row is printed we need to print a newline
            System.out.println();

        }

    }

    static void question3(int n){
        // My Answer
        for (int row = n; row > 0; row--) {
            for (int column = 0; column < row; column++) {
                System.out.print('*');

            }
            System.out.println();

        }


    }


    static void question3Sol(int n)
    {
        // Correct Solution
        for (int row = 0; row <=n; row++) {
            for (int column = 0; column < n - row + 1; column++) {
                System.out.print('*');
            }
            System.out.println();
        }

    }



    static void question4(int n)
    {
        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(column);

            }
            System.out.println();

        }
    }

    static void question5(int n)
    {
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col < row; col++) {

                System.out.print('*');

            }
            System.out.println();

        }
        for (int i = n-1; i >0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }


    }

    static void question5Sol(int n)
    {
        for (int rows = 0; rows < 2 * n; rows++) {
            int totalColsInRows = rows>n ? 2*n -rows: rows;
            for (int cols = 0; cols < totalColsInRows; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void question6(int n)
    {
        for (int rows = 1; rows <= n; rows++) {
            for (int j = 0; j < n-rows; j++) {
                System.out.print(" ");

            }

            for (int k = 0; k < rows; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }


    static void question7(int n)
    {
        for (int rows = 0; rows < n; rows++) {
            int totalNoOfCols = n - rows;
            int totalSpaces = n - totalNoOfCols;
            for (int k = 0; k < totalSpaces; k++) {
                System.out.print(' ');

            }
            for (int j = 0; j < totalNoOfCols; j++) {
                System.out.print("*");
            }


            System.out.println();

        }

    }


    static void question8(int n)
    {
        for (int rows = 0; rows < n; rows++) {
            for (int spaces = 0; spaces < n-rows; spaces++) {
                System.out.print(" ");

            }
            for(int cols = 0; cols<2*rows+1;cols++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void question9(int n)
    {
        int x = n;
        for (int rows = 0; rows <= n; rows++) {
            x--;
            for (int spaces = 0; spaces < rows; spaces++) {
                System.out.print(" ");
            }
            for(int cols = 0; cols<2*x+1;cols++){
                System.out.print("*");
            }
            System.out.println();

        }

    }

    static void question10(int n)
    {
        for (int rows = 0; rows <= n; rows++) {
            for (int spaces = 0; spaces < n-rows; spaces ++){
                System.out.print(" ");


            }
            for (int cols = 0; cols < rows; cols++) {
                System.out.print("* ");
            }

            System.out.println();

        }
    }

    static void question11(int n)
    {
        for (int rows = 0; rows < n; rows++) {
            for (int spaces = 0; spaces < rows; spaces++) {
                System.out.print(" ");
            }
            for (int cols = 0; cols < n - rows; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void question12(int n)
    {
        for (int rows = 0; rows < n; rows++) {
            for (int spaces = 0; spaces < rows; spaces++) {
                System.out.print(" ");
            }
            for (int cols = 0; cols < n - rows; cols++) {
                System.out.print("* ");
            }
            if(rows!=n-1){
                System.out.println();
            }

        }

        for (int rows = 0; rows <= n; rows++) {
            for (int spaces = 0; spaces < n - rows; spaces++) {
                System.out.print(" ");
            }
            for (int cols = 0; cols < rows; cols++) {
                System.out.print("* ");
            }

            System.out.println();


        }

    }

    static void question13(int n)
    {
//        System.out.print(" ");
        for (int rows = 0; rows < n; rows++) {
            for (int spaces = 0; spaces < n -rows; spaces++) {
                System.out.print(" ");
            }


            System.out.print("*");
            for(int spa = 1 ; spa < 2*rows; spa++){
                System.out.print(" ");
            }
            if(rows!=0){
                System.out.print("*");
            }

            System.out.println();
        }
//        System.out.println();
        for (int i = 0; i < 2 * n + 1; i++) {
            System.out.print("*");
        }
    }

    static void question13Sol(int n)
    {
        for (int i = 1; i <= n; i++) {

            for(int j =i;j<=n;j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1; k++) {
                if(i==n || k==1 || k ==(2*i-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }



/*    Unable to solve Question 14
    static void question14(int n)
    {
        for (int i = 1; i < 2 * n ; i++) {
            System.out.print("*");
        }
        System.out.println();
        for(int rows = 0; rows < n-1; rows++) {
            for (int j = 0; j < rows+1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");



            if(rows!=3){
                System.out.print("*");
            }
            System.out.println();


        }
    }*/

    static void question14Sol(int n)
    {
        for (int rows = 1; rows <= n; rows++) {
            for(int j=1; j<rows; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(n*2-(2*rows-1)); j++){
                if(rows==1 || j==1 || j==(n*2 - (2*rows - 1)))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }


    static void question15(int n)
    {
        for (int rows = 1; rows < 2 * n; rows++) {
            int totalNoOfCols ;


        }
    }
    static void question28(int n)
    {
        for (int row = 0; row < 2 * n; row++) {
            int totalNoOfCols = row>n ? 2*n - row : row;
            int totalNoOfSpaces  = n - totalNoOfCols;
            for (int j = 0; j < totalNoOfSpaces; j++) {
                System.out.print(" ");

            }


            for (int cols = 0; cols < totalNoOfCols; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }



    static void question38(int n)
    {
        for (int row = 0; row < 2 * n; row++) {
            int totalNoOfSpaces  = row>n ? row-n : n - row;
            for (int j = 0; j < totalNoOfSpaces; j++) {
                System.out.print(" ");

            }

            int totalNoOfCols = row>n ? 2*n - row : row;
            for (int cols = 0; cols < totalNoOfCols; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void question39(int n)
    {
        for (int rows = 0; rows < n; rows++) {
            for (int cols = 0; cols < n - rows; cols++) {
                System.out.print(" * ");
            }
            for (int spaces = 0; spaces < rows; spaces++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void question40(int n)
    {
        for (int rows = 0; rows < n; rows++) {
            for (int spaces = 0; spaces < rows; spaces++) {
                System.out.print(" ");
            }
            for(int cols = 0; cols<2*n+1;cols++){
                System.out.print("*");
            }
            System.out.println();
        }

    }




}
