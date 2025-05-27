package com.exceptionhandling;

import java.util.Scanner;

public class HandlindStringIndexOutOfBoundsException {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		
		String name = "Venu Gopal";
		System.out.println("Enter index value to get character ");
		int index =sc.nextInt();
		
		try {
			System.out.println("in try ");
			System.out.println(name.charAt(index));
			
		}catch(StringIndexOutOfBoundsException s) {
			
			System.out.println("in catch");
			System.out.println(s.toString());
		}

		System.out.println("main method Ended");
	}

}
