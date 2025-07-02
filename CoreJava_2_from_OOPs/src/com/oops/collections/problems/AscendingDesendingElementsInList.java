package com.collections.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AscendingDesendingElementsInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  List<Integer> list = Arrays.asList(8,5,2,9,10,3,1,4);
	  
	  List<Integer> list2 = new ArrayList<>(list);
	  
	  System.out.println(list2);

	  Collections.sort(list2);
	  
	  System.out.println(list2);
	  
	  Collections.reverse(list2);
	  
	  System.out.println(list2);
	  
	}

}
