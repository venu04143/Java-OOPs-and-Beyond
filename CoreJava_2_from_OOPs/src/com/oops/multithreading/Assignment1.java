package com.multithreading;

public class Assignment1 extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main method started");
		Assignment1 t1 = new Assignment1();
		t1.start();
	    
		for(int i=0;i<=20;i++) {
			if(i%2==0) {
				System.out.println("Even "+i);
			}
		}

	}
	@Override
	public void run() {
		for(int i=0;i<=20;i++) {
			if(i%2!=0) {
				System.out.println("Odd "+i);
			}
		}
	}

}
