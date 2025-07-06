package com.collections.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,3,5,4,6,7,5,8));
		
		Set<Integer> tree = new TreeSet<>(list);
		
		System.out.println(tree);
		
		List<Integer> list2 = new ArrayList<>(tree);
		
		int secondLarge = list2.get(list2.size()-2);
		
		System.out.println(secondLarge);
		
	}

}
