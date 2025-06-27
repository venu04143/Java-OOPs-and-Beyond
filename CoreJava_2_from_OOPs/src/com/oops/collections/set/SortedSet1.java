package com.collections.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortedSet<Integer> ss = new TreeSet<>();
		
		ss.add(50);
		ss.add(30);
		ss.add(40);
		ss.add(10);
		ss.add(20);
		
		System.out.println(ss);   // will sort asending order
		
		System.out.println(ss.first());
		System.out.println(ss.last());
		
		System.out.println(ss.headSet(30)); // Returns a view of the portion of this set whose elements are strictly less than toElement
		System.out.println(ss.tailSet(30)); // Returns a view of the portion of this set whose elements are greater than or equal to fromElement
		
		
		SortedSet<String> ss1 = new TreeSet<>();
		
		ss1.add("Venu");
		ss1.add("Pranay");
		ss1.add("Eswar");
		ss1.add("Luckey");
		
		System.out.println(ss1);
		

	}

}
