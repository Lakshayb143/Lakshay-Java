package JavaMethods_KK;

import java.util.Arrays;

public class ChangeValue
{
    public static void main(String[] args)
    {
        // Create an array
        int[] array = {1,3,2,45,6};
        System.out.print("Original array -> ");
        System.out.println(Arrays.toString(array));
        changeArray(array);
        /*for(int element:array)
        {
            System.out.println(element);
        }*/
        System.out.print("Array after running changeArray() -> ");
        System.out.println(Arrays.toString(array));
    }

    static void changeArray(int[] arr)
    {
        arr[1] = 2; // If you make a change to the object via this reference variable
                    // same/original object will be changed.

    }
}
