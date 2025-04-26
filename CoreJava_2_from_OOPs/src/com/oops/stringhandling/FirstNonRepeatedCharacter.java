package com.stringhandling;

import java.util.Scanner;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String ");
		
		String str = sc.nextLine();
		
		int start =0;
		int end=str.length()-1;
		
		while(start<end) {
			if(str.charAt(start)==str.charAt(end)) {
				start++;
				end--;
			}else {
				end--;
			}
		}
		
		if(start>end) {
			System.out.println("No Unique Characters in String");
		}else {
			System.out.println("First Non Repeating Character is "+str.charAt(start));
		}
			
	}

}
