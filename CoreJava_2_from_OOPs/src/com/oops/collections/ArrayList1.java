package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> al = new ArrayList<>();
		// we should never create Objects like this
		// because our code implementation will be shown
		
		// upcasting is the process of abstraction
		al.add("Srikanth");
		al.add("Venu");
		al.add("Venkat");
		al.add("Srinu");
		al.add("Tarun");
		al.add("Nag");
		al.add("Ram");
		
		List<String> s1 =al.subList(2, 5);
		
		System.out.println(s1);
		
	}

}
