package Recursion.Subsets;

import java.util.ArrayList;
import java.util.List;

public class SubsetGenerator {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        List<List<Integer>> subsets = subSetsDuplicate(nums);

        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }

    public static List<List<Integer>> subSets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        generateSubSets(nums, 0, new ArrayList<>(), subsets);
        return subsets;
    }

    private static void generateSubSets(int[] nums, int index, List<Integer> currentSubset, List<List<Integer>> subsets) {
        if (index == nums.length) {
            subsets.add(new ArrayList<>(currentSubset));
            return;
        }

        // Include the current element in the subset
        currentSubset.add(nums[index]);
        generateSubSets(nums, index + 1, currentSubset, subsets);

        // Exclude the current element from the subset
        currentSubset.remove(currentSubset.size() - 1);
        generateSubSets(nums, index + 1, currentSubset, subsets);
    }




    static List<List<Integer>> subSetsDuplicate(int[] arr)
    {
        List<List<Integer>> subsets = new ArrayList<>();
        generateSubSetsDuplicate(arr,0,new ArrayList<>(),subsets);
        return subsets;

    }

    private static void generateSubSetsDuplicate(int[] arr, int index, ArrayList<Integer> currentSubset, List<List<Integer>> subsets)
    {
        if(index == arr.length){
            if(!subsets.contains(currentSubset)){
                subsets.add(new ArrayList<>(currentSubset));
            }
            return;
        }

        // Including the element
        currentSubset.add(arr[index]);
        generateSubSetsDuplicate(arr,index+1,currentSubset,subsets);

        // Excluding the element
        currentSubset.remove(currentSubset.size() - 1);
        generateSubSetsDuplicate(arr,index+1,currentSubset,subsets);
    }
}
