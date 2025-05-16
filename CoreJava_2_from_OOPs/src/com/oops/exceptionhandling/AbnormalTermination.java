package com.exceptionhandling;

public class AbnormalTermination {

	public static void main(String[] args) {
		System.out.println("Main method started : ");
		
		System.out.println("Hello Venu");
		System.out.println("Hello Venu");
		System.out.println(10/0);                      // abnormal termination
		System.out.println("Hello Venu");        // in java when an exception happens program execution will stop and remaining code won't execute  
		System.out.println("Hello Venu");
		System.out.println("Hello Venu");
		
		System.out.println("main method ended : ");

	}

}
