package com.collections;

import java.util.Vector;

public class ClassCastExceptionExapmle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// vector introduced in 1.0 version
		// Collection introduced in 1.2 version
		
		 
		
		Vector v1 = new Vector();
		v1.add(1);
		v1.add(2);
		v1.add(3);
		v1.add("venu");
		
		int sum=0;
		
		for(int i=0;i<v1.size();i++) {
			sum += (Integer)v1.get(i);   // will throw Runtime Exception as ClassCastException
		}
		
	}

}
