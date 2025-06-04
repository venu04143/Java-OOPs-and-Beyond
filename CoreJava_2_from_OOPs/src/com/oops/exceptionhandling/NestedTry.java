package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTry {

	public static void main(String[] args) {
		System.out.println("Main method Started");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int a =sc.nextInt();
		
		System.out.println("Enter b number : ");
		int b=sc.nextInt();
		
		try {
			System.out.println("in  try");
			System.out.println(a+" divide by "+b +" is" +(a/b));
			
			try {
				System.out.println(" nested try ");
				System.out.println("Enter a number");
				int c =sc.nextInt();
				System.out.println("Entered Number is "+c);
			}
			catch(InputMismatchException ip) {
				    System.out.println("in nested catch ");
					System.out.println(ip.toString());
				}
			
		}catch(RuntimeException ar) {
			
			System.out.println("int catch ");
			//System.out.println(ar.getMessage());
			ar.printStackTrace();
		}
		
		System.out.println("Main method Ended");
		sc.close();

	}

}
