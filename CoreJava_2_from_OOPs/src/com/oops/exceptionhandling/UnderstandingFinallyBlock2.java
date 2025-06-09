package com.exceptionhandling;

public class UnderstandingFinallyBlock2 {

	public static void main(String[] args) {


		System.out.println("mai method started");
		
		try {
			System.out.println("try block executed");
			return;
		// System.out.println("after return");  unreachable code 
		}
		finally {
		
			System.out.println("finally blocl will avoid the return");   // but finally block will execute
		}
		
		// System.out.println("main method ended");  // unreachable code
 
	}

}
