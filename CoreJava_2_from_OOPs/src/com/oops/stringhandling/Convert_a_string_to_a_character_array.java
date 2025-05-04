package com.stringhandling;

import java.util.Arrays;
import java.util.Scanner;

public class Convert_a_string_to_a_character_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String To Convert Character Array : ");
		String str = sc.nextLine();
		
		
		char[] ch = str.replace(" ", "").toCharArray();
		
		System.out.println(Arrays.toString(ch));

	}

}
