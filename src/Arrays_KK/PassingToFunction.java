package Arrays_KK;

import java.util.Arrays;

public class PassingToFunction
{
    public static void main(String[] args)
    {
        int[] array = {0,1,2,3,4,5,6};
        System.out.print("Array before running the function = ");
        System.out.println(Arrays.toString(array));
        System.out.print("Array after running the function = ");
        changeArray(array);
        System.out.println(Arrays.toString(array));



    }

    static void changeArray(int[] arr)
    {
        arr[0] = 100;
    }
}
