package com.stringhandling;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String 1 : ");
		String str1 =sc.next();
		sc.nextLine();
		
		System.out.println("Enter String 2 : ");
		String str2 = sc.next();
		sc.nextLine();
		
		int count =0;
		
		
		if(str1.length()==str2.length()){
			for(int i=0;i<str1.length();i++) {
				for(int j=0;j<str2.length();j++) {
					if(str1.charAt(i)==str2.charAt(j)) {
						if(str1.indexOf(str1.charAt(i))==i) {
						count++;
						}
					}
				}
			}
		}

		if(count==str1.length()) {
			System.out.println("Given Strings are Anagrams");
		}else {
			System.out.println("Given Strings are not Anagrams");
		}
	}

}
