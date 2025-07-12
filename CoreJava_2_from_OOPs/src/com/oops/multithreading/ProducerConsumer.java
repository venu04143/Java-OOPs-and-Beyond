package com.multithreading;

class Resource{
	
	int a;
	boolean status = false;

	synchronized void put(int a) throws InterruptedException {
		 while(status) {
			
			wait();
		 }
		this.a=a;
		System.out.println("PUT : "+a); 
		status = true;
		notify();
		
	}
	 
	synchronized void get() throws InterruptedException {
		 while(!status) {
			 
			 wait();
		 }
		 System.out.println("GET : "+a);
		 status=false;
		 notify();
		 
	 }
}
class Producer implements Runnable{
	
	Resource r;

	public Producer(Resource r) {
		this.r=r;
		Thread t = new Thread(this,"Producer");
		t.start();
	}

	@Override
	public void run() {
		
		int i=1;
		while(true) {
			
			try {
				r.put(i++);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
class Consumer implements Runnable{
	
	Resource r;

	public Consumer(Resource r) {
		this.r=r;
		Thread t = new Thread(this,"Consumer");
		t.start();
	}

	@Override
	public void run() {

		while(true) {
			
			try {
				r.get();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class ProducerConsumer {

	public static void main(String[] args) {
		

		Resource r = new Resource();
		
		Producer p1 = new Producer(r);
		Consumer c1 = new Consumer(r);
	}

}
