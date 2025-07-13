package com.multithreading;

public class SleepMethod implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main Method started");
		
		long start = System.currentTimeMillis();
		System.out.println("Begin time "+start);
		SleepMethod sl = new SleepMethod();
		//sl.run();
		Thread t = new Thread(sl);
		t.start();
		// t.start();  Exception in thread "main" java.lang.IllegalThreadStateException
		
		for(int i=0;i<=10;i++) {
			System.out.println("Main : "+i);
		}

		long end = System.currentTimeMillis();
        System.out.println("Main Method ended");
		
		System.out.println("End time "+(end - start));
	}

	@Override
	public void run() {
		
		System.out.println("Run Method Called ");
		
		for(int i=0;i<=10;i++) {
			System.out.println("Run : "+i);
		}
		
	}

}
