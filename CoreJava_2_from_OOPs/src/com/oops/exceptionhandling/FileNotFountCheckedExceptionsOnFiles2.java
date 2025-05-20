package com.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFountCheckedExceptionsOnFiles2{

	public static void main(String[] args)  throws FileNotFoundException,IOException,InterruptedException,ArithmeticException {
		
     File f =new File("C:\\Vcube\\Files\\venu.txt");
		
	     //System.out.println(10/0);
			FileReader fr = new FileReader(f);
				int i = fr.read();   // Reads a Single Character
				// the character read ,or -1 if the end of the stream has been reached
				
				while(i!=-1) {
					System.out.print((char) i);
						Thread.sleep(500);
					i=fr.read();   // it will jump to read next character
				}
	
		

	}

}
