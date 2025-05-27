package com.exceptionhandling;

public class HandlingArrayIndexOutOfBoundException {

	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		int[] arr =new int[3];
		
		try {
			System.out.println("in try ");
		    arr[0]=10;
		    arr[1]=20;
		    arr[2]=30;
		    arr[3]=40;             // will not give any compile time error but throws runtime exception
		    
		}catch(ArrayIndexOutOfBoundsException ar) {
			
			System.out.println("in catch");
			System.out.println(ar.getMessage());
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	
		

	}

}
