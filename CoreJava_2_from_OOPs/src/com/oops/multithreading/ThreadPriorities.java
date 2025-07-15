package com.multithreading;

class Priority extends Thread{
	@Override
	public void run() {
		Thread.currentThread().setPriority(MAX_PRIORITY);
		System.out.println("run thread name : "+Thread.currentThread().getName());
		System.out.println("run Current Thread Info : "+Thread.currentThread());
		for(int i=0;i<=10;i++) {
			System.out.println("Run : "+i);
		}
	}
}
public class ThreadPriorities {

	public static void main(String[] args) {
		  
		Priority p = new Priority();
		p.start();
		
		System.out.println("main thread name : "+Thread.currentThread().getName());
		System.out.println("main Current Thread Info : "+Thread.currentThread());

		for(int i=0;i<=10;i++) {
			System.out.println("Main : "+i);
		}
	}

}
