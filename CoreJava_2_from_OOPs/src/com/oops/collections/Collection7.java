package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection<String> list = new ArrayList<>();
		
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		
		Iterator<String> itr=list.iterator();
		
		while(itr.hasNext()) {
			String fruit = itr.next();
			System.out.println(fruit);
			if(fruit.equals("Banana")) {
				itr.remove();
			}
		}
		
		list.add("Grapes");
		list.add("Mango");
		//System.out.println(list);
		
       Collection<String> list2 = new ArrayList<>();
		
		list2.add("Apple");
		list2.add("Banana");
		list2.add("Orange");
		list2.add("PineApple");
		list2.add("SugarBanana");
		
		Collection<String> list3 = new ArrayList<>();

		list3.addAll(list);
		System.out.println(list3);
		
		list3.addAll(list2);
		System.out.println(list3);
		
		list2.retainAll(list);
		
		System.out.println(list2);
		System.out.println(list);
//		
//		list3.remove("Apple");
//		System.out.println(list3);
//		
//		list3.removeAll(list);
//		System.out.println(list3);
//		
	}

}
