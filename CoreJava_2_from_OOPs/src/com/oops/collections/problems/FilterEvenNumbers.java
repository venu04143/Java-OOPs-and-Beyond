package com.collections.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 List<Integer> numbers = Arrays.asList(5, 12, 7, 20, 33, 42, 9, 8);
		 
		 List<Integer> evenNumbers =new ArrayList<>();
		 
		 for(Integer i : numbers) {
			 if(i%2==0) {
				 evenNumbers.add(i);
			 }
		 }
		 System.out.println(evenNumbers);
	}

}
