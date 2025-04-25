package com.atmproject;

import java.util.Scanner;

public class TestServices {

	static Scanner sc = new Scanner(System.in);
	 static boolean flag=true;
	 static boolean status = true;
	static  User user1 = new User("Venu",12345,123,300);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 while(status) {
			 System.out.println("Enter Account Number : ");
			 long account = sc.nextLong();
			 
			 if(user1.getAccountNo()==account) {
				 
				 while(flag) {
					 System.out.println("Enter You Pin.");
					 int pin = sc.nextInt();
					 if(user1.getPin()==pin) {
					   flag =false;
					   atmProcess(user1);
					 }else {
						 System.out.println("Wrong Pin Entered");
					 }
				 }
				 
			 }
		 }
		 System.out.println("Thank You "+user1.getUserName()+" Visit Again");
	}

	public static void atmProcess(User user) {
		ATMServices atm = new  ATMProcess(user);
		
		System.out.println("1. Check Balance");
		System.out.println("2. WithDraw Balance");
		System.out.println("3. Deposit Balance");
		System.out.println("4. Exit");
		
		System.out.println("Enter Your Option : ");
		int opt = sc.nextInt();
		
		switch(opt) {
		
		case 1 : 
			atm.checkBalance();
			break;
		case 2 : 
			atm.withdraw();
			break;
		case 3 : 
			atm.deposit();
			break;
		case 4 :
			status=false;
			break;
		default :
			System.out.println("Wrong Option");
	
		}
		if(status == true) {
		   System.out.println("Do You Want Continue : ");
		   String ans = sc.next();
		   if(ans.equalsIgnoreCase("yes")) {
			 atmProcess(user1);
		   }else {
			   status=false;
		   }
		 }
	}

}
