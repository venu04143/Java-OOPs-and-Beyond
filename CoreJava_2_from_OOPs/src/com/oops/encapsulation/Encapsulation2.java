package com.oops.encapsulation;
// we can consider this class as a 
//                                   DTO : Data Transfer Object
//                                   POJO : plain old java object  or Data Model

// this class cannot contain main method and contains only data, setters and getters
public class Encapsulation2 {
	
	private int sId;
	private String sname;
	private String course;
	private double courseFee;
	
	
	public void setSid(int sId) {
		this.sId=sId;
	}
	public int getSid() {
		return sId;
	}
	
	public void setSname(String sname) {
		this.sname =sname;
	}
	public String getSname() {
		return sname;
	}
	
	public void setCourse(String course) {
		this.course=course;
	}
	public String getCourse() {
		return course;
	}

	public void setCourseFee(double courseFee) {
		this.courseFee=courseFee;
	}
	public double getCourseFee() {
		return courseFee;
	}
}
