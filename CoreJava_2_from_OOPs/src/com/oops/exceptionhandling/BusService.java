package com.exceptionhandling;

public class BusService {
	private int availableSeats;
	
	public BusService(int totalSeats) {
		this.availableSeats=totalSeats;
	}
	
	public void bookSeats(int seatsRequested) throws SeatsNotAvailableException{
		if(seatsRequested > availableSeats) {
			throw new SeatsNotAvailableException("Booking Failed : Only "+availableSeats+" seats are avialbale.");
		}else {
			availableSeats -=seatsRequested;
			System.out.println("Booking successfull ! "+seatsRequested+" booked.");
		}
	}
	
	public int getAvailableSeats() {
		return availableSeats;
	}

}
