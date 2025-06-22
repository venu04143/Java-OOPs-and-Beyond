package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastFailSafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Directly modifying the list while iterating  would cause ConcurrentModificationException
		
		List<Integer> l =new ArrayList<>();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		
//		for(Integer i : l) {
//			System.out.print(i+" ");
//			l.add(60);                // Fail fast   // ConcurrentModificationException                   
//		}
		
		List<Integer> l1 =new CopyOnWriteArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		
		for(Integer i : l1) {
			System.out.print(i+" ");
			l1.add(60);         // Fail safe Using CopyOnWriteArrayList
		}
		System.out.println();
		System.out.println(l1);
		

		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
			l.add(60);               //  StackOverflowException    :- after adding 60 the size will increase, it will go on
			                                                         // causing StackOverflow
		}
	}

}
