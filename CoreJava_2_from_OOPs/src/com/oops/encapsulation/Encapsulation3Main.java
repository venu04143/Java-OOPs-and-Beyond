package com.oops.encapsulation;

public class Encapsulation3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Encapsulation3 en = new Encapsulation3();
		
		en.setStudentName("Venu Gopal");
		en.setBranch("Cse");
		en.setCollageName("Sri Chundi Ranganayakulu Engineering Collage");
		en.setFatherName("Ontipuli Adiseshu");
		en.setMotherName("Ontipli Venkayamma");
		en.setContactNumber(6300558179L);
		
		System.out.println("Student Name   : "+ en.getStudentName());
		System.out.println("Branch         : "+en.getBranch());
		System.out.println("Collage        : "+en.getCollageName());
		System.out.println("Father Name    : "+en.getFatherName());
		System.out.println("Mother Name    : "+en.getMotherName());
		System.out.println("Contact Number : "+en.getContactNumber());
		System.out.println("----------------------------------------------------");
		
		en.setStudentName("Ontipuli Venu Gopal");
		
		

		System.out.println("Student Name   : "+ en.getStudentName());
		System.out.println("Branch         : "+en.getBranch());
		System.out.println("Collage        : "+en.getCollageName());
		System.out.println("Father Name    : "+en.getFatherName());
		System.out.println("Mother Name    : "+en.getMotherName());
		System.out.println("Contact Number : "+en.getContactNumber());
		
	}

}
