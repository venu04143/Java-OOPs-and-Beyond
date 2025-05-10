package com.stringhandling;

import java.util.Scanner;

public class WrittenTest1 {

	public static void main(String[] args) {         // Success
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String str=sc.nextLine();
		
		char[] arr = str.replaceAll(" ", "").toLowerCase().toCharArray();
		
        int i=0;
        while(i<arr.length) {
        	char c =arr[i];
        	int count=1;
        	
        	while(i+1<arr.length && c==arr[i+1]) {
        		count++;
        		i++;
        	}
        	System.out.print(count+""+c+" ");
        	i++;
        }
	}

}
