package com.exceptionhandling;

import java.io.File;
import java.io.IOException;

// we can handle checked exceptions by using try and catch blocks or adding throws keyword with exception in method signature 

public class FileNotFountCheckedException {

	public static void main(String[] args) {
		

		System.out.println("main method started");
		
		File f = new File("C:\\Vcube\\Files\\venu.word");
		
		try {
			boolean status = f.createNewFile();
			if(status) {
				System.out.println("File has Created Sucessfully");
			}else {
				System.out.println("Something went Wrong or with this file name already exists");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
