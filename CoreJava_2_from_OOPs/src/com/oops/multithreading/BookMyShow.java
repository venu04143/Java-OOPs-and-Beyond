package com.multithreading;

class BookSeats{
	int totalAvailableSeats=10;
	
	synchronized void bookSeats(int seats) {
		if(totalAvailableSeats >=seats) {
			System.out.println(seats + " Have Been Booked SuccessFully");
			totalAvailableSeats-=seats;
			System.out.println("The Available Seats are : "+totalAvailableSeats);
		}else {
			System.err.println("Tickets Have Been Sold Out !");
			System.err.println("The Only Available Seats Are : "+ totalAvailableSeats);
		}
	}
}
public class BookMyShow extends Thread {

	static BookSeats b;
	int seats;
	@Override
	public void run() {
		b.bookSeats(seats);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		b = new BookSeats();
		
		BookMyShow venu = new BookMyShow();
		venu.seats=5;
		venu.start();
		
		BookMyShow pranay = new BookMyShow();
		pranay.seats=5;
		pranay.start();
		
		BookMyShow eswar = new BookMyShow();
		eswar.seats=4;
		eswar.start();

	}

}
