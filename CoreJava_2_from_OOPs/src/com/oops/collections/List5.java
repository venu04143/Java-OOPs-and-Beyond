package com.collections;

import java.util.ArrayList;
import java.util.List;

public class List5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l = new ArrayList<>();
		l.add(5);
		l.add(7);
		l.add(10);
		l.add(12);
		l.add(16);
		l.add(20);
		
		System.out.println(l);
		
		l.remove(l.indexOf(16));
		System.out.println(l);
		
		List<Integer> l1 = l.subList(1, 4); //  returns List Object
		System.out.println(l1);
		
	}

}
