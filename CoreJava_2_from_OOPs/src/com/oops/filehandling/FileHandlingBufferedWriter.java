package com.filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileHandlingBufferedWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("main method started ");
		
		File f =new File("C:\\Vcube\\Files\\venu2.txt");
		
		FileWriter fw=new FileWriter(f);
		
		BufferedWriter bw =new BufferedWriter(fw);
		
		bw.write("Hello ");
		bw.write("Venu ");
		bw.write("Gopal");
		bw.newLine();
		bw.write("Srikanth Java");
		bw.newLine();
		bw.write("In Vcube");
		bw.newLine();
		bw.flush();
		bw.close();
		fw.close();
		
		
	}

}
