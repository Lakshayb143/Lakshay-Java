package Conditionals;

import java.util.*;


public class SwitchCaseExample
{
	public static void main(String[] args)
	{
		// This is a example of switch case.
	
		// In Switch , its variable can be a integer, character or a string in java.

		//1. Integer as a Variable.

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your age = ");
		int age = scan.nextInt();
		
		switch(age)
		{
			case 18:
				System.out.println("You are an Adult.");
				break;
			
			case 21:
				System.out.println("You are eligible for marriage.");
				break;
				
			case 25:
				System.out.println("You are eligible for standing in election");
				break;
			default:
				System.out.println("Have a great life"); 
		}
	
		System.out.println("\n\n\n\n");
	

		// 2. Character as a Variable in Switch.
		System.out.print("Enter the char = ");
		char variable = scan.next().toUpperCase().charAt(0);
		System.out.println(variable);

		switch(variable)
		{
			case 'L':
				System.out.println("Lakshay");
				break;
			case 'A':
				System.out.println("Amit");
				break;
			case 'K':
				System.out.println("Kaushalaya");
				break;

			default:
				System.out.println("Jai Shree Ram");
		}

		
		System.out.println("\n\n\n\n\n");

		// 3. String as a Variable in Java.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Direction = ");
		String direction = sc.nextLine().toLowerCase();
		System.out.println(direction);

		
		switch(direction)
		{
			case "south":
				System.out.println("You will reach Delhi");
				break;

			case "north":
				System.out.println("You will reach Chandigarh");
				break;
			
			case "west":
				System.out.println("You will reach Punjab");
				break;
		
			case "east":
				System.out.println("You will reach U.P.");
				break;
	
		}

		


		// THERE IS ONE MORE METHOD FOR WRITING SWITCH CASE WHICH IS KNOWN AS ENHANCED SWITCH.
		// In Enhanced Switch , we don't require break statement. 
		// If we want to run more than one statement in a particular case, then we have to close them in a curly brace 
		//	after this sign -> . example --> north case in below switch.


		switch (direction)
		{
			case "north" ->{ System.out.print("You will ");
							 System.out.print("reach ");
							 System.out.print("Chandigarh. ");
							}
			
			case "south" -> System.out.println("You will reach Delhi.");
			case "west"  -> System.out.println("You will reach Punjab.");
			default  -> System.out.println("Happy Journey");
		}

	}
		
}