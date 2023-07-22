package Arrays_KK;
import java.util.Arrays;

public class Traversing
{
    public static void main(String[] args)
    {



        int[] arr = {1,2,3,4,5,6};
        // 1 Method to traverse all the elements of the array.
        // Using for loop.
//        for(int i = 0 ; i<arr.length ; i++){
//            System.out.print(arr[i] + " ");
//        }
        System.out.println();

        // Method 2
        // Using enhanced for or for each loop

        for(int element:arr){
            System.out.print(element + " ");
        }

        System.out.println();
        // Method 3
        // Best Method to print an array

        System.out.println(Arrays.toString(arr));




    }
}
