package Arrays_KK;

import java.util.Arrays;
import java.util.Scanner;

public class Input
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 90;
        arr[2] = 99;

        System.out.println(arr[0]);

        // Input using for loop

//        for (int i = 0; i<arr.length ; i++){
//            arr[i] = input.nextInt();
//        }

        // for each loop
//        for (int j : arr) { // for every element in array, print the element.
//            System.out.print(j + " "); // here j represents the element of the array.
//
//        }

        // Array of objects
        String[] str = new String[5];
        for(int i = 0; i<str.length; i++){
            str[i] = input.next();
        }

//        for (String j : str){
//            System.out.println(j);
//        }

        System.out.println(Arrays.toString(str));

    }
}


// how to print pattern in java?
//       **********
//       ****  ****
//       ***    ***
//       **      **
//       *        *
//       *        *
//       **      **
//       ***    ***
//       ****  ****
//       **********



