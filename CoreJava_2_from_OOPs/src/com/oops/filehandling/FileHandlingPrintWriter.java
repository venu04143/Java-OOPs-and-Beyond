package com.filehandling;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandlingPrintWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		File f = new File("C:\\Vcube\\Files\\venugopal.txt");
		f.createNewFile();
		PrintWriter pw = new PrintWriter("C:\\Vcube\\Files\\venugopal.txt");
		
		pw.println();
		pw.println(10000);
		pw.println(100000000l);
		pw.println('A');
		pw.println("Venu Gopal");
		pw.println(5.8f);
		pw.println(6.47);
		pw.println(true);

		pw.flush();
		pw.close();
	}

}
