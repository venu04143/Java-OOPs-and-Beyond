package com.multithreading;

public class SleepMethod2 extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main method started");
		
		long start = System.currentTimeMillis();
		
		System.out.println("Start time : "+start);
		
		SleepMethod2 sl = new SleepMethod2();
		sl.start();
		
		for(int i=0;i<=100;i++) {
			System.out.println("Main : "+i);
		}
		
		System.out.println("End Time "+ (System.currentTimeMillis()-start));
		System.out.println("main method ended");
	}
	@Override
	public void run() {
		for(int i=0;i<=100;i++) {
			System.out.println("Run : "+i);
			
			if(i==50) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
