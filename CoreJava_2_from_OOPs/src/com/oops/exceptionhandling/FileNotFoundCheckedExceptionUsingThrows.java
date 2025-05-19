package com.exceptionhandling;

import java.io.File;
import java.io.IOException;

public class FileNotFoundCheckedExceptionUsingThrows {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

        System.out.println("main method started");
		
	   File f = new File("D:\\Vcube\\Files\\gopal1.word");
//		
//		try {
//			boolean status = f.createNewFile();
//			if(status) {
//				System.out.println("File has Created Sucessfully");
//			}else {
//				System.out.println("Something went Wrong or with this file name already exists");
//			}
//		}catch(IOException e) {
//			System.err.println("in catch "+e.getMessage());
//		}
        
        /* with try catch we can achieve graceful termination of program 
         * 
         * throw is only used for satisfying the complier but not for graceful termination of the coding*/
        
	   boolean status = f.createNewFile();
		
		if(status) {
			System.out.println("File has Created Sucessfully");
		}else {
			System.out.println("Something went Wrong or with this file name already exists");
		}
		
		System.out.println("main method ended");
		System.out.println("main method ended");
		System.out.println("main method ended");
	}

}
