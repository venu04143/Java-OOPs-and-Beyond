package com.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> lm = new LinkedHashMap<>();
		
		lm.put(1, "Venu");
		lm.put(2, "Gopal");
		lm.put(3, "Pranay");
		lm.put(4, "Eswar");
		lm.put(5, "Luckey");
		
		System.out.println(lm);   // follow insertion order

	}

}
