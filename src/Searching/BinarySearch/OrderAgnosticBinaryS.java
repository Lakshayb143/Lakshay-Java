package Searching.BinarySearch;

import java.util.Arrays;

public class OrderAgnosticBinaryS
{
    public static void main(String[] args)
    {
        int[] array = {65,34,23,1,12,89,54,43,2};
        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
        System.out.println(binarySearch(array,23));
        System.out.println(orderAgnosticBS(array,23));
    }


    // My code
    static int binarySearch(int[] arr , int target)
    {
        int start = 0;
        int end = arr.length - 1;
        if(arr[start] < arr[end]){
            while(start <= end){
                int mid = start + (end - start)/2;
                int element = arr[mid];
                if(target==element){
                    return mid;
                }
                else if (target > element){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }

            return -1;
        }
        else{
            while(start <= end){
                int mid = start + (end - start)/2;
                int element = arr[mid];
                if(target==element){
                    return mid;
                }
                else if (target > element){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }

            return -1;
        }
    }

    // Better code
    static int orderAgnosticBS(int[] arr , int target)
    {
        int start = 0;
        int end = arr.length - 1;

        // Find whether array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start)/2;
            int element = arr[mid];
            if(target==element){
                return mid;
            }
            if(isAsc){
                if (target > element){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            else{
                if (target < element){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
