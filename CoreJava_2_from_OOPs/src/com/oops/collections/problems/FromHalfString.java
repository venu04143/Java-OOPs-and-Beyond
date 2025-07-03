package com.collections.problems;

public class FromHalfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="PROGRAM";
		int key=4;
		
		String s1 = s.substring(key-1);
		String s2 =s.substring(0,key-1);
		char[] s3=(s1+s2).toCharArray();
		
		System.out.println(s3);
		
		for(int i=0;i<s3.length;i++) {
			for(int j=0;j<s3.length-1-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print(s3[j]);
			}
			System.out.println();
		}

	}

}
