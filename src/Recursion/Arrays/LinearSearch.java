package Recursion.Arrays;

public class LinearSearch
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,345,43,12};
        System.out.println(linearSearch2(arr,13,0));

    }


    public static int linearSearch(int[] arr , int target , int index)
    {
        if(index == arr.length){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }

        return linearSearch(arr,target,index+1);

    }


    public static boolean linearSearch2(int[] arr , int target , int index){
        if(index == arr.length){
            return false;
        }

        if(arr[index] == target){
            return true;
        }

        return linearSearch2(arr,target,index+1);
    }
}
