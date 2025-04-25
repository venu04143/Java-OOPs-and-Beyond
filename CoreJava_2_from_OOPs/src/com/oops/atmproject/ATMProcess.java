package com.atmproject;

import java.util.Scanner;

public class ATMProcess implements ATMServices {

	static Scanner sc = new Scanner(System.in);
	
	
	
  private User user;
	
	public ATMProcess(User user) {
	
		this.user=user;
	}

	@Override
	public void checkBalance() {
		
		System.out.println("You Current Balance is "+user.getBalance());
		
	}
   @Override
	public void withdraw() {
		System.out.println("Enter Amount to WithDraw..");
		double amount = sc.nextDouble();
		
		if(amount < user.getBalance()) {
			user.setBalance(user.getBalance()-amount);
			System.out.println(amount+" Money WithDraw SucessFull ");
			System.out.println("Your Current Available Balance is "+user.getBalance());
		}else {
			System.out.println("Insufficient Balance ");
			System.out.println("Available Balance is "+user.getBalance());
		}
	}
   @Override
	public void deposit() {
		System.out.println("Enter Amount to Deposit");
		double amount = sc.nextDouble();
		if(amount> 0) {
		user.setBalance(user.getBalance()+amount);
		
		System.out.println(amount+ " Deposited SucessFull");
       }else {
			System.out.println("Enter Valid Amount.");
		}
	}

	
}
