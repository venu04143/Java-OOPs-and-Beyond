package com.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Assignment1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("main method started");
		
		File a =new File("C:\\Vcube\\Files\\A.txt");
		a.createNewFile();
		
		System.out.println("File A created ");
		
		File b = new File("C:\\Vcube\\Files\\B.txt");
		b.createNewFile();
		
		System.out.println("File B created ");
		
		File c =new File("C:\\Vcube\\Files\\C.txt");
		c.createNewFile();

		System.out.println("File C created ");
		
		PrintWriter pw =new PrintWriter(a);
		
		pw.println("Hello");
		pw.println("My Name is Venu Gopal");
		pw.println("I am Learning File Handling in Java");
		
		PrintWriter pw1 =new PrintWriter(b);
		
		pw1.println("HI");
		pw1.println("My Qualification is Batchelors technology in cse");
		pw1.println("I am Learning File Handling in Java");
		
		PrintWriter pw2 =new PrintWriter(c);
		
		FileReader fr1 = new FileReader(a);
		BufferedReader br1 = new BufferedReader(fr1);
		String str1 = br1.readLine();
		
		
		
		while(str1!=null) {
			pw2.println(str1);
			str1=br1.readLine();
		}
		
		FileReader fr2 = new FileReader(b);
		BufferedReader br2 = new BufferedReader(fr2);
		String str2 =br2.readLine();

		while(str2!=null) {
			pw2.println(str2);
			str2=br2.readLine();
		}
		
		pw.flush();
		pw1.flush();
		pw2.flush();
		
		pw2.close();
		pw1.close();
		pw.close();
		
		FileReader fr3 = new FileReader(c);
		BufferedReader br3 = new BufferedReader(fr3);
		
		String str3 = br3.readLine();
		
		while(str3!=null) {
			System.out.println(str3);
			str3=br3.readLine();
		}
	
		fr1.close();
		fr2.close();
		fr3.close();
		
		br1.close();
		br2.close();
		br3.close();	
		
	}

}
