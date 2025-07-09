package com.multithreading;

class Even extends Thread {
	@Override
	public void run() {
		System.out.println("Even Method Executing");

		try {
			for (int i = 0; i <= 20; i++) {
				if (i % 2 == 0) {
					System.out.println("Even " + i);
					Thread.sleep(2000);
				}
			}
		} catch (InterruptedException e) {
			System.out.println("Exception Occured");
		}
	}
}

class Odd implements Runnable {

	@Override
	public void run() {
		System.out.println("Odd Method Executing");

		try {
			for (int i = 0; i <= 20; i++) {
				if (i % 2 != 0) {
					System.out.println("Odd " + i);
					Thread.sleep(2000);
				}
			}
		} catch (InterruptedException e) {
			System.out.println("Exception Occured");
		}
	}

}

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Even e = new Even();
		Odd o = new Odd();
		Thread t = new Thread(o);
		e.start();
		t.start();

	}

}
