//package com.lakshay;

import java.util.*;

public class OddEven {
	public static void main(String[] args) {
		// This method takes a number as a input from user and check whether it's even or odd.
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your number = ");
		int num = scan.nextInt();

		if (num % 2 == 0) {
			System.out.println("The number is a Even number.");
			} 
		else {
			System.out.println("The number is a Odd number.");
			}
		

	}

}



