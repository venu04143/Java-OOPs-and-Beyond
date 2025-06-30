package com.collections.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SumOfTwoNumsEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l = new ArrayList<>(Arrays.asList(2,4,3,5,7,8,-1));
		int target = 7;
		Map<Integer,Integer> m = new HashMap<>();
		
		
		for(int i=0;i<l.size();i++) {
			for(int j=i+1;j<l.size();j++) {
				if(l.get(i)+l.get(j)==target) {
					m.put(l.get(i),l.get(j));
				}
			}
		}
		System.out.println(l);
		System.out.println(m);
		
		
		Set<Map.Entry<Integer,Integer>> entry = m.entrySet();
		
		System.out.println("Sum of two elements is equal to : "+target);
		for(Map.Entry<Integer,Integer> pair : entry) {
			System.out.println("("+pair.getKey() +","+pair.getValue()+")");
		}
		
	}

}
