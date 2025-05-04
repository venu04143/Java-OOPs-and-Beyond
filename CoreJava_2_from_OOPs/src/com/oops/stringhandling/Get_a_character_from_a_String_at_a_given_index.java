package com.stringhandling;

import java.util.Scanner;

public class Get_a_character_from_a_String_at_a_given_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String str =sc.nextLine();
		
		System.out.println("Enter an Index Value to get Character That present in String : ");
		
		int index = sc.nextInt();
		
		if(index < 0 || index >= str.length()) {
			System.out.println("Not a Valid Index : Index is Too long");
		}else {
			char c= str.charAt(index);
			System.out.println("Character at Index "+index+" is : "+c);
		}
		
		
	}

}
