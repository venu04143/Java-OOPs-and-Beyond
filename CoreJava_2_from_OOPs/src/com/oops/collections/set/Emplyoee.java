package com.collections.set;

public class Emplyoee implements Comparable<Emplyoee>{
	
	private int eid;
	private String ename;
	private double sal;
	
	
	public Emplyoee(int eid, String ename, double sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public double getSal() {
		return sal;
	}


	public void setSal(double sal) {
		this.sal = sal;
	}


	@Override
	public String toString() {
		return "Emplyoee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + "]";
	}


	@Override
	public int compareTo(Emplyoee o) {
		if(this.getSal() < o.getSal()) {
			return -1;
		}else if(this.getSal() > o.getSal()) {
			return 1;
		}
		return 0;
	}


	


	


	
	
	
	

}
