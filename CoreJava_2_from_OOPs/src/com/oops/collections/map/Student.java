package com.collections.map;

public class Student {
	
	int sid;
	String sname;
	String branch;
	double percentage;
	
	public Student(int sid, String sname, String branch, double percentage) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.branch = branch;
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", branch=" + branch + ", percentage=" + percentage + "]";
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	
	
	
	

}
