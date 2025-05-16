package com.exceptionhandling.customexceptions;

import java.util.Scanner;

public class TicketsBooking {
	
	private int availableTickets;
	
	TicketsBooking(int availableTickets){
		this.availableTickets=availableTickets;
	}

	public int getAvailableTickets() {
		return availableTickets;
	}

	public void setAvailableTickets(int availableTickets) {
		this.availableTickets = availableTickets;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How Many Tickets want to Book");
		int totalTickets=sc.nextInt();
		
		TicketsBooking book = new TicketsBooking(10);
		try {
			book.booking(totalTickets);
			
		}catch(TicketsFull t) {
			System.out.println(t.getMessage());
		}
		
		
	}
	public void booking(int totalTickets) throws TicketsFull {
		if(totalTickets<0) {
			System.out.println("Enter Valid Tickets to Proceed");
		}else if(totalTickets>getAvailableTickets()) {
			throw new TicketsFull("Tickets Not Availabe");
		}
		else{
			availableTickets=getAvailableTickets()-totalTickets;
		    System.out.println(totalTickets+" Tickets Booked SucessFully");
		}
	}

}
