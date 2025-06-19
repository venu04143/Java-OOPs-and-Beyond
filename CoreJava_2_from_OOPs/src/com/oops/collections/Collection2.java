package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Collection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// collections can store both homogeneous and heterogeneous data
		
		// Collection interface specific methods 
		
		Collection<String>boys =new ArrayList<>();
		
		boys.add("Venu");
		boys.add("Ram");
		boys.add("Tharun");
		boys.add("Pranay");
		boys.add("Eswar");
		
		System.out.println(boys);
		
		Collection<String> girls =new ArrayList<>(10); // mentioning capacity(size) is optional 
		
		// size , whether we give are not it has growable in nature
		
		girls.add("Anunya");
		girls.add("Praneela");
		girls.add("Hema");
		girls.add("Vyshu");
		girls.add("Harshini");
		
		System.out.println(girls);
		
		Collection<String> students = new ArrayList<>();
		
		students.addAll(boys);
		students.addAll(girls);
		
		// boys.clear();  removes all the contents or elements inside  a Collection

		System.out.println(students);
		
		System.out.println(boys.contains("Venu"));  // returns true if the collection contains the specific element
		
		System.out.println(students.containsAll(boys)); // returns true if the collection contains all of the elements in the specified collection
		
		System.out.println(students.containsAll(girls));
		
//		boys.clear();
//		System.out.println(boys);
//		
//		System.out.println(students.containsAll(boys));
		
		boys.add("Vamshi");
		System.out.println(students.containsAll(boys));
		
		// Collection is a raw type. References to generic type Collection<E> should be parameterized
		
		// providing the specific datat type to the Collection is the concept of generics
		Collection<Integer>c = new ArrayList<>();
	}

}
