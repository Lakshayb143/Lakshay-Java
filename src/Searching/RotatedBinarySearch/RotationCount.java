package Searching.RotatedBinarySearch;

public class RotationCount
{
    public static void main(String[] args)
    {
        int[] arr = {15,16,19,20,25,1,3,4,5,7,10,14};
        System.out.println(rotationCount(arr));

    }

    static int rotationCount(int[] arr){
        return RotatedBinarySearch.findPivot(arr) + 1;
    }
}
