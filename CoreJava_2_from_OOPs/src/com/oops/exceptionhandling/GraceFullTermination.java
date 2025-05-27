package com.exceptionhandling;

public class GraceFullTermination {

	public static void main(String[] args) {
		
		System.out.println("main method started : ");
		
//		System.out.println("hello Venu Gopal");
//		System.out.println("hello Venu Gopal");
//		System.out.println("hello Venu Gopal");
		
		try {
			System.out.println(10/0);               // even though an exception occur the program execution reached end this is called 
			                                        // Graceful termination 
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
//		System.out.println("hello Venu Gopal");
//		System.out.println("hello Venu Gopal");
//		System.out.println("hello Venu Gopal");
		
		System.out.println("main method ended ");

	}

}
