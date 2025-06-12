package com.exceptionhandling.customexceptions;

public class InsufficientBalance extends Exception{

	InsufficientBalance(String message){
		super(message);
	}
}
