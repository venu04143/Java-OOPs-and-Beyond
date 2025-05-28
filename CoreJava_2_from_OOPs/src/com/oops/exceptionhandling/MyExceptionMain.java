package com.exceptionhandling;

import java.util.Scanner;

public class MyExceptionMain {

	public static void main(String[] args) throws MyException {


		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a =sc.nextInt();
		
		System.out.println("enter another Number");
		int b=sc.nextInt();
		
		if(b==0) {
			throw new MyException("B is Zero");
		}else {
			System.out.println(a/b);
		}
	}

}
