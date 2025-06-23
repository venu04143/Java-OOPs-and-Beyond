package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// mirror image output
		 
		List<String> l = new ArrayList<>();
		
		l.add("J2SE");
		l.add("J2EE");
		l.add("J2ME");
		l.add("Servelts");
		l.add("JSP");
		l.add("JDBC");
		
		ListIterator<String> litr=l.listIterator();

		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		System.out.println("***************");
		
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
		
		System.out.println(l.indexOf("J2SE"));
	}

}
