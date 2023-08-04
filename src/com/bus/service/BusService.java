package com.bus.service;

import com.bus.model.Passenger;
import com.bus.model.Ticket;

public interface BusService {
	
	public Ticket bookTicket(Passenger passenger, String source, String destination);
	
	public void printBus();
	
	public void cancelTicket(Passenger passenger);
	
}
