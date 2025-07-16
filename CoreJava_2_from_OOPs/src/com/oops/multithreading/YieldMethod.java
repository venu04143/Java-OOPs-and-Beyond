package com.multithreading;

class YThread1 extends Thread{
	@Override
	public void run() {
		
		System.out.println("Run Called ");
		Thread.yield();
		for(int i=0;i<=10;i++) {
			System.out.println("Run : "+i);
		}
		
	}
}
public class YieldMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		YThread1 t1 = new YThread1();
		t1.start();
		
		for(int i=0;i<=10;i++) {
			System.out.println("Main : "+i);
		}
		
	}

}
