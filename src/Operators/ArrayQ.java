package Operators;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayQ
{
    public static void main(String[] args)
    {
        int[] arr = {2,3,4,1,2,1,3,6,4};
        int[] arr2 = {2,2,2,15,7,7,8,7,8,8};

//        System.out.println(Question1(arr));

//        System.out.println(Question2(arr2));
        System.out.println(Question2(arr2));
    }

    static int Question1(int[] arr)
    {
        // There is only one number whose frequency is 1 in this array , Other numbers are appearing twice(even times) in the array.
        // . Find the number
        int unique = 0;
        for(int element : arr){
            unique = unique ^ element;

        }
        return unique;
    }

    static int Question2(int[] array)
    {
        // Every number is appearing odd times in the array(3,5,7..) and only one number is appearing one time.
        // Find that number?

        int[] b = new int[4];
        int sum = 0;
        for(int element : array){
            sum = sum + Integer.parseInt(Integer.toBinaryString(element));
        }

        int[] a = integertoarray(sum);

        for(int j = 0 ; j <=b.length-1;j++){
            b[j] = a[j] % 3;
        }
        int binary = arraytoint(b);
        return Integer.parseInt(Integer.toString(binary),2);
    }

    static int arraytoint(int[] arr)
    {
        int ans = 0;
        for (int j : arr) {
            ans = (ans * 10) + j;
        }
        return ans;
    }

    static int[] integertoarray(int n)
    {
        int[] arr = new int[4];
        int i = arr.length - 1;
        while (n > 0 ){
            arr[i] = (n%10);
            n = n/10;
            i--;
        }
        return arr;
    }
}
