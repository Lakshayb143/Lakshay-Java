package Sorting;

import java.util.Arrays;

public class InsertionSort
{
    public static void main(String[] args)
    {
        int[] array = {5,3,4,1,2};
        insertion(array);
        System.out.println(Arrays.toString(array));

    }

    public static void insertion(int[] arr)
    {
        int N = arr.length;
        for(int i = 0 ; i <= N-2 ; i++ ){
            for(int j = i+1 ; j > 0 ; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }
    }
}

