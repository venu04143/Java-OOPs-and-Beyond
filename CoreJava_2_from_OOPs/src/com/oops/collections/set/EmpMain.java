package com.collections.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emplyoee e1 = new Emplyoee(1,"Venu",20000);
		Emplyoee e2 = new Emplyoee(2,"Pranay",300000);
		Emplyoee e3 = new Emplyoee(3,"Eswar",2000);
		Emplyoee e4 = new Emplyoee(4,"Luckey",10000);
		
		
		List<Emplyoee> el = new ArrayList<>();
		
		el.add(e1);
		el.add(e2);
		el.add(e3);
		el.add(e4);
		
		System.out.println(el);
		
		Collections.sort(el);
		System.out.println(el);

	}

}
