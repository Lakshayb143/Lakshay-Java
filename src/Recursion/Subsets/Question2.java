package Recursion.Subsets;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Question2
{
    // Question : Find all the subsets of the given array.
    /*
    example : Given array is [1,2,3]
    Now, its subsets will be [1],[2],[3],[1,2],[2,3],[1,3],[1,2,3]
    */

    public static void main(String[] args)
    {
        int[] arr = {1,2,3};
        List<List<Integer>> ans =  subSets(arr);
        for(List<Integer> list : ans){
            System.out.println(list);
        }


    }




    // In this function we will be solving using loops.
    static List<List<Integer>> subSets(int[] arr)
    {
        List<List<Integer>> outerList = new ArrayList<>();

        outerList.add(new ArrayList<>());

        for(int num : arr){
            int n = outerList.size();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> internalList = new ArrayList<>(outerList.get(i));
                internalList.add(num);
                outerList.add(internalList);
            }
        }

        return outerList;

    }

    static List<List<Integer>> subSetsDuplicate(int[] arr)
    {
        List<List<Integer>> outerList = new ArrayList<>();

        outerList.add(new ArrayList<>());

        for(int num : arr){
            int n = outerList.size();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> internalList = new ArrayList<>(outerList.get(i));
                internalList.add(num);
                if(!outerList.contains(internalList)){
                    outerList.add(internalList);
                }
            }
        }

        return outerList;

    }

}
