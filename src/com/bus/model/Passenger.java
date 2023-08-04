package com.bus.model;

import com.bus.common.constnats.Constants;

public class Passenger {

	private String name;
	
	private int age;
	
	private Ticket ticket;

	public Passenger(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	@Override
	public String toString() {
		String ticketNumber = ticket == null ? null : ticket.getTicketId();
		Double ticketPrice = ticket == null ? null : ticket.getPrice();
		return "Passenger [name=" + name + ", age=" + age + 
				", corporation="+Constants.CORPORATION 
				+ ", ticket=" + ticketNumber
				+ ", Price=" + ticketPrice+ "]";
	}
	
}
