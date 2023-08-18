package Searching.RotatedBinarySearch;

public class RBSWithDuplicate
{
     public static void main(String[] args)
     {
         int[] array = {15,16,19,20,25,1,3,4,5,7,10,14};
         int[] arr = {4,5,6,1,2,3};
         System.out.println(search(array,25));

     }

    public static  boolean search(int[] arr, int target) {

        int pivot = findPivotDuplicate(arr);
        if(pivot == -1){
           pivot = findPivot(arr);
           if(pivot == -1){
               return binarySearch(arr,target,0,arr.length - 1);
           }
//             return binarySearch(arr,target,0,arr.length - 1);

        }
        if(arr[pivot] == target){
            return true;
        }
        if(target >= arr[0]){
            return binarySearch(arr,target,0,pivot-1);
        }
        return binarySearch(arr,target,pivot+1,arr.length-1);
    }

     static int findPivotDuplicate(int[] arr)
     {
         int start = 0;
         int end = arr.length - 1;

         while(start <= end){
             int mid = start + (end - start)/2;
             int middle = arr[mid];
             int s = arr[start];
             int e = arr[end];
             if(middle == s && middle == e){
                 if(start < arr.length -2 && s > arr[start + 1]){
                     return start;
                 }
                 start++;

                 if(end > 0 && e < arr[end - 1]){
                     return end - 1;
                 }
                 end--;
             }
             else if(s < middle || (s == middle && middle > e)){
                 start = mid+1;
             }else{
                 end = mid - 1;
             }
         }


         return -1;
     }

    static int findPivot(int[] array)
    {
        int start = 0;
        int end = array.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid < end && array[mid] > array[mid + 1]){
                return mid;
            }
            else if (mid > start && array[mid] < array[mid - 1]){
                return mid - 1;
            }
            else if (array[start] >= array[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }

    static boolean binarySearch(int[] arr,int target,int start,int end)
    {
        while(start <= end){

            int middle = start + (end - start) / 2 ;
            int element = arr[middle];
            if(element==target){
                return true;
            }
            else if (target > element){
                start = middle + 1;
            }

            else{
                end = middle - 1;
            }
        }

        return false;

    }
}
