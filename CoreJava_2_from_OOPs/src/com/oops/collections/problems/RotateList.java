package com.collections.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RotateList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main method started... ");
		Scanner sc = new Scanner(System.in);
		
		
		List<Integer> l1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		
		System.out.println("Enter Number of times to rotate : ");
		
		int k =sc.nextInt() % l1.size();
		sc.close();
		
		List<Integer> l2 = l1.subList(l1.size()-k, l1.size());
		List<Integer> l3 = l1.subList(0, l1.size()-k);
		
		List<Integer> rotatedList = new ArrayList<>();
		
		rotatedList.addAll(l2);
		rotatedList.addAll(l3);
		
		System.out.println(rotatedList);

	}

}
