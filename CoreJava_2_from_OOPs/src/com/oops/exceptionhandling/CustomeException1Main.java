package com.exceptionhandling;

import java.util.Scanner;

public class CustomeException1Main {

	public static void main(String[] args)throws CustomeException1 {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Name : ");
		String name=sc.nextLine();
		
		if(name.startsWith("0")){
			throw new CustomeException1("Name Cannot Start With Numbers");
		}else {
			System.out.println("Entered Name :"+name);
		}

	}

}
