package com.stringhandling;

import java.util.Scanner;

public class ReverseTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A String");
		String str = sc.nextLine();
		String reverseStr = "";
		for(int i=0;i<str.length();i++) {
			char c= str.charAt(i);
			reverseStr=c+reverseStr; 
		}
		System.out.println(reverseStr);
		
		if(str.equals(reverseStr)) {
			System.out.println(str+" is Palindrome");
		}else {
			System.out.println(str +" Not palindrome");
		}
	}

}
