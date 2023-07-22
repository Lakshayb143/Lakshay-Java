import java.util.*;


public class Loops_PracticeSet
{
	public static void main(String[] args)
	{	
		Scanner scan = new Scanner(System.in);

		/*
		// This is a Practice set of Loops from cwh.
		// Question-1.Write a program to print the following pattern using loop
	   //	****
		//	***
		//	**
		//	*
		System.out.println("Solution of Question-1. ");
		int i = 4;
		while (i >= 1)
		{	for ( int j = 1 ; j<=i ; j++)
			{	System.out.print("*");
			}
			System.out.println(" ");
			i--;
		}


		//Question-2. Write a program to sum first n even numbers  using while loop.


		System.out.println("\n\n\nSolution of Question-2. ");
		System.out.print(" Enter the number of first even numbers you want to add = ");
		int n = scan.nextInt();
	
		i = 1;
		int sum = 0;
		while (i <= n)
		{	int even = 2*i;
			sum = sum + even;
			i++;
		}
		System.out.format(" The sum of first %d even numbers is = %d",n,sum); 

	
		// Question-3. Write a program to print multiplication table of a given number n .

		System.out.println("\n\n\nSolution of Question-3. ");
		System.out.print("Enter the number for printing the multiplication table = ");
		int table = scan.nextInt();
		
		for ( int j = 1 ; j<= 10 ; j++)
		{	int num = table * j ;
			//System.out.println(num);	
			System.out.format("%d * %d  =  %d \n", table, j , num);

		} 

		

		//Question-4. Write a program to print mulitipication of table in reverse order.
		System.out.println("\n\n\nSolution of Question-4.");
		System.out.print("Enter the number for printing the multiplication table(reverse) = ");
		int table = scan.nextInt();
		
		for ( int j = 10 ; j>=1 ; j--)
		{	int num = table * j;
			System.out.format("%d * %d = %d \n", table,j,num);
		}

		

		// Question-5.Write a program to find factorial of a given number using for loops .
		// Question-6.Write a program to find factorial of a given number using while loops .  
		
		System.out.print("Enter the number for calculating factorial = ");
		int factorial = scan.nextInt();
		int result = 1 ;
		// for ( int i = 1 ; i <= factorial ; i++)
		// 	{
		// 	  result = result * i;
		// 	//   System.out.println(result);
		// 	}
		int i = 1 ; 
		while (i <= factorial)
			{ result = result * i;
              i++;
       		}

		System.out.format("Factorial of %d is %d ",factorial, result);
		


		// Question-9. Write a program to calculating the sum of the numbers occurring in the the mulitipication table of 8.

		int sum = 0;
		for (int i = 1 ; i <=10 ; i++)
		{
			sum += 8*i ;
		}

		System.out.println("sum = " + sum);
		*/


		// Question-11. Write Question-2 using for loop.
		System.out.print("How many even numbers you want to add = ");
		int even = scan.nextInt();
		int sum = 0;
		for ( int i = 1 ; i <= even ; i++ )
		{	
			sum += 2*i	;


		}
		System.out.format("Sum of %d even numbers = %d\n .",even,sum);

	}

}