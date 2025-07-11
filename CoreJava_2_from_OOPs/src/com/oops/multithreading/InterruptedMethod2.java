package com.multithreading;


public class InterruptedMethod2 extends Thread{

	@Override
	public void run() {
		try {
			for(int i=0;i<10;i++) {
				System.out.println("I am Lazy Thread ");
				Thread.sleep(2000);
			}
		}catch(Exception e) {
			System.out.println("I Got Interrupted");
		}
	}
}

class ThreadSleep{
	public static void main(String[] args) {
		InterruptedMethod2 im = new InterruptedMethod2();
		
		im.start();
		im.interrupt(); // interrupted methods will call on sleeping threads
		
		System.out.println("Main Method Ended");
	}
}