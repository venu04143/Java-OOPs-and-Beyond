package com.collections.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Emp{
	int eid;
	String name;
	int esal;
	
	
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEsal() {
		return esal;
	}

	public void setEsal(int esal) {
		this.esal = esal;
	}

	public Emp(int eid, String name, int esal) {
		this.eid = eid;
		this.name = name;
		this.esal = esal;
	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", name=" + name + ", esal=" + esal + "]";
	}
	
}
public class ComparatorEx {

	public static void main(String[] args) {

		Emp[] arr = { 
				      new Emp(2,"Gopal",2000),
				      new Emp(5,"Pranay",6000),
				      new Emp(3,"Eswar",2500),
				      new Emp(1,"Luckey",3000),
				};
		
		List<Emp> list = new ArrayList<>(Arrays.asList(arr));
		
		
		System.out.println(list);
		
		Comparator c = new Comparator<Emp>() {

			@Override
			public int compare(Emp o1, Emp o2) {
				// TODO Auto-generated method stub
				return o1.getEsal()-o2.getEsal();
			}
		};
		
		Collections.sort(list,c);
		
		System.out.println(list);
		
	}

}
