package Searching.RotatedBinarySearch;

public class RotatedBinarySearch
{
    public static void main(String[] args)
    {
        int[] arr ={15,16,19,20,25,1,3,4,5,7,10,14};
        System.out.println(search(arr,25));

    }

    public static int search(int[] arr, int target)
    {
        int pivot = findPivot(arr);
        if(pivot == -1){
            return binarySearch(arr,target,0,arr.length-1);
        }
        if(arr[pivot]==target){
            return pivot;
        }

        if(target >= arr[0]){
            return binarySearch(arr,target,0,pivot-1);
        }
        return binarySearch(arr,target,pivot+1,arr.length-1);

    }
    static int binarySearch(int[] arr,int target,int start,int end)
    {


        while(start <= end){

            int middle = start + (end - start) / 2 ;
            int element = arr[middle];
            if(element==target){
                return middle;
            }
            else if (target > element){
                start = middle + 1;
            }

            else{
                end = middle - 1;
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
}
