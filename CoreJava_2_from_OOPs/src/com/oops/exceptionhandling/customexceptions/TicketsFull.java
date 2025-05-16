package com.exceptionhandling.customexceptions;

public class TicketsFull extends Exception{

	TicketsFull(String message){
		super(message);
	}
}
