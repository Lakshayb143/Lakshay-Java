package Searching.BinarySearchQuestions;

import java.util.Arrays;

class FirstAndLastPosition {

    // Question : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
    public static void main(String[] args)
    {
        FirstAndLastPosition obj = new FirstAndLastPosition();
        int[] arr = {5,7,7,8,8,10 };
        System.out.println(Arrays.toString(obj.searchRange(arr,8)));
        System.out.println(Arrays.toString(firstAndLast(arr,8)));


    }

    // My approach.
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0){
            return new int[]{-1, -1};
        }

        boolean found = false;

        int start = 0;
        int end = nums.length - 1;

        int[] answer = new int[2];
        while(start<=end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target){
                found = true;
                end = mid -1;
            }else if(nums[mid] > target){
                end = mid - 1;

            }else{
                start = mid + 1;
            }
        }
        answer[0] = start;

        start = 0;
        end = nums.length - 1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target){
                found = true;
                start = mid +1;
            }else if(nums[mid] > target){
                end = mid - 1;

            }else{
                start = mid + 1;
            }
        }
        answer[1] = end;

        if(found){
            return answer;
        }else{
            return new int[] {-1,-1};
        }
        
    }

    public static int[] firstAndLast(int[] arr , int target){
        int[] ans = {-1,-1};

        ans[0] = find(arr,target,true);
        ans[1] = find(arr,target,false);

        return ans;
    }

    private static int find(int[] arr , int target , boolean firstIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
                int mid = start + (end - start)/2;
                if(target > arr[mid]){
                   start = mid + 1;
                }else if (target < arr[mid]){
                    end = mid -1 ;
                }else{
                    ans = mid;
                    if(firstIndex){
                        end = mid - 1;
                    }else{
                        start = mid + 1;
                    }
                }
        }

        return ans;
    }
}