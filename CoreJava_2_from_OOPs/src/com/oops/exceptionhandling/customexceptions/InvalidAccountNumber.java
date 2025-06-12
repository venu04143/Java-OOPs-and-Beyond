package com.exceptionhandling.customexceptions;

public class InvalidAccountNumber extends Exception{
	
	InvalidAccountNumber(String message){
		super(message);
	}

}
