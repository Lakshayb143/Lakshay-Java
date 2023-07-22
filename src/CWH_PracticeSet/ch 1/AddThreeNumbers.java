//package com.lakshay;

import java.util.Scanner;

public class AddThreeNumbers{
	public static void main(String[] args){
		// This is a Program for adding 3 integers.
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your First Number = ");
		int num1 = scan.nextInt();
		System.out.print("Enter your Second Number = ");
		int num2 = scan.nextInt();
		System.out.print("Enter your Third Number = ");
		int num3 = scan.nextInt();

		int sum = num1 + num2 + num3;
		System.out.println("Sum of three numbers = "+sum);
		
	}


}