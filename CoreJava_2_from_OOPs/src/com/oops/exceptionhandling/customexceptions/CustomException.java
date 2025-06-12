package com.exceptionhandling.customexceptions;

public class CustomException {
	
	static void validAge(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("Age Must be 10 or Above");
		}else {
			System.out.println("Your are eligible");
		}
	}

	public static void main(String[] args){
		
		try {
			validAge(15);
		}catch( InvalidAgeException  e) {
			System.out.println("Cought Exception "+e.getMessage());
		}

	}

}
