import java.util.Scanner;


public class PassingArray
{

	static void changeInteger(int a)
	{
		a = 100;
		System.out.println("The value of modified integer inside the function = "+ a );
	
	}

	static void changeArray(int[] array)
	{
		array[0] = 100 ;
		System.out.println("The value of arr[0] in the method  = " + array[0]);

	}

	public static void main(String[] args)
	{
		// Case 1 : Changing the value of the integer 
		// In case of Integers , the values are copied to the arguments of the method .So if we modify the value of arguments passed in the 
		// in the method , the value will not change in the main method.
		int a = 10;
		changeInteger(a);
		System.out.println("The value of integer after running changeInteger method = "+ a);

		// Case 2 : Changing the value of Array
		// In Case of Arrays, The Reference(score in below example is reference of array) is passed
		// Same as the case for object passing to methods.
		int[] score = {94,90,80,99,91};
		System.out.println("The value of arr[0] before running changeArray method = " + score[0]);
		changeArray(score);
		System.out.println("The value of arr[0] after running changeArray method = " + score[0]);

		/*
		Output 

		The value of modified integer inside the function = 100
		The value of integer after running changeInteger method = 10
		The value of arr[0] before running changeArray method = 94
		The value of arr[0] in the method  = 100
		The value of arr[0] after running changeArray method = 100
		
		*/

		// Arguments are Actual !!!
	
	}
}