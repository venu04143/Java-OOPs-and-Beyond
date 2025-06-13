package com.exceptionhandling.customexceptions;

public class InvalidInputException extends RuntimeException{

	InvalidInputException (String message){
		super(message);
	}
}
