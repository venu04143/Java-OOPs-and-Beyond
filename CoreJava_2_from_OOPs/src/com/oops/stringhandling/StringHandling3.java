package com.stringhandling;

import java.util.Arrays;

public class StringHandling3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(String name : args) {
			System.out.println(name);
		}

		// intern Method
//		
//		String s1 = "Venu Gopal";
//		String s2 = "Venu Gopal";
//		
//		String s3 = new String("Venu");
//		String s4 = new String("Venu");
//		
//		String s5 = "Gopal";
//		
//		System.out.println(s1.intern()==s2.intern());
//		
//		System.out.println(s3.intern()==s4.intern());
//		
//		System.out.println(s4.intern()==s5.intern());
//		
//		System.out.println(s5.intern());
		
		
		String st1 = "       Venu Gopal ";
		//System.out.println(Arrays.toString(st1.getBytes()));
		
		System.out.println(st1.valueOf(5));
		System.out.println(Arrays.toString(st1.split(" ")));
		
		System.out.println(st1.strip());
		System.out.println(st1.stripIndent());
		System.out.println(st1.trim());
		
		
		
	}

}
