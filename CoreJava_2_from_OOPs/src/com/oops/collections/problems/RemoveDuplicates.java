package com.collections.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<>(Arrays.asList(10,10,20,30,20,40,50));
		
		Set<Integer> unique = new LinkedHashSet<>(list);
		
		List<Integer> newList = new ArrayList<>(unique);
		
		System.out.println(newList);

	}

}
