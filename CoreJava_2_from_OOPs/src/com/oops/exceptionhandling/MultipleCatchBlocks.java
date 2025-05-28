package com.exceptionhandling;

public class MultipleCatchBlocks {
	public static void main(String[] args) {
		System.out.println("main method started");
		try {
			int[] arr = new int[3];
			String name =null;
			//name.length();  // general like exception
			//arr[5] = 100/0 ;   // throws arithmetic exception because first it consider values divide by zero
			arr[5]=100;               // array index out of bounds
		} catch (ArithmeticException e) {
			System.out.println("in arithmatic catch ");
			e.printStackTrace();

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Exception caught");
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("General Exception caught");
			System.out.println(e.toString());
		}
		System.out.println("main method ended");
	}

}
