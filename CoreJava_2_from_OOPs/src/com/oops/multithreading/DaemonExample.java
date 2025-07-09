package com.multithreading;

public class DaemonExample extends Thread{
	
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Daemon thread running");
		}else {
			System.out.println("User thread running");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DaemonExample t1 = new DaemonExample();
		DaemonExample t2 = new DaemonExample();
		
		t1.setDaemon(true);
		t1.start();
		t2.setDaemon(false);
		t2.start();
	}

}
