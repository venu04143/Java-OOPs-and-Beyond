package com.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFountCheckedExceptionsOnFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main method started");
		
		File f =new File("C:\\Vcube\\Files\\venu.txt");
		
		try {
			FileReader fr = new FileReader(f);
			try {
				int i = fr.read();   // Reads a Single Character
				// the character read ,or -1 if the end of the stream has been reached
				
				while(i!=-1) {
					System.out.print((char) i);
					try {
						Thread.sleep(500);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					i=fr.read();   // it will jump to read next character
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
