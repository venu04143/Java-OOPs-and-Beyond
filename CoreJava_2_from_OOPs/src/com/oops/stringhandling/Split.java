package com.stringhandling;

import java.util.Arrays;

public class Split {

	public static void main(String[] args) {


		String str ="Venu Gopal";
		String[] arr =str.split(" ");
		System.out.println(Arrays.toString(arr));
		
		String str2 ="java is powerfull";
		String[] arr2 = str2.split(" ");
		System.out.println(Arrays.toString(arr2));
		
		String str3 = "apple,banana,mango";
        String[] fruits = str3.split(",");
        
        System.out.println(Arrays.toString(fruits));
        
        String str4 = "Java   is\tawesome";
        String[] parts = str4.split("\\s+");
        
        System.out.println(Arrays.toString(parts));
        
        String str5 = "one:two:three:four";
        String[] limited = str5.split(":", 3); 
        
        System.out.println(Arrays.toString(limited));
        
//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }

	}

}
