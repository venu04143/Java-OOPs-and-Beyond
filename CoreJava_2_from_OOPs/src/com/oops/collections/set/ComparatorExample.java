package com.collections.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student[]  arr= {   new Student(102,"subhan",900),
		                   new Student(105,"srujana",500),
		                   new Student(104,"hema",449),
		                    new Student(103,"venu",800)
		                 };
		
		Comparator<Student> comparator = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getSid()-o2.getSid();
			}
		};
		
		List<Student> list = new ArrayList<>(Arrays.asList(arr));
		
		Collections.sort(list,comparator);
		
		System.out.println(list);
		
	}

}
