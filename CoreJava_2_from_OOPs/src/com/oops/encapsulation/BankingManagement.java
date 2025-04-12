package com.oops.encapsulation;

import java.util.Scanner;

public class BankingManagement {
	
	private static  String bankName;
	
	private int accountNumber;
	private int ifscCode;
	private String holderName;
	private double balance;
	private int pin;
	
	
	public BankingManagement(int accountNumber, int ifscCode, String holderName, double balance, int pin) {
		bankName = "Union Bank Of India";
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
		this.holderName = holderName;
		this.balance = balance;
		this.pin = pin;
	}
	
	public void deposit(double amount) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter yourt 6 Digits Account Number.");
		int accountNumber = sc.nextInt();
		if(this.accountNumber == accountNumber) {
			
			if(amount>0) {
				this.balance+=amount; 
				System.out.println("Deposited Sucessfull.Your Account Balance is "+this.balance);
			}else {
				System.out.println("Invalid Amount! Please Enter Valid Amout.");
			}
			
		}
		else {
			System.out.println("Account Number MissMatch.");
		}
		
	}
	
	public void withdraw(double amount) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your 4 Digit Pin ");
		int pin =sc.nextInt();
		if(this.pin==pin) {
			if(amount<=this.balance) {
				this.balance-=amount;
				System.out.println("Do you Want to Know Your Reamaining Balance in Your Account : Yes / No ?");
				String ans =sc.next();
				if(ans.equalsIgnoreCase("yes")) {
					System.out.println("You Account Balance is "+this.balance);
				}else {
					System.out.println("Withdraw Sucessfull.");
				}
			}else {
				System.out.println("Insufficient Balance.");
			}
		}
	}
   
	public void changePin() {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Plaese Enter Your Current 4 Digit Pin");
		int pin = sc.nextInt();
		if(this.pin==pin) {
			System.out.println("Enter New Pin");
			int newPin = sc.nextInt();
			System.out.println("ReConfirm the Pin");
			int confirmPin=sc.nextInt();
			if(newPin == confirmPin) {
				this.pin = newPin;
				System.out.println("Pin Changed SucessFully.");
			}else {
				System.out.println("Pin Not Matched");
			}
		}else {
			System.out.println("Wrong Pin Entered");
		}
	}

	public static String getBankName() {
		return bankName;
	}

	public static void setBankName(String bankName) {
		BankingManagement.bankName = bankName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(int ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

}
