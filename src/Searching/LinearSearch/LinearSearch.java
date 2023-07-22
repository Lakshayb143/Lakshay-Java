package Searching.LinearSearch;

import java.util.Scanner;

public class LinearSearch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] array = {1,23,4,22,53,92,20};
        int[] arr= {};
        int target = sc.nextInt();
//        System.out.println(linearSearch(array,target));
        System.out.println(searchInRange(array, target ,1,4));

    }

    // Search the array : return the index if the element is found
    // Otherwise if the element is not found return -1.
    static int linearSearch(int[] arr , int target)
    {
        if(arr.length==0){
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            if(arr[index]==target){
                return index;
            }
        }

        return -1;
    }


    // Search the target and return the element.
    static int linearSearch2(int[] arr , int target)
    {
        if(arr.length==0){
            return Integer.MAX_VALUE;
        }

        for (int element : arr) {
            if(element==target){
                return element;
            }
        }

        return Integer.MAX_VALUE;

    }

    // Search the target and return true or false
    static boolean linearSearch3(int[] arr , int target)
    {
        if(arr.length==0){
            return false;
        }
        for(int element: arr){
            if(element==target){
                return true;
            }
        }
        return false;
    }

    static int searchInRange(int[] arr , int target , int start ,int end)
    {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = start; index <= end; index++) {
            if(arr[index]==target){
                return index;
            }
        }
        return -1;
    }
}
