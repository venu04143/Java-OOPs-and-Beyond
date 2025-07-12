package com.multithreading;

public class MltProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main method started");
		show();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("main method ended");
		

	}

	static void show() {
		System.out.println("Show method called");
	}
}
