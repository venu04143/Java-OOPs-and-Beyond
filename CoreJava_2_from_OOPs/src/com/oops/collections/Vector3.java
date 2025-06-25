package com.collections;

import java.util.Arrays;
import java.util.Vector;

public class Vector3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> v1 =new Vector<>();
		System.out.println(v1.capacity());
		System.out.println(v1.size());
		
		Object[] arr = new Object[] {1,2,3,4,5};
		
		Vector<Integer> v2 =new Vector(Arrays.asList(arr));
		System.out.println(v2.capacity());
		System.out.println(v2.size());

	}

}
