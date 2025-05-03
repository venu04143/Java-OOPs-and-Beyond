package com.stringhandling;

import java.util.Arrays;

public class AlphabeticalOrder {

	public static void main(String[] args) {
		
  	String str ="abstraction";
//		char[] ch = str.toCharArray();
//		
//		String newStr="";
//		for(int i=97;i<122;i++) {
//			for(int j=0;j<ch.length;j++)
//			if(ch[j]==(char) i) {
//				newStr+=(char) i;
//			}
//		}
//		System.out.println(newStr);
  	
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		System.out.println(new String(ch));

	}

}
