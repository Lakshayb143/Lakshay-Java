package OOPS.packages.a;


import java.util.Arrays;

import static OOPS.packages.b.Greeting.Message;
import static Sorting.InsertionSort.insertion;

public class Backend
{
    public static void main(String[] args) {
        Message();

        int[] array = {5,4,3,2,1};
        insertion(array);
        System.out.println(Arrays.toString(array));
    }
}
