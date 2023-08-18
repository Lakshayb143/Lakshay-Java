package Searching.BinarySearchQuestions;

public class CeilingOfNumber
{
    public static void main(String[] args){
        int[] arr = {2,3,5,9,14,16,17,18};
//        for(int element : arr){
//            System.out.println(ceiling(arr,element));
//        }
//        for (int i = 1; i < 19; i++) {
//            System.out.println(i + " " + ceiling(arr,i));
//        }
        System.out.println(ceiling(arr,12));
        System.out.println(ceil(arr,12));
    }

    // My approach
    public static int ceiling(int[] arr , int target)
    {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

             if(arr[mid] == target){
                 return arr[mid];
             }

             if(arr[mid] < target){
                 start = mid + 1;
             }

             if(arr[mid - 1] < target && arr[mid] > target){
                 return arr[mid];
             }

             if(arr[mid] > target){
                 end = mid - 1;
             }
        }

        return -1;
    }


    // Another approach
    public static int ceil(int[] arr , int target)
    {
        if(target > arr[arr.length -1]){
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return arr[mid];
            }

            if(arr[mid] < target){
                start = mid + 1;
            }

            if(arr[mid] > target){
                end = mid - 1;
            }
        }

        return arr[start];

    }
}
