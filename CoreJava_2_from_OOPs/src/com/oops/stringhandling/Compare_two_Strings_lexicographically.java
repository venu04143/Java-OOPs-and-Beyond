package com.stringhandling;

import java.util.Scanner;
/*        How compareTo() Works:
                   compareTo() returns:

                   Negative value if the first string is lexicographically smaller.

                   Zero if both strings are equal.

                   Positive value if the first string is lexicographically greater.*/

public class Compare_two_Strings_lexicographically {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String 1 : ");
		String str1 = sc.nextLine();
		
		System.out.println("Enter String 2 : ");
		String str2 = sc.nextLine();
		
		comparesTo(str1,str2);
		

	}
	
	public static void comparesTo(String str1,String str2) {
		
		int result = str1.compareTo(str2);
		
		if(result < 0) {
			System.out.println(str1+" is lexicographically smaller than "+str2);
		}else if(result==0) {
			System.out.println(str1 +" is same as "+str2);
		}else {
			System.out.println(str1+" is lexicographically greater than "+str2);
		}
		
	}

}
