//package com.lakshay;

import java.util.Scanner;

public class CheckInteger{
	public static void main(String[] args){
		// This is program for checking that user has entered a integer or not.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your input = ");
		boolean check = scan.hasNextInt();
		System.out.println(check); 


	}

}