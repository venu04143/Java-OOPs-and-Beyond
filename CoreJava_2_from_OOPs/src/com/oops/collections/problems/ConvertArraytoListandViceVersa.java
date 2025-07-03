package com.collections.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArraytoListandViceVersa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr = {"A","B","C"};
		
		List<String> s = new ArrayList<>(Arrays.asList(arr));
		
		System.out.println(s);
		
		String[] newarr = s.toArray(new String[0]);
		
		System.out.println(Arrays.toString(newarr));

	}

}
