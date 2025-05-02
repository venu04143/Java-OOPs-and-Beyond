package com.stringhandling;

import java.util.Scanner;

public class CountEachCharacterOccerences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String to Count The Charaters Occurences : ");
		String str =sc.next();
		
		int[] arr = new int[127];
		
		for(int i=0;i<str.length();i++) {
			
			arr[str.charAt(i)]=arr[str.charAt(i)]+1;
		}
		
		
		for(int i=0;i<str.length();i++) {
			
			int max=-1;
			char c =' ';
			
			if(max<arr[str.charAt(i)]) {
				max=arr[str.charAt(i)];
				c=str.charAt(i);
			}
			if(str.indexOf(str.charAt(i))==i) {
				System.out.println(str.charAt(i) +" : "+  max);
				
			}
		}
		
	}

}
