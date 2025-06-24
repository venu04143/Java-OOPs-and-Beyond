package com.collections;

import java.util.Enumeration;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Integer> v1 = new Vector<>();
		v1.addElement(10);
		v1.addElement(20);
		v1.addElement(30);
		v1.addElement(40);
		v1.addElement(50);
		
		v1.add(0, 99);
		System.out.println(v1);
		v1.setElementAt(98, 0);

		System.out.println(v1);
		
//		Iterator<Integer> itr=v1.iterator();
//		while(itr.hasNext()) {
//			System.out.print(itr.next()+" ");
//		}
		
		Enumeration<Integer> en=v1.elements();
		
		while(en.hasMoreElements()) {
			System.out.print(en.nextElement()+" ");
		}
		
		
	}

}
