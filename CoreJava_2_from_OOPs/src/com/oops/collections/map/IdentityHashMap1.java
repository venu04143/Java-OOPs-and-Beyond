package com.collections.map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String> m = new HashMap<>();
		
		String s1 = "Sri";
		String s2 = "Sri";
		
		m.put(s1, "VenuGopal");
		m.put(s2, "SAi Ram");
		
		String s3 = new String("Java");
		String s4 = new String("Java");
		
		m.put(s3,"Srikanth");
		m.put(s4,"Vishwa");
		
		
		System.out.println(m);
		
		
		System.out.println("-----------------------------------");
		Map<String,String> m1 = new IdentityHashMap<>();
		

		m1.put(s1, "VenuGopal");
		m1.put(s2, "SAi Ram");
		
		m1.put(s3,"Srikanth");
		m1.put(s4,"Vishwa");
		
		System.out.println(m1);
		
		

	}

}
