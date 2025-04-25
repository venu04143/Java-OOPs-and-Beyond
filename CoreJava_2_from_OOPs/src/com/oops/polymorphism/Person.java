package com.polymorphism;

public class Person {

	String name;
	int age;
	String address;
	
	Person(){
		
	}
	private void display() {
		System.out.println("hello");
	}
	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	
}
