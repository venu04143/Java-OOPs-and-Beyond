package com.multithreading;

class Resource1 {
	int a;

	boolean status = false;
	
	synchronized void put(int a) throws InterruptedException {
		while(status) {
			wait();
		}
		this.a = a;
		System.out.println("PUT : " + a);
		status =true;
		notify();
	}

	synchronized void get() throws InterruptedException {
		while(!status) {
			wait();
		}
		System.out.println("GET : " + a);
		status=false;
		notify();
	}
}

class Producer1 implements Runnable {

	Resource1 r;

	public Producer1(Resource1 r) {
		this.r = r;
		Thread t= new Thread(this,"Producer1");
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

class Consumer1 implements Runnable {

	Resource1 r;

	public Consumer1(Resource1 r) {
		this.r = r;
		Thread t = new Thread(this,"Consumer1");
		t.start();
	}

	@Override
	public void run() {

		while(true) {
			
			try {
				r.get();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class ProducerConsumer2 {

	public static void main(String[] args) {

		Resource1 r = new Resource1();

		Producer1 p = new Producer1(r);
		Consumer1 c = new Consumer1(r);

	}

}
