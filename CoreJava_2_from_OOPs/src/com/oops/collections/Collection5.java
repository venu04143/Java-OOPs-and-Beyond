package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Collection5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
       Collection<String> fruits = new ArrayList<>();
		
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Mango");
		fruits.add("Grapes");
		fruits.add("Pineapple");
		
		Collection<String> veg = new ArrayList<>();
		
		veg.add("tomoto");
		veg.add("potato");
		veg.add("Banana");
		veg.add("Brinjal");
		veg.add("Carrot");
		
		// retainAll() -> retains only the elements in this collection that are contained in the
		// specified collection (optional operation)
		// whenever we want common data in both collections we will go for retainAll method to retrieve
		
		System.out.println(fruits.retainAll(veg));
		System.out.println(fruits);
		
		// converting collection into array
		
		Object[] arr = veg.toArray();
		for(Object f: arr) {
			System.out.println(f);
		}
				
	}

}
