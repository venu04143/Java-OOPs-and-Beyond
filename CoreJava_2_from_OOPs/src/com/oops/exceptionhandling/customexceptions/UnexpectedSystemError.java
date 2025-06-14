package com.exceptionhandling.customexceptions;

public class UnexpectedSystemError extends Exception{

	UnexpectedSystemError(String message){
		super(message);
	}
}
