package com.collections;

import java.util.Arrays;
import java.util.Vector;

public class Vector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> v1 = new Vector<>();
		v1.add("Venu");
		v1.add("Gopal");
		v1.add(0, "Ontipuli");
		v1.add("pranay");
		v1.add("eswar");
		v1.add("luckey");
		v1.add("vyshu");
		v1.add("hani");
		v1.add("purna");
		v1.add("dhana");
		v1.add("koti");
		
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		 
		// size != capacity 
		
		Vector<String> v2 =new Vector<>();
		v2.add("Laksman");
		v2.add("Venukayamma");
		v2.add("Adiseshu");
		
		System.out.println(v2);
		
//		for(int i=0;i<v2.size();i++) {
//			v1.add(v2.get(i));
//		}
		//v1.addAll(v2);
		v1.addAll(0, v2);
		
		System.out.println(v1);
		
		System.out.println(v1.get(6));
		
		v1.remove(0);
		System.out.println(v1);
		
		v1.removeAll(v2);
		System.out.println(v1);
		
		//v2.clear();
		
		System.out.println(v2);
		
		System.out.println(v1.contains("Ontipuli"));
		
		System.out.println(v1.contains(v2));
		
		System.out.println(v1.indexOf("Venu"));
		System.out.println(v1.lastIndexOf("Venu"));
		System.out.println(v1.firstElement());
		System.out.println(v1.lastElement());
		
		Object[] arr =v1.toArray();
		
		System.out.println(Arrays.toString(arr));
	}

}
