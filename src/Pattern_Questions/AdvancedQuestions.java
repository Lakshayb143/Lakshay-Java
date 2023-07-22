package Pattern_Questions;

import java.util.Scanner;

public class AdvancedQuestions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        binaryTriangleSolution(n);
//        System.out.println("\n\n\n");
//        binaryTriangle(n);
        HollowTriangle();

    }

    static void binaryTriangle(int n) {
        /* Desired Output
        1
        01
        101
        0101*/

        int i = 1;
        while (i <= n) {
            if (i % 2 == 0) {
                int m = 0;

                for (int j = 1; j <= i; j++) {

                    if(j%2==0){
                        System.out.print(1);
                    }
                    else{
                        System.out.print(0);
                    }

                }
            } else{
                int num = 1;
                for (int j = 1; j <= i; j++) {
                    if(j%2==0){
                        System.out.print(0);
                    }
                    else{
                        System.out.print(1);
                    }


                }
            }
            i++;
            System.out.println();


        }
    }


    static void binaryTriangleSolution(int n){
        for (int i = 1;i<=n;i++){
            for (int j = 1; j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);

                }
            }
            System.out.println();
        }
    }

    static void HollowTriangle()
    {


    }

}

