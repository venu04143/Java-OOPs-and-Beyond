package com.filehandling;

import java.io.File;
import java.io.IOException;

public class FileHandling3 {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Vcube\\Files");
		
		f.createNewFile();
		
		
		File f1 = new File(f,"sai1.pdf");
		
		boolean status=f1.createNewFile();
		
		if(status) {
			System.out.println("File Created SucessFully");
		}else {
			System.out.println("There was something error");
		}
		System.out.println(f1.canExecute());
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());
		
		System.out.println(f1.getAbsolutePath());
		System.out.println(f1.getCanonicalPath());
		System.out.println(f1.getFreeSpace());
		System.out.println(f1.getTotalSpace());
		
		

	}

}
