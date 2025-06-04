package com.exceptionhandling;

import java.io.IOException;

public class ExceptionPropagation2 {
	
	ExceptionPropagation2() throws IOException{
		
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		try {
			ExceptionPropagation2 ep = new ExceptionPropagation2();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
