package com.filehandling;

import java.io.File;

public class FileHandling5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// list , 
		
		System.out.println("main methos started");
		
		File f =new File("C:\\Vcube\\Files");
		
		String [] filesNames =f.list();
		
		int count =0;
		
		for(String file : filesNames) {
			count++;
			System.out.println(file);
		}
		System.out.println(count);
	}

}
