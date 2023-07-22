package Arrays_KK;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Question
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        // Question 1
//        System.out.println(Arrays.toString(arr));
//        swap(arr,1,2);
//        System.out.println(Arrays.toString(arr));


        // Question 2
//        System.out.println(Integer.MIN_VALUE);
//        max(arr,3,6);

        // Question 3

        reverseArray(arr);
        System.out.println(Arrays.toString(arr));


    }

    static void swap(int[] arr , int index1 , int index2)
    {
        int temp = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;


    }

    static int max(int[] arr)
    {
        // Assuming array in not empty
        // If array is not empty , then we can use line written below
        // int d = Integer.MIN_VALUE;
        if(arr.length==0){
            return -1;
        }
        int max = arr[0];
        for (int element : arr) {
            if(max<element){
                max = element;
            }
        }
        return max;
//        System.out.println("The maximum value of array is = " + max);
    }

    static int max(int[] arr,int start , int end)
    {


        int max = arr[start];
        if(end>start || arr.length==0){
            return -1;
        }
        for (int i = start; i <= end  ; i++) {
            if(max<arr[i]){
                max = arr[i];
            }

        }
//        System.out.println("The maximum value is = " + max);
        return max;
    }

    static void reverseArray(int[] array)
    {
        int start = 0;
        int end = array.length -1;

        while(start<end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }


    
}
