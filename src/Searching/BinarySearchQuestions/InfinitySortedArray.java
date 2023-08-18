package Searching.BinarySearchQuestions;

public class InfinitySortedArray
{
    public static void main(String[] args)
    {
        int[] arr = new int[101];
        for (int i = 0; i < 100; i++) {
            arr[i] = i;
        }
//        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        System.out.println(findElement(arr,15));

    }

    static int findElement(int[] arr , int target){
        // first find the range
        // first start with a box of two
        int start = 0;
        int end = 1;
        // condition for target to lie in range.
        while(target > arr[end]){
            int temp = end + 1;
            end = end + (end - start + 1)*2;
            start = temp;
        }

        return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int[] arr,int target,int start , int end)
    {
        while(start <= end){
//            int middle = (start+end)/2; // Might be possible that (start+end) exceeds the range of int in java.
            // Better way to do this is
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

}
