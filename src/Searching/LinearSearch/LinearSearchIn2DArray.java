package Searching.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchIn2DArray
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[][] arr =
                {{1,2,3},
                {4,5,6},
                {7,8,9}};
//        int target = scanner.nextInt();
//        int[] ans = search2D(arr,target);
//        System.out.println(Arrays.toString(ans));
//        System.out.println(search(arr,target));

//        System.out.println(max2D(arr));

        System.out.println(min2D(arr));
    }

    static int min2D(int[][] arr)
    {
        int min = Integer.MAX_VALUE;
        for(int[] a : arr){
            for(int element : a){
                if(element<min){
                    min = element;
                }
            }
        }
        return min;
    }

    // Search the 2D Array and return true if you find the element
    static boolean search(int[][] arr, int target)
    {
        if(arr.length==0){
            return false;
        }

        for(int[] a : arr){
            for(int element : a){
                if(element== target){
                    return true;
                }
            }
        }
        return false;
    }

    // Search the 2D Array
    // and return an array having row and column in which the element is found.
    static int[] search2D(int[][] arr, int target)
    {
        for (int rows = 0; rows < arr.length; rows++) {
            for (int cols = 0; cols < arr[rows].length; cols++) {
                if(arr[rows][cols]==target){
                    return new int[]{rows, cols};

                }
            }
        }

        return new int[]{-1, -1};

    }

    static int max2D(int[][] arr)
    {
        int max = Integer.MIN_VALUE;
        for(int[] a : arr){
            for(int element : a){
                if(element>max){
                    max = element;
                }
            }
        }
        return max;
    }
}
