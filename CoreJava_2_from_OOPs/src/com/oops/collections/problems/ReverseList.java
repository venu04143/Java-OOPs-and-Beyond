package com.collections.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,500));
		
//		Collections.reverse(list);
//		
//		System.out.println(list);
		
		// without Collections.reverse() method
		
		int s=0;
		int e =list.size()-1;
		
		while(s<e) {
			int temp=list.get(s);
			
			list.set(s, list.get(e));
			
			list.set(e, temp);
			
			s++;
			e--;
		}
		System.out.println(list);

	}

}
