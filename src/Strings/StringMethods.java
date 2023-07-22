//package com.lakshay;

import java.lang.String;

public class StringMethods
{
	public static void main(String[] args)
	{
		// This is a program for using String Methods.
		String str = "Lakshay Bhatia";
		String name = "Lakshay";
		String s1 = new String("Java Strings");
		
		// String Methods
		// 1. String.length() = Returns a integer which is the length of the string.
		
		int lenstr = str.length();
		System.out.println("Length of the String str " +lenstr);
		int lenname = name.length();
		System.out.println("Length of the String name " +lenname);


		// 2. String.toLowerCase() = Returns a String with all the letters/alphabets converted to lower case.
		str = "LAKSHAy bhATIA";
		String lower_str = str.toLowerCase();
		System.out.println(lower_str);

		str = "Lakshay Bhatia";

		// 3. String.toUpperCase() = Returns a String with all the letters/alphabets converted to Upper Case.
		
		String Upper_str = str.toUpperCase();
		System.out.println(Upper_str);
		

		// 4.String.trim() = Returns a String after removing all the leading and trailing spaces from the original string.
		
		String nonTrimmedStr = " 			Lakshay					";
		System.out.println("String with leading and trailing spaces  = "+nonTrimmedStr);
		String TrimmedStr = nonTrimmedStr.trim();
		System.out.println("String after using trim() method = "+TrimmedStr);

		// 5.1. String.equals(String) = Returns true if the given string is equal to String given in argument.Otherwise false is returned
		//							 This is case sensitive.
		
		boolean check = name.equals("Lakshay");
		System.out.println(check);
		boolean check2 = str.equals("Harsh");
		System.out.println(check2);

		// 5.2. String.equalsIgnoreCase(string) = Returns true if two strings are equal ignoring the case of characters.

		boolean check3 = name.equalsIgnoreCase("LAKSHAY");
		System.out.println("using String.equalsIgnoreCase() = "+check3);

		// 6. String.charAt(int Index) = Returns character at a given index (in method argument) position.

		char var= str.charAt(8);
		char var2 = str.charAt(9);
		System.out.println(var);
		System.out.println(var2);

		// 7. String.startsWith("St") = Returns true if String starts with "St".(true in this case)
		
		boolean boolvar = str.startsWith("Lak");
		System.out.println(boolvar);

		// 8. String.endsWith("ng") = Returns true if Strings ends with "ng".

		boolean boolvar2 = str.endsWith("Bhatia");
		System.out.println(boolvar2);
		boolvar2 = name.endsWith("akshay");
		System.out.println(boolvar2);



		// 9. String.replace('old char','new char') = Returns a new string after replacing all old char with new char .Happy is returned in this case.
		
		//    String.replace("Old String","New String") = Returns a new string after replacing old string with new string.
		
		String replaced = str.replace('a','b');
		System.out.println("Original String  = "+ str);
		System.out.println("String after using str.replace('a','b') = "+replaced);
		
		System.out.println("Original String  = "+ str);
		replaced = str.replace("Bhatia","Kumar");
		System.out.println(replaced); 	

		System.out.println("Original String  = "+ str);
		replaced = str.replace("h","IER");
		System.out.println(replaced); 
		


		  /* 
		   10.1. String.substring(int start) = Returns a substring of the given string from specified start index(inclusive).
											   This methods throws an IndexOutOfBoundException when the start index is larger than the
											   length of the string or less than zero.
		   10.2. String.substring(int start,int end) = Returns a substring of the given string from specified start index(inclusive) to end index(exclusive).
													   This method throws an IndexOutOfBoundException when
															1) start index is less than zero.
															2) start index is larger than end index
															3) end index is larger than the length of the string.	
			In case of Strings:
				* start index --> inclusive
				* end index --> exclusive
		
			*/


			String substr = str.substring(8);
			System.out.println(substr) ; // ans=Bhatia
			String subname = name.substring(1,6);
			System.out.println(subname); // ans=akshay --> WRONG ANSWER YOU FORGOT THAT END INDEX IS EXCLUSIVE NOT INCLUSIVE.
 			subname = name.substring(1,7); 
			System.out.println(subname);// NOW THE ANSWER IS akshay. BECAUSE END INDEX IS EXCLUSIVE.

			
			
			
			// 11.1 String.indexOf(String) = Returns the int index of a given String .
			//							     For Example --> str = "Lakshay Bhatia"
			//												 str.indexOf("ati") returns 10 which is the first occurrence of ati in str
			//												 Otherwise -1.
		
			int index = str.indexOf("ati");
			System.out.println(index); // ans=10
			index = name.indexOf("ay");
			System.out.println(index); // ans=5
			

			// 11.2. String.indexOf(String,int index) = Returns the index of the given string starting from the int index
			// 											-1 is returned if given String is not found in the original string
			// 	NOTE == INT INDEX IS INCLUSIVE. IT START SEARCHING WITH THE GIVEN INDEX.      

			
			int Index = str.indexOf("ay",7);
			System.out.println(Index); // ans = -1
			Index= str.indexOf("ay",5);
			System.out.println(Index); // ans = 5
			
			// 12.1. String.lastIndexOf(string) = Returns the last index of the given string
			
			int lastindex = str.lastIndexOf("a");
			System.out.println(lastindex); //ans= 13
			lastindex = str.lastIndexOf("y");
			System.out.println(lastindex);//ans = 6
			
			// 12.2. String.lastIndexOf(string,int index) = Retuns the last index of the given string before the int index.
			
			// NOTE = INT INDEX IN INCLUSIVE.	

			int Lastindex = str.lastIndexOf("a",7);
			System.out.println(Lastindex);// ans=5
			Lastindex = str.lastIndexOf("a",1);
			System.out.println(Lastindex);	// ANS = 1

			/*
			Escape sequence characters = sequence of characters after backslash \
			
			Escape sequence characters consist of more than one characters but represents one character when used within the Strings.
			example= \n ,\t ,\' ,\\ etc.

			*/
		
			System.out.print("lakshay\'\n\n\nbhatia");
			
			
			
		
	}
}