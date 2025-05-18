package com.exceptionhandling;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Loan Amount : ");
		int amount =(int) sc.nextDouble();
		
		System.out.println("Enter the Number of Years : ");
		int totalYears = sc.nextInt();
		 
		 int intrest=0;
		 
		 try {
			 intrest = amount/totalYears;
			 System.out.println("Total Intrest For Chosen Term is : "+intrest);
			 
		 }
		 catch(Exception e) {
			 System.out.println("Chose Wrong Term Years : ");
		 }
		 
		 

	}

}
