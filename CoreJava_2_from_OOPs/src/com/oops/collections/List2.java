package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l= new ArrayList<>(10);
		l.add(0,10);
		l.add(1,20);
		l.add(30);
		l.add(44);
		l.add(55);
		l.add(1,70);
		l.add(5,70);
		l.add(6,70);
		
		l.set(1, 90);
		
		//System.out.println(l);
		
		for(int i=0;i<l.size();i++) {
			System.out.print(l.get(i)+" ");
		}
		System.out.println();
		
		Iterator<Integer> itr =l.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}

}
