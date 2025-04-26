package com.polymorphism;

public class Staff extends Teacher{

	Teacher t1 = new Teacher("Venu",23,"Chilakaluripet","Java",24000);
	
	void details() {
		t1.details();
	}
	
	public static void main(String[] args) {
		Staff  s1 = new Staff();
		s1.details();
		System.out.println(new int[] {1,2,3});
		
		String name =null;
		System.out.println(name);
	}
}
