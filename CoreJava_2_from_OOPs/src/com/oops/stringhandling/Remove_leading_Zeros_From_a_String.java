package com.stringhandling;

import java.util.Scanner;

public class Remove_leading_Zeros_From_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String That leads zeros : ");
		String str = sc.next();
		sc.nextLine();
		
		String newStr=removeLeadingZeros(str);
		
		System.out.println("After Removing Leading Zeros the String is : ");
		System.out.println(newStr);
		
		

	}
	
	public static String removeLeadingZeros(String str) {
		
		int i=0;
		
		while(i<str.length() && str.charAt(i)=='0') {
			i++;
		}
		return (i==str.length() ? "0" : str.substring(i));
	}

}
