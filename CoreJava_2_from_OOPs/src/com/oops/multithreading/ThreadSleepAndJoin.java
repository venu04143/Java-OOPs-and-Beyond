package com.multithreading;

public class ThreadSleepAndJoin extends Thread {
	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Running : "+i);
			try {
				Thread.sleep(2000); // sleep for 2 seconds
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ThreadSleepAndJoin t1 = new ThreadSleepAndJoin();
		ThreadSleepAndJoin t2 = new ThreadSleepAndJoin();
		
		t1.start();
		t1.join();      // Waits for t1 to finish
		t2.start();

	}

}
