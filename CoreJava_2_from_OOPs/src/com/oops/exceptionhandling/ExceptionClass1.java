package com.exceptionhandling;

import java.util.Scanner;

public class ExceptionClass1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		int a =sc.nextInt();
		
		System.out.println("Enter b Number : ");
		int b =sc.nextInt();
		
		try {
			int c = a/b;
			System.out.println("a divide by b is :"+c);
		}catch(Throwable e) {
			
			System.out.println("b value is zero ,a number cannot divisible by zero :");
			e.printStackTrace();
			System.out.println(e);
			
		}
		System.out.println("main method ended");
	}

}
