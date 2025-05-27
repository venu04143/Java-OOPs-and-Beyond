package com.exceptionhandling;

public class HandlingNullPointerException {

	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		String name=null;
		try {
			System.out.println("in try ");
			String lower = name.toLowerCase();
			System.out.println(lower);
		}
		catch(NullPointerException np) {
			
			System.out.println("in catch ");
			System.out.println(np.getMessage());
		}
		
		System.out.println("main method ended");
		

	}

}
