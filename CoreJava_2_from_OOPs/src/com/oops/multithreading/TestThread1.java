package com.multithreading;

public class TestThread1 extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main method started");
		
		TestThread1 t1 = new TestThread1();
		t1.start();
		
//		t1.run();
		
		for(int i=0;i<=10;i++) {
			System.out.println("main "+i);
		}
		
		
		System.out.println("main method ended");

	}
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("welcome "+i);
		}
		
	}

}
