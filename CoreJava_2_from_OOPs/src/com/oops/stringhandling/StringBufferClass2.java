package com.stringhandling;

public class StringBufferClass2 {

	public static void main(String[] args) {
		
		
		StringBuffer sb = new StringBuffer("My Name is Venu Gopal");
		
		String subString = sb.substring(11);
		System.out.println(subString);
		
		subString = sb.substring(11, 15);
		System.out.println(subString);
		
		System.out.println(sb.subSequence(0, 7));
		
		sb.append(" Ontipuli");
		
		System.out.println(sb );
		
		System.out.println(sb.capacity());

	}

}
