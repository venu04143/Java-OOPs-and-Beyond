package com.polymorphism;

public class Student extends Person{

	int studentID;
	String studentMarks;
	
	public Student(int studentID, String studentMarks) {
		this.studentID = studentID;
		this.studentMarks = studentMarks;
	}
	
	public Student(String name,int age,String address,int studentID, String studentMarks) {
		super(name,age,address);
		this.studentID = studentID;
		this.studentMarks = studentMarks;
	}
	
	
	void details() {
		System.out.println("Student Name : "+name);
		System.out.println("Student Age : "+age);
		System.out.println("Student Address : "+address);
		System.out.println("Student Id : "+studentID);
		System.out.println("Student Marks : "+studentMarks);
	}
	
	
	
}
