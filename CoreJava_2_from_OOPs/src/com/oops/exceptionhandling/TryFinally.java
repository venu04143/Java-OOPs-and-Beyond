package com.exceptionhandling;

import java.util.Scanner;

public class TryFinally {

	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number :");
		int a =sc.nextInt();
		System.out.println("Enter another Number");
		int b=sc.nextInt();
		
		try {
			System.out.println("in try");
			System.out.println(a/b);
		}finally {                                         // finally block always executes except(when before system.exit(0) trigger)
			System.out.println("Finally block");
		}

	}

}
