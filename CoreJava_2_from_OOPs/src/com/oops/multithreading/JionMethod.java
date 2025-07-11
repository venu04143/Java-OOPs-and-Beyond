package com.multithreading;

class JThread1 extends Thread{
	@Override
	public void run() {
		int sum=0;
		for(int i=0;i<=100;i++) {
			System.out.println("J1 : "+i);
			sum+=i;
		}
		System.out.println("J1 : "+sum);
	}
}
class JThread2 extends Thread{
	JThread1 j1;
	
	JThread2(JThread1 j1){
		this.j1=j1;
	}
	public void run() {
		int sum=0;
		for(int i=0;i<=100;i++) {
			System.out.println("J2 : "+i);
			sum+=i;
			if(i==50) {
				try {
					j1.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		System.out.println("J2 : "+sum);
	}
}
class JThread3 extends Thread{
	public void run() {
		int sum=0;
		for(int i=0;i<=100;i++) {
			System.out.println("J3 : "+i);
			sum+=i;
		}
		System.out.println("J3 : "+sum);
	}
}
public class JionMethod {

	public static void main(String[] args) {


		JThread1 j1 = new JThread1();
		JThread2 j2 = new JThread2(j1);
		JThread3 j3 = new JThread3();
		
		j1.start();
		j2.start();
		j3.start();
		
	}

}
