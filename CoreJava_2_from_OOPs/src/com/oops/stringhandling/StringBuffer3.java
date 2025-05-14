package com.stringhandling;

public class StringBuffer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb =new StringBuffer();
		
		System.out.println(sb.capacity());

		sb.append("SrikanthSrikanthSrikanthSrikanthsrikanthsrikanathsrikanth");
		sb.append("aaaaa");
		sb.append("SrikanthSrikanth");
		sb.append("SrikanthSrikanthaa");
		sb.append("SrikanthSrikanthaaaa ");
		
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		StringBuffer sb1 = new StringBuffer("Venu Gopal");
		sb1.delete(4, sb1.length());
		System.out.println(sb1);
		
		StringBuffer sb2 = new StringBuffer();
		sb2.ensureCapacity(35);
		System.out.println(sb2.capacity());
	}

}
