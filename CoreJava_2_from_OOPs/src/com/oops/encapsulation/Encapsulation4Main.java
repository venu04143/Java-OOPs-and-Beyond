package com.oops.encapsulation;

public class Encapsulation4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Encapsulation4 en =new Encapsulation4();
		
		en.setDetails("Venu Gopal", 6300555, 4500.57);
		
		System.out.println("Customer     :"+en.getCustomerName());
		System.out.println("Account Num  :"+en.getaccountNum());
		System.out.println("Balance      :"+en.getBalance());
	}

}
