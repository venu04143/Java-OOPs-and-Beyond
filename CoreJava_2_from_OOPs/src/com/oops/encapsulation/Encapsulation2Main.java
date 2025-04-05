package com.oops.encapsulation;

public class Encapsulation2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation2 e =new Encapsulation2();
		
		System.out.println(e.getSid());
		System.out.println(e.getSname());
		System.out.println(e.getCourse());
		System.out.println(e.getCourseFee());
		
		System.out.println("----------------------------");
		
		e.setSid(101);
		e.setSname("Venu Gopal ");
		e.setCourse("Java Full Stack.");
		e.setCourseFee(25000.00);
		

		System.out.println(e.getSid());
		System.out.println(e.getSname());
		System.out.println(e.getCourse());
		System.out.println(e.getCourseFee());
		
		System.out.println("----------------------------");
		
		
		Encapsulation2 e1 =new Encapsulation2();
		

		System.out.println(e1.getSid());
		System.out.println(e1.getSname());
		System.out.println(e1.getCourse());
		System.out.println(e1.getCourseFee());
		
		System.out.println("----------------------------");
		
		e1.setSid(101);
		e1.setSname("Pranay ");
		e1.setCourse("Mern Full Stack.");
		e1.setCourseFee(25000.00);
		

		System.out.println(e1.getSid());
		System.out.println(e1.getSname());
		System.out.println(e1.getCourse());
		System.out.println(e1.getCourseFee());
		
	}

}
