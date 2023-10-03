package Searching.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch2DArray
{
    // Searching in Matrix(2D Array) that is sorted in row wise and column wise manner.
    public static void main(String[] args)
    {
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        int[] ans = binarySearch(arr,target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] binarySearch(int[][] matrix , int target)
    {
        int row = 0;
        int col = matrix.length - 1;

        while(row < matrix.length && col >= 0){
            int element = matrix[row][col];
            if(element == target) {
                return new int[]{row, col};
            }

            if (element >= target) {
                col--;
            } else {
                row++;
            }

            }
        return new int[] {-1,-1};
        }


    }

