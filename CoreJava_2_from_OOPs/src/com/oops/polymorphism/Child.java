package com.polymorphism;

public class Child extends Parent{

	@Override
	void play() {
		System.out.println("Playing Cricket");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent p =new Child();
		p.play();
		
	}

}
