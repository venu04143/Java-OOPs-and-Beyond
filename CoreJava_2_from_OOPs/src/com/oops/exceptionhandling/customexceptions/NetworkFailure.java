package com.exceptionhandling.customexceptions;

public class NetworkFailure extends Exception{

	NetworkFailure(String message){
		super(message);
	}
}
