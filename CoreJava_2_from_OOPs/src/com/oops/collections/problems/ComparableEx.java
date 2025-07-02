package com.collections.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
	int sid;
	String name;
	int marks;
	
	public Student(int sid, String name, int marks) {
		this.sid = sid;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) {
		if(this.sid<o.sid) {
			return -1;
		}else if(this.sid>o.sid) {
			return 1;
		}else {
			return 0;
		}
	}	
}
public class ComparableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student[] arr = {
				new Student(103,"Venu",350),
				new Student(102,"eswar",550),
				new Student(105,"pranay",850),
				new Student(101,"luckey",360),
		};   
		
		List<Student> list = new ArrayList<>(Arrays.asList(arr));
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

}
