package com.lakshay;

import java.util.*;

public class Input{
	public static void main(String[] args){
		// Input taking in Java
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		//sc.next() kewal input ka ek hi word leta hai ...!!!
		System.out.println(name);
		
		// ek word se zyada input lene ke liye hame sc.nextLine() ka use karna hota hai
		Scanner s = new Scanner(System.in);
		String Name = s.nextLine();
		System.out.println(Name);

	}

}
//nextInt() --> Int input lene ke liye.
//nextFloat() --> float ko input lene ke liye.