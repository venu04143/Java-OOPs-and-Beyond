package com.exceptionhandling.customexceptions;

public class InvalidAgeException extends Exception{
	

	InvalidAgeException(String message){
		super(message);
	}
}
