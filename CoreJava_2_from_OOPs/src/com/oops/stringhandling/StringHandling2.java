package com.stringhandling;

public class StringHandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb1 = new StringBuilder("Venu Gopal");
	
		sb1.append("Ontipuli");
		
		System.out.println(sb1);
		
		sb1.insert(10," ");
		System.out.println(sb1);
		
		sb1.delete(10, 11);
		System.out.println(sb1);
		
		sb1.deleteCharAt(0); 
		System.out.println(sb1);
		
		sb1.insert(0, "V");
		System.out.println(sb1);
		
		System.out.println(sb1.reverse());
		sb1.reverse();
		System.out.println(sb1);
		
		System.out.println(sb1.capacity());
		
		StringBuilder sb2 = new StringBuilder();
		System.out.println(sb2.capacity());
		sb2.ensureCapacity(100);
		System.out.println(sb2.capacity());
		
		
		StringBuilder s1 = new StringBuilder("Venu");
		StringBuilder s2 = new StringBuilder("Venu");
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1 == s2);
		
		System.out.println(s1.compareTo(s2));
		
		}

}
