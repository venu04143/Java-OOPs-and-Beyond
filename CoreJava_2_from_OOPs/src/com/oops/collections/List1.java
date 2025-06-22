package com.collections;

import java.util.ArrayList;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l =new ArrayList<>();
		
		l.add(5);
		l.add(10);
		l.add(15);
		l.add(2);
		l.add(3);
		l.add(7);
		l.add(3);
		l.add(7);
		l.add(null);
		
		System.out.println(l);
		
		l.add(0,20);
		System.out.println(l);
		
//		l.add(13,60);
//		System.out.println(l);
		
		List<Integer> l2 = new ArrayList<>(10);
		// l2.add(1,10);   indexoutofbounds exception
		
		System.out.println(l2);
		
	}

}
