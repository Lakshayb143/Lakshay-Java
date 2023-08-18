package Searching.BinarySearchQuestions;

public class FindInMountainArray
{
    // Question : https://leetcode.com/problems/find-in-mountain-array/description/
    public static void main(String[] args)
    {
        int[] arr = {0,5,3,1};
        System.out.println(findInMountainArray(1,arr));

    }
    public static int findInMountainArray(int target, int[] mountainArr) {

        int index = peakIndex(mountainArr);
        int a1 = binarySearch(mountainArr,target,0,index);
        if(a1 != -1){
            return a1;
        }else{
            return binarySearch(mountainArr,target,index+1,mountainArr.length-1);
        }



    }

    public static int peakIndex(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;

        while(start != end){

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

    static int binarySearch(int[] arr,int target ,int start , int end)
    {
        boolean asc = arr[start] < arr[end];

        while(start <= end){
//            int middle = (start+end)/2; // Might be possible that (start+end) exceeds the range of int in java.
            // Better way to do this is
            int middle = start + (end - start) / 2 ;
            int element = arr[middle];
            if(element==target){
                return middle;
            }
            if(asc){
                if (target > element){
                    start = middle + 1;
                }

                else{
                    end = middle - 1;
                }}else{
                    if (target < element){
                        start = middle + 1;
                    }

                    else{
                        end = middle - 1;

                }}

            }



        return -1;

    }

}
