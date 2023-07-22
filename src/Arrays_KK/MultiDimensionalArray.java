package Arrays_KK;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        /*
            123
            456
            789
        */

    //  Method 1
        int[][] array = new int[6][];
    // Note : Column size is not mandatory to mention.
        array[0] = new int[3];
        array[1] = new int[2];
        array[2] = new int[4];
//
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;

        array[1][0] = 4;
        array[1][1] = 5;

        array[2][0] = 6;
        array[2][1] = 7;
        array[2][2] = 8;
        array[2][3] = 9;
//        array[3][4] = 230;// This will give an index out of bound error
//        System.out.println(array.length); // This will give number of rows



        // Method 2
    int [][] array2 = {
                {1,2,3}, // 0th index
                {4,5}, // 1st index
                {6,7,8,9} // 2nd index

                    };
//        System.out.println(array2.length);
//        System.out.println(Arrays.toString(array2[0])); // This will give number of columns at 0th index.

        // input
        int [][] arr = new int[3][3];
        for (int rows = 0; rows < arr.length; rows++) {
            for (int columns = 0; columns < arr[rows].length ; columns++) {
                arr[rows][columns] = input.nextInt();

            }

        }

        // Printing / Traversing the array(2D)
        // Method 1
//        for (int row = 0; row < arr.length; row++) {
//            for (int column = 0; column <arr[row].length ; column++) {
//                System.out.print(arr[row][column] + " ");
//
//            }
//            System.out.println();
//
//        }

        // Method 2
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//
//        }

        // Method 3 (Best)
        for(int[] ele : arr){
            System.out.println(Arrays.toString(ele));
        }

    }
}
