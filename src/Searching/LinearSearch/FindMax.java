package Searching.LinearSearch;

public class FindMax
{
    public static void main(String[] args)
    {
        int[] array = {1,32,323,534,23424,43524,1234};
        System.out.println(findMaximum(array));

    }

    // return the maximum value in the array
    static int findMaximum(int[] arr)
    {
        if(arr.length==0){
            return Integer.MAX_VALUE;
        }

        int min = Integer.MIN_VALUE;
        for (int element : arr) {
            if (min < element) {
                min = element;
            }
        }

        return min;
    }

    static int findMaximum(int[] arr , int start ,int end)
    {
        int max = arr[start];
        for (int i = start+1; i <= end; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
