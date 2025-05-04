package com.stringhandling;

import java.util.Scanner;

public class EvenLengthWords {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to Display Even Length Words : ");
		
		String str=sc.nextLine();
		String[] arr =str.split(" ");
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i].length()%2==0) {
				System.out.println(arr[i]+ " "+ arr[i].length());
			}
		}
		
		
	}

}
