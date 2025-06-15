package com.filehandling;

import java.io.File;
import java.io.IOException;

public class FileHandling2 {

	public static void main(String[] args) throws IOException {


		File f = new File("C:\\Vcube\\Files","ram.txt");
		
		if(!f.exists()) {
				boolean status = f.createNewFile();
				if(status) {
					System.out.println("File Created SucessFully");
				}else {
					System.out.println("There was an Error or Something Wrong");
				}
		}else {
			System.out.println("The File Name Already Exists");
		}

	}

}
