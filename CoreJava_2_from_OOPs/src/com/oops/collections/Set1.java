package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Spliterator;

public class Set1 {

	public static void main(String[] args) {
		
		Set<Integer> s = new HashSet<>();
		
		s.add(10);
		s.add(null);
		s.add(22);
		s.add(4);
		s.add(5);
		s.add(64);
		s.add(23);
		s.add(23);
		System.out.println(s);
		
		Set<Integer> s1 = new LinkedHashSet<>();
		
		s1.add(11);
		s1.add(11);
		s1.add(22);
		s1.add(33);
		s1.add(44);
		
		System.out.println(s1);
		
		Iterator<Integer>itr=s.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
