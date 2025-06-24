package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student {
	
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	int id;
	String name;
	int marks;

	public static void main(String[] args) {
		
		Comparator<Student> com=new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
//				if(o1.id<o2.id) {
//					return -1;
//				}else if(o1.id<o2.id) {
//					return 1;
//				}else {
//					return 0;
//				}
				return o1.id-o2.id;
			}
		};
		Comparator<Student> com1=new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
//				if(o1.marks<o2.marks) {
//					return -1;
//				}else if(o1.marks<o2.marks) {
//					return 1;
//				}else {
//					return 0;
//				}
				return o1.marks-o2.marks;
			}
		};
		Student s1=new Student(3, "Guna", 90);
		Student s2=new Student(2, "Venu", 99);
		Student s3=new Student(1, "Gopal", 92);
		Student s4=new Student(4, "Sekhar", 95);
		
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		System.out.println(al);
		
		Collections.sort(al,com1);
		
		System.out.println(al);

	}

}
