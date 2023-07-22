package Arrays;

import java.util.Scanner;


public class Array_PracticeSet
{

	public static void main(String[] args)
	{
		/*

		// This is practice set for arrays in java by cwh.
		// Question-1. Create an array of 5 floats  and calculate their sum.
	
		float[] array1 = {1.0f , 2.0f, 3.0f , 4.0f , 5.0f} ;
		float sum = 0.0f;

		for (float element : array1)
		{	sum += element;
		}
		System.out.printf("Sum of array of 5 floats = %f",sum);

		System.out.println("\n\n");
		
		// Question-2. Write a program to find out whether a given integer is present in an array or not.

		Scanner scan = new Scanner(System.in);
		System.out.print("enter the integer = ");	
		int io = scan.nextInt();

		boolean condition = false ;

		int[] array2 = { 1,2,3,4,5,6};
		
		for ( int element : array2 )
		{	if ( element == io )
			{	condition = true;
				break;
			}
		}

		if ( condition )
		{	System.out.printf("%d is present in the array.\n",io);		
		}
		
		else
		{	System.out.printf("%d is not present in the array.\n",io);
		}

		System.out.println("\n\n");

		// Question-3. Calculate the average marks from an array containing marks of all students in physics using for-each loop.
		
		float[] array3 = {98,99,100,98,97,94,58,42,18,59,87,41,68,47,84,85,74};

		float sum3 = 0.0f ;
		//System.out.println(array3[0]);
		for ( float element : array3 )
		{	sum3 += element ;
		}
		float len = array3.length;
		float avg = sum3 / len ;
		//System.out.println(sum3);
		//System.out.println(len);

		System.out.printf("The average of the class in physics is = %f",avg);

		System.out.println("\n\n");

		// Question-4. Write a java program to add two matrices of order 2*3 .

		int[][] m1 =  new int[2][3] ;
		int[][] m2 =  new int[2][3] ;
		int[][] result =  new int[2][3] ;

		m1[0][0] = 100;
		m1[0][1] = 100;
		m1[0][2] = 100;
		m1[1][0] = 200; 
		m1[1][1] = 200;
		m1[1][2] = 200;


		m2[0][0] = 100;
		m2[0][1] = 100;
		m2[0][2] = 100;
		m2[1][0] = 200; 
		m2[1][1] = 200;
		m2[1][2] = 200;

		// Another way for creating two matrices 

        int [][] mat1 = {{1, 2, 3},
                         {4, 5, 6}};
        int [][] mat2 = {{2, 6, 13},
                         {3, 7, 1}};
        int [][] sum4 = {{0, 0, 0},
                           {0, 0, 0}};



		for ( int i = 0 ; i<m1.length ; i++)
		{	
			for ( int j = 0 ; j<m1[i].length ; j++)
			{
				result[i][j] = m1[i][j] + m2[i][j] ;

			}


		}

		System.out.println("The Result of sum of two matrices :- ");
		for ( int i = 0 ; i<m1.length ; i++)
		{	
			for ( int j = 0 ; j<m1[i].length ; j++)
			{
				System.out.print(result[i][j]);
				System.out.print(" ");

			}

			System.out.println("");
		}

		System.out.println("\n\n");
		// Question-5. Write a java program to reverse an array.

		int[] array5 = {1,2,3,4,5};
		int[] reversed = new int[array5.length] ; 
		int last = array5.length - 1 ;
		//System.out.println(last);


		for ( int i = 0 ; i< array5.length ; i++ )	
		{
			reversed[i] = array5[last] ;
			last-- ;	
		}

		System.out.println("Reversed array is :- ");
		for ( int element : reversed )
		{	
			System.out.println(element);
		}

		System.out.println("\n\n");
		// Question-6.Write a java program to find the maximum value element in an array.
		int[] array6 = {1,2,3,4,5,90000};
	
		int max = 0 ;

		for ( int i = 0 ; i<array6.length ; i++ )
		{
			if ( max < array6[i])
			{
				max = array6[i] ; 
			}
		}
		System.out.format("The maximum value in the array is = %d ",max);

		System.out.println("\n\n");
		// Question-7.Write a java program to find the minimum value element in an array.
		int[] array7 = {-1,-2,-4,-10,1,2,3,4,5,90000,-10000};
	
		int min = array7[0] ;

		for ( int i = 0 ; i<array7.length ; i++ )
		{
			if ( min > array7[i])
			{
				min = array7[i] ; 
			}
		}
		System.out.format("The minimum value in the array is = %d ",min);
		*/

		System.out.println("\n\n");
		//Question-8. Write a java program to find whether an array is sorted or not .
		//int[] array8 = {-1,-2,-4,-10,1,2,3,4,5,90000,-10000};
		int[] array8 = {1,2,3,4,5,9000};

		boolean isSorted = true; 
		
		for ( int i = 0 ; i<array8.length-1 ; i++ )
		{
			if ( array8[i] > array8[i+1])
			{	
				isSorted = false ;
				break; 
			}
		}

		if (isSorted)
		{
			System.out.println("Yes, the array is sorted.");
		}
		else
		{
			System.out.println("No , the array is not sorted.");
		}
		
        // Practice Problem 5
        int [] arr = {1,2,3,4,5};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
		System.out.println(n);
        int temp;

        for(int i=0; i<n; i++)
		{
            // Swap a[i] and a[l-1-i]
            // a   b   temp
            // |4| |3| ||
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
		}
		for(int element: arr){
            System.out.print(element + " ");
        }

	}

}