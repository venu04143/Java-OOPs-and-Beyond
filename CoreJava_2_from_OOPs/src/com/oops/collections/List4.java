package com.collections;

import java.util.ArrayList;
import java.util.List;

public class List4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l =new ArrayList<>(10);
		
		l.add(5);
		l.add(7);
		l.add(10);
		l.add(12);
		l.add(16);
		l.add(20);
		
		l.remove(l.indexOf(10));
		System.out.println(l);
		
		List<Double> d =new ArrayList<>();
		d.add(10.0);
		d.add(20.0);
		d.add(30.0);
		d.add(40.0);
		d.add(10.0);
		
		d.remove(10.0);
		
		System.out.println(d);
		
		List<Integer>l1 = new ArrayList<>();
		
		l1.add(5);
		l1.add(7);
		l1.add(10);
		l1.add(12);
		l1.add(16);
		l1.add(20);
		
		System.out.println(l1);
		
		List<Integer>l2 = new ArrayList<>();
		
		l2.add(50);
		l2.add(70);
		l2.add(100);
		l2.add(120);
		l2.add(160);
		l2.add(200);
		
		System.out.println(l2);
		
		List<Integer>l3 = new ArrayList<>();

		l3.addAll(l1);
		System.out.println(l3);
		
		l3.addAll(0, l2);
		System.out.println(l3);
	}

}
