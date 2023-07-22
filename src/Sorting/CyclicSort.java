package Sorting;

import java.util.Arrays;

public class CyclicSort
{
    public static void main(String[] args)
    {
        int[] array = {5,3,4,1,2};
        cyclicSort(array);
        System.out.println(Arrays.toString(array));

    }

    static void cyclicSort(int[] arr)
    {
        int i = 0;
        while(i < arr.length){
            if(arr[i] == i + 1){
                i++;
            }
            else{
                int element = arr[i];
                int temp = arr[i];
                arr[i] = arr[element - 1];
                arr[element - 1] = temp;
            }
        }
    }

    // Another approach(KK)
    static void cycicSort2(int[] arr)
    {
        int i = 0;
        while( i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }else{
                i++;
            }
        }

    }
}
