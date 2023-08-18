package Searching.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
//        int[] array = {1,2,4,5,7,12,19,22,28,31,35,42};
        int[] array = {1,2,4,5,7};
        Arrays.sort(array);
        int target = input.nextInt();
        System.out.println(binarySearch2(array,target));
    }
    // int middle = (start+end)/2; // Might be possible that (start+end) exceeds the range of int in java.
    // Better way to do this is :  int middle = start + (end - start) / 2 ;

    // return the index
    // return -1 if the target is not found.
    // Here array is sorted in ascending order.
    static int binarySearch(int[] arr,int target)
    {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){

            int middle = start + (end - start) / 2 ;
            int element = arr[middle];
            if(element==target){
                return middle;
            }
            else if (target > element){
                start = middle + 1;
            }

            else{
                end = middle - 1;
            }
        }

        return -1;

    }

    static boolean binarySearch2(int[] arr , int target)
    {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end ){
            int middle = (start+end)/2;
            int element = arr[middle];
            if(element==target){
                return true;
            }
            else if (target > element){
                start = middle + 1 ;

            }
            else{
                end = middle - 1;
            }
        }

        return false;
    }
}
