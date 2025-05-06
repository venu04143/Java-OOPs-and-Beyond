package com.stringhandling;

import java.util.Scanner;

public class MostOccurenceCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		
		String str = sc.next();
		sc.nextLine();
		
		int[] arr=new int[127];
		
		for(int i=0;i<str.length();i++) {
			arr[str.charAt(i)]=arr[str.charAt(i)]+1;
		}
		
		int max=-1;
		char c=' ';
		
		for(int i=0;i<str.length();i++) {
			if(max<arr[str.charAt(i)]) {
				max=arr[str.charAt(i)];
				c=str.charAt(i);
			}
		}
		
		System.out.println("Most Occurence Character is : "+c+" :"+max);
	}

}
