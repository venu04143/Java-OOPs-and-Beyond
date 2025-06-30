package com.collections.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopperFinderPerBranch {

	public static void main(String[] args) {
		
		List<Student> students =Arrays.asList(
		 new Student(1,"Venu","Cse",80),
		 new Student(2,"Gopal","Ece",77),
		 new Student(3,"Pranay","Cse",90),
		 new Student(4,"Eshwar","EEE",90));
		
		Map<String,Student> toper = new HashMap<>();
		
		
		
		for(Student stud: students) {
			Student currentTopper = toper.get(stud.branch);
			
			if(currentTopper == null || stud.percentage>currentTopper.percentage) {
				toper.put(stud.branch, stud);
			}
		}
		
		 System.out.println("Topper per branch:");
	     for (Map.Entry<String, Student> entry : toper.entrySet()) {
	         System.out.println(entry.getKey() + " -> " + entry.getValue());
	     }
	      

	}

}
