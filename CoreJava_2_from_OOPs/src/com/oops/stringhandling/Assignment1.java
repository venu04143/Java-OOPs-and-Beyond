package com.stringhandling;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 
		 *  java 
		 *  
		 *  j ->1
		 *  a ->2 
		 *  v ->1 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		
		String str = sc.next();
		sc.nextLine();
		
		for(int i=0;i<str.length();i++) {
			
			int count=1;
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
			}
			if(str.indexOf(str.charAt(i))==i) {
				System.out.println(str.charAt(i) +" : "+  count);
				
			}
		}

	}

}
