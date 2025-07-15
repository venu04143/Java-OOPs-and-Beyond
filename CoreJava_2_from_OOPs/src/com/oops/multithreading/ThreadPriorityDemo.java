package com.multithreading;

public class ThreadPriorityDemo extends Thread{
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "Priority : "+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadPriorityDemo t1 = new ThreadPriorityDemo();
		ThreadPriorityDemo t2 = new ThreadPriorityDemo();
		
		t1.setPriority(Thread.MIN_PRIORITY);   // 1
		t2.setPriority(Thread.MAX_PRIORITY);    // 10
		
		t1.start();
		t2.start();
		
	}

}
