package com.multithreading;

class Daemon extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Daemon Thraed");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
public class DaemonThread {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Daemon d = new Daemon();
        d.setDaemon(true);
        d.start();
        for(int i=0;i<=5;i++) {
        	System.out.println("Main Thread");
        	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}

}
