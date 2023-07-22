// This file is for taking two Variables a and b as input and print their sum.

package com.lakshay;

import java.util.*;

public class InputSum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your first number = ");
		int a = sc.nextInt();
		System.out.print("Enter your second number = ");
		int b = sc.nextInt();
		int sum = a+b;
		System.out.println("The sum of two numbers is = "+sum);
	}
}