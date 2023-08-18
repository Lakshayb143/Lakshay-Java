package Searching.BinarySearchQuestions;

public class PeakIndexInMountainArray
{
    // Question : https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,6,2,1};
        System.out.println(arr[peakIndex(arr)]);

    }

    // We can use Linear Search for Brute Force Solution

    // But binary search is more optimized.

    public static int peakIndex(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;

        while(start != end){
//            int middle = (start+end)/2; // Might be possible that (start+end) exceeds the range of int in java.
            // Better way to do this is
            int middle = start + (end - start) / 2 ;
            int element = arr[middle];

            if (arr[middle + 1] > element){
                start = middle + 1;
            }

            else{
                end = middle;
            }
        }

        return start;
    }
}
