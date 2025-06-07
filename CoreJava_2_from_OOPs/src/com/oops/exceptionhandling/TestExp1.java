package com.exceptionhandling;

public class TestExp1 {

	public static void main(String[] args) throws ArithmeticException,NullPointerException{
		// TODO Auto-generated method stub
		
		int a =10;
		int b =2;
		
		int c =a/b;
		
		System.out.println(c);
		
		String name = null;
		System.out.println(name.length());

	}

}
