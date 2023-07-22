package Searching.LinearSearch;

public class FindMinimum
{
    public static void main(String[] args)
    {
        int[] arr = {0,-100,-1,1,2,3,100,4,5,6};
        System.out.println(findMinimum(arr,3,6));
    }

    // return the minimum value in the array
    static int findMinimum(int[] arr)
    {
        if(arr.length==0){
            return Integer.MIN_VALUE;
        }

        int min = Integer.MAX_VALUE;
        for (int element : arr) {
            if (min > element) {
                min = element;
            }
        }

        return min;

    }

    // Search in the Range and return the minimum value;
    static int findMinimum(int[] arr, int start , int end)
    {
        int min = arr[start];
        for (int i = start; i <=end ; i++) {
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
