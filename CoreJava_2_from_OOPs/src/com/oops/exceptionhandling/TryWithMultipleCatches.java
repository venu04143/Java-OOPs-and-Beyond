package com.exceptionhandling;

import java.util.Scanner;

public class TryWithMultipleCatches {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int a =sc.nextInt();
		System.out.println("Enter Another Number");
		int b=sc.nextInt();
		
		try {
			System.out.println("in try ");
			System.out.println(a/b);
			
			String name =null;
			System.out.println(name.length());
			
		}
		catch(ArithmeticException ar) {
			System.out.println("in catch");
			ar.printStackTrace();
		}
		catch(NullPointerException n) {
			System.out.println("in catch");
			System.out.println(n.toString());
		}
		
		System.out.println("main method ended");
		sc.close();
	}

}
