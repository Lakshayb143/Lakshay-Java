import java.util.Scanner;


public class ForLoop
{
	public static void main(String[] args)
	{
		// This is a program for running for loop
		
		/* A For Loop is usually used to execute a piece of code for specific number of times.

		   Syntax:
				for(initialize; check boolean expression ; update the experssion)
				{
					// code

				}

		*/

		// for loop
		for(int i = 1 ; i<=50 ; i++)
		{
			//System.out.print("Lakshay\tBhatia\t\t");

		}
			

		// Write a program to print first n odd numbers using a for loop.

		Scanner scan = new Scanner(System.in);
		System.out.print("How many odd numbers you want to print = ");
		int odd = scan.nextInt();

		// Solution-1.

		int c = 1;
	
		for(int i = 1; c<=odd ; i = i + 2)
		{
			//System.out.println(i);
			c++;
		}


		// Solution-2.
	
		for(int i = 0; i<odd ; i++)
		{	//System.out.println(2*i+1);

		}


		// Decrementing for loop
		System.out.print("Enter = ");
		int natural = scan.nextInt(); 
		
		for(int i = natural ; i!=0 ; i--) // we can use i>0 or i!=0 
		{	System.out.println(i);

		}

		
		

	}

}