package Recursion.Subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question3
{
    // Question : Derive all the subsets of the given array with dulplicate values.
    public static void main(String[] args)
    {
        int[] arr = {1,2,2};
        List<List<Integer>> ans = mySubSetsDuplicate(arr);
        for(List<Integer> list : ans){
            System.out.println(list);
        }

    }

    static List<List<Integer>> mySubSetsDuplicate(int[] arr)
    {
        List<List<Integer>> outerList = new ArrayList<>();

        outerList.add(new ArrayList<>());

        for(int num : arr){
            int n = outerList.size();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> internalList = new ArrayList<>(outerList.get(i));
                internalList.add(num);
                if(outerList.contains(internalList)){

                }else{
                    outerList.add(internalList);
                }
            }
        }

        return outerList;
    }
    static List<List<Integer>> subSetsDuplicate(int[] arr)
    {
        Arrays.sort(arr);
        List<List<Integer>> outerList = new ArrayList<>();
        outerList.add(new ArrayList<>());

        int start = 0;
        int end = 0;

        for(int i = 0 ; i < arr.length ; i++){
            start = 0;
            if(i > 0 && arr[i] == arr[i-1]){
                start = end + 1;
            }
            end = outerList.size() - 1;
            int n = outerList.size();
            for (int j = start ; j < n; j++) {
                ArrayList<Integer> internalList = new ArrayList<>(outerList.get(j));
                internalList.add(arr[i]);
                if(outerList.contains(internalList)){

                }else{
                    outerList.add(internalList);
                }
            }
        }

        return outerList;

    }
}
