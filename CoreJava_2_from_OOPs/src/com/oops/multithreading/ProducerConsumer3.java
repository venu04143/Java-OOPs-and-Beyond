package com.multithreading;

class Resource3{
	int a ;
	boolean status = false;
	
	synchronized void put(int a) throws InterruptedException {
		while(status){
			wait();
		}
		this.a=a;
		System.out.println("PUT : "+a);
		status=true;
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
class Producer3 implements Runnable{

	Resource3 r;
	
	Producer3(Resource3 r){
		this.r=r;
		Thread t = new Thread(this,"Producer3");
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
class Consumer3 implements Runnable{

	Resource3 r;
	
	Consumer3(Resource3 r){
		this.r=r;
		Thread t = new Thread(this,"Consumer3");
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
public class ProducerConsumer3 {

	public static void main(String[] args) {
		
		Resource3 r = new Resource3();
		Producer3 p = new Producer3(r);
		Consumer3 c =new Consumer3(r);
	}

}
