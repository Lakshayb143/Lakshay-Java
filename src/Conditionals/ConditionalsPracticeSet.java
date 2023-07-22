package Conditionals;

import java.util.Scanner;

public class ConditionalsPracticeSet
{
	public static void main(String[] args)
	{

		Scanner scan = new Scanner(System.in);
		
		/*
		// This is the Practice set for conditionals from CWH.
		// Chapter 4 . Practice Set

		// Question-1. Find the error and write a correct program.
		System.out.println("Solution of Question 1 .");
		int a = 10;
		if (a == 11)
			{ System.out.println("I am 11");
			}
		else
			{ System.out.println("I am not 11");
			}


		//.Question-2. Write a program to find out whether a is pass or fail; if it requires total 40%  and at least 33% 
		//			   in each subject to pass.Assume 3 subjects and take marks as a input form user.
			
		System.out.println("\n\n\nSolution of Question 2.");
		System.out.print("Enter your marks in subject 1 = ");
		float sub1 = scan.nextFloat();
		System.out.print("Enter your marks in subject 2 = ");
		float sub2 = scan.nextFloat();
		System.out.print("Enter your marks in subject 3 = ");
		float sub3 = scan.nextFloat();
		//System.out.println(sub3);

		float total = 300.0f;
		
		boolean b1 = sub1>=33.0 && sub2>=33.0 && sub3>=33.0;

		float sum = sub1 +sub2 + sub3;
		float percentage =  sum/3.0f;
		
		if (percentage>=40.0 && b1)
			{ System.out.println("Congratulations..Pass");
			}
		else
			{ System.out.println("Better luck next time...Fail");
			}
			

			
*/
		//Question-3.Calculate income tax paid by an employee to the government as per the slabs mentioned in the question( cwh notes)
		//			 there is no tax below 2.5 lakh. take income as input form the user and calculate.
				
				
					// .....................THIS IS THE WRONG SOLUTION..............CODING IS WRIGHT BUT LOGIC IS WRONG.
		// System.out.print("Enter your income = ");
		// int income = scan.nextInt();
	
		// if (income < 250000)
		// 	{ System.out.println("You are not eligible for paying tax.");
		// 	}

		
		// boolean b1 = income > 250000 && income < 500000;
		// boolean b2 = income > 500000 && income < 1000000;
		// boolean b3 = income > 1000000;

		// if (b1)
		// 	{ System.out.println("You have to pay 5% percent tax on your income. ");
		// 	  int amount = income*5/100;
		// 	  System.out.println("The amount you have to pay to the Government = "+ amount);
		// 	}
		
		// else if (b2)
		// 	{ System.out.println("You have to pay 20% percent tax on your income.");
		// 	  int amount = income*20/100;
		// 	  System.out.println("The amount you have to pay to the Government = "+ amount);
		// 	}

		// else if (b3)
		// 	{ System.out.println("You have to pay 30% percent tax on your income. ");
		// 	  int amount = income*30/100;
		// 	  System.out.println("The amount you have to pay to the Government = "+ amount);
		// 	}
		// else
		// 	{ System.out.println("Thanks for using the code.");
		// 	}

			

		// Correct Solution of Question 3.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income in Lakhs per annum");
        float tax = 0;
        float income = sc.nextFloat();
        if(income<=2.5){
            tax = tax + 0;
        }
        else if(income>2.5f && income <= 5f){
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if(income>5f && income <= 10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        else if(income>10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10.0f);
        }

        System.out.println("The total tax paid by the employee is: " + tax);
		
		
		// Question-4. Write a Java Program to find the day of the week . Given the number ( 1 for monday,2 for tuesday	 and so on...!!)

		System.out.print("Enter the Number of day = ");
		byte day = scan.nextByte();

		switch (day)
		{
			case 1 -> System.out.println("Monday");
			case 2 -> System.out.println("Tuesday");
			case 3 -> System.out.println("Wednesday");
			case 4 -> System.out.println("Thursday");
			case 5 -> System.out.println("Friday");
			case 6 -> System.out.println("Saturday");
			case 7 -> System.out.println("Sunday");
		}


		// Question-5. :Write a Java program to find whether a year entered by the user is a leap year or not.



		// Solution 1 . By me
		System.out.print("Enter the year = ");
		int year = scan.nextInt();
		boolean check = year % 4 == 0;

		if (year%400==0)
		{
			check = true;
		}

		 else if (year%100==0)
		{
			check = false;
		}
		

		if (check)
		{
			System.out.println("Year "+ year +" is a leap year.");
		}
		else 
		{
			System.out.println("Year "+ year +" is not a leap year.");
		}


		// Solution 2

	    if(year%4==0 && year%100!=0 || year%400==0)
        {
            System.out.println("Given year is Leap Year");
        }
        else
        {
            System.out.println("Given year is not Leap Year");
        }

	
			

		// Question-6. Write a java program to find out the type of website from the url;
		//	.com – commercial website
		//	.org – organization website
		//	.in – Indian website

		System.out.print("Enter the url of the website = ");
		Scanner inp = new Scanner(System.in);
		String url = inp.nextLine();

		if (url.endsWith(".com"))
		{
			System.out.println("This is a commercial website.");
		}

		else if (url.endsWith(".org"))
		{
			System.out.println("This is a organization website.");
		}
		
		else if (url.endsWith(".in"))
		{
			System.out.println("This is an Indian Website.");
		}
		else
		{
			System.out.println("Please Enter Correct data..!!");
		}
		


	}


	
}