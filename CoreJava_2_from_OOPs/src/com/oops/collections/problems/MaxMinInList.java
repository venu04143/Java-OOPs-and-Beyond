package com.collections.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxMinInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer [] arr = {1,23,67,45,32};
		
		List<Integer> list= new ArrayList<>(Arrays.asList(arr));
		
		int max = Collections.max(list);
		int min = Collections.min(list);
		
		System.out.println("Maximum Value in the List : "+max);
		System.out.println("Minimum Value in the List : "+min);

	}

}
