package com.lakshay;

public class OperatorPrecedence{
	public static void main(String[] args){
		// This is for operator precedence.

		// Quick Quiz from cwh notes
		// 1.
		int x = 30;
		int y = 20;
		int expression = (x - y)/2;
		System.out.println(expression);

		// 2.
		int a = 10;
		int b = 30;
		int c = 10;	
		int exp = (b*b - (4*a*c))/(2*a);
		System.out.println(exp); 

		//3.
		int u = 10;
		int v = 20;
		int ex = v*v - u*u;
		System.out.println(ex);

		//4.
		int d = 10;
		int ans = a*b - d;
		System.out.println(ans);
	}
}