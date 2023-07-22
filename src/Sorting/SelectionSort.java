package Sorting;

import java.util.Arrays;

public class SelectionSort
{
    public static void main(String[] args)
    {
        int[] arr = {4,5,1,2,3,6};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selectionSort(int[] array)
    {
        for(int i = 0 ; i<array.length ; i++){
            //find the maximum element in the remaining array and swap with the correct index.
            int last = array.length - i - 1;
            int maxElementIndex = getMaxIndex(array, 0 , last);
            int temp = array[maxElementIndex];
            array[maxElementIndex] = array[last];
            array[last] = temp;

        }
    }

    private static int getMaxIndex(int[] array, int start, int end)
    {
        int max = start;
        for(int j = start ; j <= end ; j++){
            if(array[max] < array[j]){
                max = j;
            }

        }
        return max;
    }
}
