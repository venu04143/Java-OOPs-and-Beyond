package com.exceptionhandling;

public class NestedTryCatcheFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("in try");
			
			try {
				System.out.println(10/0);
			}catch(NullPointerException e) {
				System.out.println(e.getMessage());
			}finally {
				System.out.println("in finally");
			}
		}catch(Exception f) {
			f.printStackTrace();
		}finally {
			System.out.println("in finally");
		}

	}

}
