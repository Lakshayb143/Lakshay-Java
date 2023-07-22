package com.lakshay;

import java.util.Scanner;

public class StringFormat
{
	public static void main(String[] args)
	{
		/*
		This is for two methods which perform same task and give same output.
		1) System.out.printf();
		2) System.out.format();
		
		WE USE :-
		%d for Int
		%s for Strings
		%f for float
		%c for char
		
		*/
		int a = 10;
		char b = 'B';
		float c = 3.123456789100f;
		String d = "Lakshay";
		double e = 123.123173129;
		
		System.out.println(e);
		System.out.printf("9 + 1 = %d \n",a);
		System.out.format ("%c comes after A \n",b);
		System.out.format("My name is %s Bhatia \n",d);
		

		// There are some more float in printf or format.	
		// "%.02f" and "%.2f" is same thing
		System.out.format("The value is %f",e);
		System.out.print("\n\n\n");
		System.out.format("The value is %.4f",e); // This %.3f will print only 3 digits after the decimal.
	}
}