package com.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class Set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set s = new TreeSet();
		
		s.add(10);
		s.add(20);
		s.add(60);
		s.add(40);
		s.add(10);
		// s.add("Venu");
		System.out.println(s);
		
		Set<String> s1 = new TreeSet<>();
		
		s1.add("venu");
		s1.add("gopal");
		s1.add("ram");
		s1.add("pranay");
		
		System.out.println(s1);

	}

}
