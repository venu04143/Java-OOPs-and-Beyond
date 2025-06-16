package com.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingBufferedReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("main method started");
		
		File f = new File("C:\\Vcube\\Files\\venugopal.txt");
		
		FileReader fr =new FileReader(f);
		
		BufferedReader br = new BufferedReader(fr);
		
		String str =br.readLine();
		
		while(str!=null) {
			System.out.println(str);
			str=br.readLine();
		}
		br.close();
		fr.close();
	}

}
