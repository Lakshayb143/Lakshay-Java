package Recursion.Arrays;

import LakshayBhatia.CustomArrayList;

import java.util.ArrayList;

public class ImportantLS
{
    private static ArrayList<Integer> list = new ArrayList<>() ;

    public static void main(String[] args)
    {
        int[] arr = {34,23,23,12,53,55,23};
        // Question : Return all the indexes that matches the target.
        // Method 1 : Create a Arraylist outside the function and  the function will return nothing.
        search1(arr,23,0);
        System.out.println(list);
        // Method 2 : The function will return a Arraylist and we will pass that list in arguments.
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println(search2(arr,23,0,list2));
        // **VVVVVI**
        // Method 3 : create the list inside the function body.
        System.out.println(search3(arr,23,0));

    }

    static ArrayList<Integer> search2(int[] arr, int target, int index, ArrayList<Integer> list2)
    {
        if(index == arr.length){
            return list2 ;
        }

        if(arr[index] == target){
            list2.add(index);
        }

        return search2(arr,target,index+1,list2);
    }



    // METHOD 1
    static void search1(int[] arr, int target , int index){
        if(index == arr.length){
            return;
        }

        if(arr[index] == target){
            list.add(index);
        }

        search1(arr,target,index+1);
    }

    //

    //Method 3
    static ArrayList<Integer> search3(int[] arr , int target , int index)
    {
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCall = search3(arr,target,index+1);
        list.addAll(ansFromBelowCall);

        return list;

    }

}
