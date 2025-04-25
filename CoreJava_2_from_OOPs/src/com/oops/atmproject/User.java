package com.atmproject;

public class User {

	private String userName;
	private long accountNo;
	private int pin;
	private double balance;
	
	
	User(){
		
	}
	public User(String userName, long accountNo, int pin, double balance) {
		super();
		this.userName = userName;
		this.accountNo = accountNo;
		this.pin = pin;
		this.balance = balance;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public  double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	
}
