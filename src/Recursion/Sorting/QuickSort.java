package Recursion.Sorting;

import java.util.Arrays;

public class QuickSort
{
    public static void main(String[] args)
    {
        int[] array = {5,4,3,2,1};
        quickSort(array,0,array.length - 1);
        System.out.println(Arrays.toString(array));

    }


    static void quickSort(int[] array , int low , int high)
    {
        if(low >= high){
            return ;

        }

        int s = low;
        int e = high;
        int mid  = s + (e - s) /2 ;
        int pivot = array[mid];

        while ( s <= e){
            while(array[s] < pivot){
                s++;
            }
            while(array[e] > pivot){
                e--;
            }
            // Reason why if it is sorted it will not swap.

            if(s <= e){
                int temp = array[s];
                array[s] = array[e];
                array[e] = temp;
                s++;
                e--;


            }
        }

        // now my pivot is at correct index.
        quickSort(array,low,e);
        quickSort(array,s,high);
    }
}
