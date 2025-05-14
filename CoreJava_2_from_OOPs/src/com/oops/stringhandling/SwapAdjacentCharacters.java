package com.stringhandling;

public class SwapAdjacentCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="abcd";
		
		char[] ch = str.toCharArray();
		
		for(int i=0;i<ch.length;i+=2) {
			
			char temp= ch[i];
			ch[i]=ch[i+1];
			ch[i+1]=temp;
		}
		String newStr = new String(ch);
		System.out.println(newStr);

	}

}
