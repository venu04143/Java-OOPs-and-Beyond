package com.multithreading;

public class MltProgram2 extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main method started");
		MltProgram2 t1 = new MltProgram2();
		t1.start();
		
		for(int i=0;i<100;i++) {
			System.out.println("main "+i);
		}
		
		System.out.println("main method ended");

	}
	
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("Hello "+i);
		}
	}

}
