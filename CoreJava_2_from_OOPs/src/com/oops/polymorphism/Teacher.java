package com.polymorphism;

public class Teacher extends Person{

	String teacherSubject;
	double salary;
	
	Teacher(){
		
	}
	
	public Teacher(String teacherSubject, double salary) {
		this.teacherSubject = teacherSubject;
		this.salary = salary;
	}
	
	public Teacher(String name,int age, String address,String teacherSubject, double salary) {
		super(name,age,address);
		this.teacherSubject = teacherSubject;
		this.salary = salary;
	}
	
	void details() {
		System.out.println("Teacher Name : "+name);
		System.out.println("Teacher Age : "+age);
		System.out.println("Teacher Address : "+address);
		System.out.println("Subject : "+teacherSubject);
		System.out.println("Salary: "+salary);
	}
	
}
