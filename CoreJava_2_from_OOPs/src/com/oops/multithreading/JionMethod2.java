package com.multithreading;

class JionThread1 extends Thread{
	@Override
	public void run() {
		int sum=0;
		for(int i=0;i<=20;i++) {
			System.out.println("J1 : "+i);
			sum+=i;
		}
	}
}
class JionThread2 extends Thread{
	JionThread3 t3;
	
	JionThread2(JionThread3 t3){
		this.t3=t3;
	}
	
	public void run() {
		int sum=0;
		for(int i=20;i<=40;i++) {
			System.out.println("J2 : "+i);
			sum+=i;
			if(i==30) {
				try {
					t3.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
class JionThread3 extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("Hello Thread");
		}
	}
}
public class JionMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JionThread1 t1 = new JionThread1();
		JionThread3 t3 = new JionThread3();
		JionThread2 t2 = new JionThread2(t3);
		
		t1.start();
		t3.start();
		t2.start();
		
	}

}
