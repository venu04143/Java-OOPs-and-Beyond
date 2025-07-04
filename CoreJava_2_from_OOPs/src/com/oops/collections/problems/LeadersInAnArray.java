package com.collections.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeadersInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] arr = {16,17,4,3,5,2};
		
		List<Integer> leaders = new ArrayList<>();
		
		int n =arr.length;
		
		int last = arr[n-1];
		
		leaders.add(last);
		
		for(int i=n-2;i>=0;i--) {
			if(arr[i]>last) {
				last=arr[i];
				leaders.add(last);
			}
		}
		
		System.out.println(leaders);
		
		Collections.reverse(leaders);
		
		System.out.println(leaders);
		
		
	}

}
