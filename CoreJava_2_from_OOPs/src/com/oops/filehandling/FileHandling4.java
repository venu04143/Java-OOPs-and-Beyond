package com.filehandling;

import java.io.File;

public class FileHandling4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main method started");
		File f =new File("C:\\Vcube");
		File f2 =new File(f,"NewFiles");
		f2.mkdir();
		
		System.out.println("Folder Created");
	}

}
