package com.stringhandling;

public class StringBufferClass {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Venu");
		
		sb.append(" Gopal");
	   System.out.println(sb);
	   
	   sb.setCharAt(4, ' ');
	   System.out.println(sb);
	   
	   sb.setCharAt(5, 'g');
	   System.out.println(sb);
	   
	   sb.append(new char[] {'a','b'});
	   System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);

	}

}
