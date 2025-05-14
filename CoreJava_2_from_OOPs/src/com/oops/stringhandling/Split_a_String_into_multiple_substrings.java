package com.stringhandling;

import java.util.Scanner;

public class Split_a_String_into_multiple_substrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String to Spilt Multiple SubStrings : ");
		
		String str = sc.nextLine();
		
		String [] arr = str.split(" ");
		System.out.print("[");
		for(String sub : arr) {
			System.out.print(sub+",");
		}
		System.out.println("]");

	}

}
