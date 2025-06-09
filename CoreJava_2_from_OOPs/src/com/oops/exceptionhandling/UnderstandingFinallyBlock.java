package com.exceptionhandling;

import java.util.Scanner;

/* why we need multiple catches 
 * 
 * can we have try and catch blocks inside finally if is it good
 * 
 * */

public class UnderstandingFinallyBlock {

	public static void main(String[] args) {
		
		
		System.out.println("main Method Started");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		int a =sc.nextInt();
		
		System.out.println("Enter another Number ");
		int b =sc.nextInt();
		
		try {
			System.out.println("in try ");
			System.out.println(a/b);
		}catch(ArithmeticException e) {
			System.out.println("in catch");
			System.out.println(e.toString());
			System.out.println(10/0);
		}
		finally {
			System.out.println("finally block Always Execute");
		}

	}

}
