package com.filehandling;

import java.io.File;
import java.io.IOException;

public class FileHandling1 {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Vcube\\Files\\venu.txt");
		
		
		if(!f.exists()) {
			boolean status = f.createNewFile();
			
			if(status) {
				System.out.println("File created SuccessFully");
			}else {
				System.out.println("There was Something Wrong");
			}
		}else {
			System.out.println("File Name Already Exists ");
		}

	}

}
