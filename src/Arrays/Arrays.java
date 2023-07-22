import java.util.*;


public class Arrays
{
	public static void main(String[] args)
	{
		// This is introduction to arrays in java.
		// how to declare a array.
		// There are three main ways to declare array in java.
		// 1. Declaration and memory allocation .
		
		int [] array1 = new int[6] ;

		// 2. Declaration and then memory allocation.
	
		int [] array2 ;
		array2 = new int[10] ;

		// Initialization 
		array2[0] = 20;
		array2[1] = 30; 
		array2[2] = 40;
		array2[3] = 50;
		
		//System.out.println(array2[8]);

		// 3. Declaration , memory allocation and initialization together.
		//int [] marks = {98, 45, 79, 99, 80};
		//marks[0] = 100;
		//System.out.println(marks[0]);

		// Method for knowing length of the array.
		//System.out.println(marks.length);

		// Arrays of other data types.

		//String[] students = {"lakshay","Bill","Steve"};
		//System.out.println(students[2]);
		//System.out.println(students.marks);

		


		// 4. Displaying a array in java (Known as Array Traversal).
		
		int [] marks = {1,2,3,4,5};
		System.out.println("Printing array using for loop.");

		for ( int i = 0 ; i<marks.length ; i++)
		{	System.out.println(marks[i]);

		} 
	
		// Question . Write a program for printing array in reverse order.
		
		System.out.println("Printing array in reverse order using for loop.");
		for ( int i = marks.length -1 ; i >= 0 ; i--)
		{	System.out.println(marks[i]);
		}

		System.out.println("\n\n");
		// 5. Displaying array using For-Each loop.
		System.out.println("Displaying array using For-Each loop.");
		
		for ( int data : marks)
		{	System.out.println(data);

		}

	
	}

}