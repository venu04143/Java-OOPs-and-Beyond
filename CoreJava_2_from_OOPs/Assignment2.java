package com.stringhandling;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub            String s =" i love vcube"   -->  
                                                  //              e bucv evoli
		
		String s ="i love vcube";
		char[] c=s.toCharArray();
		
		int start =0;
		int end = s.length()-1;
		
		while(start<end) {
			if(c[start]==' ') {
				start++;
			}else if(c[end]==' ') {
				end--;
			}
			else {
				char temp =c[start];
				
				c[start]=c[end];
				c[end]=temp;
				start++;
				end--;
			}
			
		}
		System.out.println(c);
	}

}
