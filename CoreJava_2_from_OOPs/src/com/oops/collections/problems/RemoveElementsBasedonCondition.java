package com.collections.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElementsBasedonCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>(Arrays.asList(32,4,5,78,5,10,7));
		
		list.removeIf(n-> n > 10);
		
		System.out.println(list);
		
		
	}

}
