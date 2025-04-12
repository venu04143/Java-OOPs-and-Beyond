package com.oops.encapsulation;

public class Encapsulation4 {
	
	 private String customerName;
	 private int accountNum;
	 private double balance;
	 
	 
	public void setDetails(String customerName,int accountNum,double balance) {
		this.customerName=customerName;
		this.accountNum=accountNum;
		this.balance=balance;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public int getaccountNum() {
		return accountNum;
	}
	public double getBalance() {
		return balance;
	}
}
