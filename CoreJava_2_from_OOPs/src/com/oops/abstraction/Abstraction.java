package com.abstraction;

/* Abstraction is a process of hiding the internal implementation and showing the basic functionality to the user
 * in java we can achieve abstraction in two ways :
 *    1.using interfaces
 *    2.using abstract classes
 *    
 *    */
public class Abstraction implements Interface1 {

	@Override
	public void details() {
		System.out.println("My name is Venu Gopal");
		
	}
	public static void main(String[] args) {
		Interface1 i = new Abstraction();
		
		i.details();
	}

	
}
