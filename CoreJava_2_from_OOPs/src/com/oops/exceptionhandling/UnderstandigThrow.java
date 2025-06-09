package com.exceptionhandling;

import java.util.Scanner;

public class UnderstandigThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main method started");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number : ");
		int a =sc.nextInt();
		
		System.out.println("enter another number :");
		int b=sc.nextInt();
		
		if(b==0) {
			throw new ArithmeticException("A Number Cannot Divide by Zero");
			
			// System.out.println("Hello");   // unreachable code
		}else {
			System.out.println(a/b);
		}
		System.out.println("main method ended");
		

	}

}
