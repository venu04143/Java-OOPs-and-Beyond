package com.stringhandling;

public class InsertingString_Into_Another_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 ="Hello World";
		String str2 ="Java";
		int index =6;
		
		
		if(index >str1.length()) {
			index=str1.length();
		}
		
		String str3 = str1.substring(0, 6)+str2+str1.substring(index);
		System.out.println(str3);
		

	}

}
