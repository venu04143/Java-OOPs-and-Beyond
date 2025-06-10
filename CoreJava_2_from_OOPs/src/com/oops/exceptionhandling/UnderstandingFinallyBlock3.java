package com.exceptionhandling;

public class UnderstandingFinallyBlock3 {

	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		try {
			System.out.println(10/0);
		}catch(Exception e) {
			System.out.println(e.toString());
			
			System.exit(0);                  // will terminate the program even though the finally block won't execute
			//return;
		}finally {
			System.out.println("finally block executed");
		}
		System.out.println("main method ended");

	}

}
