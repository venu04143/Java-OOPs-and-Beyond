package com.filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingFileReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		
		File f =new File("C:\\Vcube\\Files\\venu1.txt");
		
		FileReader fr = new FileReader(f);
		
		try {
			int fc = fr.read();
			//System.out.println((char) fc);
			
			while(fc!=-1) {
				System.out.print((char) fc);
				fc =fr.read();
			}

		}finally {
			fr.close();         // reads only one character at a time
		}
		
	}

}
