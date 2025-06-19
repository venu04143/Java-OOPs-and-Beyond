package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Collection3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection<Double> c = new ArrayList<>();
		
		c.add(20000.0);
		c.add(30000.0);
		c.add(40000.0);
		c.add(50000.0);
		
		System.out.println(c);
		

		Collection<Double> c1 = new ArrayList<>();
		
		c1.add(20000.0);
		c1.add(30000.0);
		c1.add(40000.0);
		c1.add(50000.0);
		
		System.out.println(c1);
		
		System.out.println(c.equals(c1));   // checks the content inside both collections  returns true if content is same in both collection
		
		Collection<Float> f = new ArrayList<>();
		
		f.add(100.0f);
		f.add(200f);
		
		System.out.println(f);
		
	}

}
