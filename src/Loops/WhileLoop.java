package com.lakshay;

import java.util.Scanner;

public class WhileLoop{
	public static void main(String[] args){
		int x = 0;
		System.out.println("Before the loop: ");
		while (x<10){
			//System.out.println("In the loop");
			System.out.println("Value of x is = " + x);
			// x = x + 1;
			x++;
			}
		System.out.println("This is after the loop . ");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of natural numbers you want to print = ");
		int natural = scan.nextInt();
		int i = 1;
	
		while (i<= natural)
		{
			System.out.print(i+",");
			i++;
		}


	}


}





