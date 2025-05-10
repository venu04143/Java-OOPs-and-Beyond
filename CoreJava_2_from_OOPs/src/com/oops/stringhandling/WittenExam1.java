package com.stringhandling;

import java.util.Scanner;

public class WittenExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter as String :");
		String str = sc.nextLine();
		
		String strR=str.replace(" ", "");
		
		String str1="";
		String str2="";
		
		for(int i=0;i<strR.length();) {
			
			for(int count=0;count<2 && i<strR.length();count++,i++) {
				str1=str1+strR.charAt(i);
			}
			for(int count=0;count<2 && i<strR.length();count++,i++) {
				str2=str2+strR.charAt(i);
			}
		}
		System.out.println(str1 +" " +str2);
		String s3 = str1.concat(str2);
		System.out.println(s3);
		
		
	}

}
