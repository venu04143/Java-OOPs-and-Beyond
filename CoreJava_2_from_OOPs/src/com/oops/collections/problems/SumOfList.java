package com.collections.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l = new ArrayList<>(Arrays.asList(10,15,20,25));
		
		int sum =0;
		for(Integer n : l) {
			sum+=n;
		}
		
		System.out.println("List: " + l);
        System.out.println("Sum of Elements: " + sum);

	}

}
