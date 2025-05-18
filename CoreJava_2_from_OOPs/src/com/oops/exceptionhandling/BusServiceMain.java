package com.exceptionhandling;

public class BusServiceMain {

	public static void main(String[] args) {
		
		BusService bus = new BusService(10);
		
		try {
			bus.bookSeats(5);
			bus.bookSeats(6);
			
		}catch(SeatsNotAvailableException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
