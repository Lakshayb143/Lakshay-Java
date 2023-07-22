package Recursion;

import java.util.Arrays;

public class BinarySRecursion
{
    public static void main(String[] args)
    {

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int start = 0;
        int end = arr.length - 1;
        int ans = recurBinary(arr,9 ,start,end);
        System.out.println(ans);

    }

    static int recurBinary(int[] arr,int target,int start , int end)
    {
        Arrays.sort(arr);
        if(start > end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if (arr[mid] > target){
            end = mid - 1;
            return recurBinary(arr,target ,0,end);

        }else{
            return recurBinary(arr,target,mid+1,arr.length-1);
        }




    }
}
