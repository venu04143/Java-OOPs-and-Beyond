package com.multithreading;

public class InterruptedMethod implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        System.out.println("Main method started");
		
		long start = System.currentTimeMillis();
		
		System.out.println("Start time : "+start);
		
		InterruptedMethod sl = new InterruptedMethod();
		Thread t = new Thread(sl);
		t.start();
		t.interrupt();  // whenever the thread is sleeping that time if we call this method throws InterruptedException
		
		for(int i=0;i<=10;i++) {
			System.out.println("Main : "+i);
		}
		
		System.out.println("End Time "+ (System.currentTimeMillis()-start));
		System.out.println("main method ended");
	}

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
			
		}catch(Exception e) {
			System.out.println("Thread Got Interrupetd");
			e.printStackTrace();
		}
		for(int i=0;i<=10;i++) {
			System.out.println("Run : "+i);
		}
	}

}
