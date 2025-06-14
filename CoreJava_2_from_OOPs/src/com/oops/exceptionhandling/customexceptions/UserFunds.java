package com.exceptionhandling.customexceptions;

public class UserFunds {
	
	private long accountNumber;
	private String userName;
	private double balance;
	
	UserFunds(){
		
	}
	public UserFunds(long accountNumber, String userName, double balance) {
		this.accountNumber = accountNumber;
		this.userName = userName;
		this.balance = balance;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "UserFunds [accountNumber=" + accountNumber + ", userName=" + userName + ", balance=" + balance + "]";
	}
	
	
	

}
