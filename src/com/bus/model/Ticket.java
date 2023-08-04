package com.bus.model;

public class Ticket {
	
	private String ticketId;
	
	private Passenger passenger;
	
	private double price;
	
	private Bus bus;

	public Ticket(Passenger passenger, Bus bus) {
		super();
		this.passenger = passenger;
		this.bus = bus;
	}

	public String getTicketId() {
		return ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Ticket [passenger=" + passenger + ", bus=" 
				+ bus.getServiceNumber() +"]";
	}
}
