package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arr = new Integer[] {1,2,3,4};
		
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(arr));
		
		System.out.println(al.size());
		System.out.println(al);
		
		System.out.println(al.contains(3));
		
		System.out.println(al.getLast());
		System.out.println(al.getFirst() );
		
		Collections.synchronizedList(al);
		
	}

}
