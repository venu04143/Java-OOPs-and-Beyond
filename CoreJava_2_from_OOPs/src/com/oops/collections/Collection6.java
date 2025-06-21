package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection <Integer> c =new ArrayList<>();
		
		c.add(10);
		c.add(20);
		c.add(33);
		c.add(40);
		c.add(55);
		c.add(61);
		c.add(70);
		
		System.out.println(c);  // insertion order reserved
		
		Iterator<Integer> itr=c.iterator();
		
		while(itr.hasNext()) {
		    int n=itr.next();
		    
		    if(n%2==0) {
		    	itr.remove();
		    }
		}
		System.out.println(c);

	}

}
