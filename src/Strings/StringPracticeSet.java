package com.lakshay;

import java.util.*;

public class StringPracticeSet
{
	public static void main(String[] args)
	{	
		// This is the practice set of ch strings.

		
		// Question-1. Write a java program to convert a string to lowercase
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String = ");
		String str = scan.nextLine();
		System.out.println("Original String = "+str);
		String low = str.toLowerCase();
		System.out.println("String converted to lowercase = "+low);

		System.out.println("\n\n\n");
		
		// Question-2. Write a Java program to replace spaces with underscores
		
		Scanner q2 = new Scanner(System.in);
		System.out.print("Enter the string with spaces = ");
		String str2 = q2.nextLine();
		System.out.println("Original String = "+str2);
		String replaced = str2.replace(" ","_");
		System.out.println("String after spaces are replaced with underscores = "+replaced);

		System.out.println("\n\n\n");

		//Question-3. Write a java program for replacing <|name|>	with some name.


		String leTTer = "Dear <|name|> , Thanks a lot.";
		String str3 = leTTer.replace("<|name|>","Lakshay");
		System.out.println(str3);

		System.out.println("\n\n\n");

		//Question-4. Write a java program to detect double or triple spaces in a string.
		
		Scanner q4 = new Scanner(System.in);
		String str4 = q4.nextLine();
		int index = str4.indexOf("  ");
		int inde = str4.indexOf("   ");
		System.out.println("Double spaces are at = " +index);
		System.out.println("Triple spaces are at = " +inde);




		System.out.println("\n\n\n");

		// Question-5. Write a program to format the following letter using escape sequence characters.
		
		//  letter = "Dear Harry,This java course is nice. Thanks".
	
		String letter = "\"Dear Harry, This java course is nice. Thanks\" ";
		System.out.println(letter);
		



		


	}

}