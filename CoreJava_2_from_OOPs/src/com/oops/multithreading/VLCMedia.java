package com.multithreading;

import java.util.Timer;

class VideoInfo extends Thread{
	
	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Video "+i);
		}
	}
}

class AudioInfo extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Audio "+i);
		}
	}
}

class TimerInfo extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Timer "+i);
		}
	}
}

public class VLCMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VideoInfo v1 = new VideoInfo();
		AudioInfo a1 = new AudioInfo();
		TimerInfo t1 = new TimerInfo();
		
		v1.start();
		a1.start();
		t1.start();
		

	}

}
