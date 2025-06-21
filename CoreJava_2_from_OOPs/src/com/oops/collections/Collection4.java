package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection<String> c =new ArrayList<>();
		c.add("Venu");
		c.add("Gopal");
		c.add("Ontipuli");
		System.out.println(c.hashCode());  // returns the hash code for this collection
		
		System.out.println(c.isEmpty());
		
		// iterator 
		
		Collection<String> fruits = new ArrayList<>();
		
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Mango");
		fruits.add("Grapes");
		fruits.add("Pineapple");
		
		System.out.println(fruits);
		
		// whenever we going to work with collections we must need to go use with iterator() 
		
		// iterator() -> returns an iterator over the elements in this collection
		// it will returns Iterator Object 
		
		// hasnext() ->  returns true if the iteration has more elements
		// next() -> returns the next element in the iteration
		
		Iterator<String> itr =fruits.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		// for better performance we must need to go for iterator() whenever we working with collections
		
		// in collections we don't have indexes to iteraten 
		
//		Collection<String> veg = new ArrayList<>();
//		
//		veg.add("tomoto");
//		veg.add("tomoto");
//		veg.add("tomoto");
//		veg.add("tomoto");
		
		
		
		

	}

}
