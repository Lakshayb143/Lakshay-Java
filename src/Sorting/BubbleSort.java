package Sorting;

import java.util.Arrays;

public class BubbleSort
{
    public static void main(String[] args)
    {
        int[] array = {5,2,1,4,3};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));

    }


    // it sorts in ascending order.
    static void bubbleSort(int[] arr)
    {
        boolean swapped;

//        run the loop n-1 times
        for(int i = 0; i < arr.length ; i++){
            swapped = false;
//            after each step , maximum element will come at last respective index
            for(int j = 1 ; j < arr.length - i ; j++){
                // swap if item is smaller than previous item
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if not swapped for a particular value of i, it means array is sorted.
            if (!swapped){
                break;
            }

        }

    }
}
