package com.oops.encapsulation;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankingManagement user1 = new BankingManagement(3303020,3322,"Venu Gopal",20000,2211);
		
		user1.deposit(20000);
		user1.withdraw(15000);
		user1.changePin();
		System.out.println(user1.getPin());
		

	}

}
