package com.bus.main;

import com.bus.model.Passenger;
import com.bus.service.BusService;
import com.bus.service.BusServiceImpl;

public class BusMainRunner {
	
	public static void main(String[] args) {
		BusService busService = new BusServiceImpl();
		busService.printBus();
		System.out.println("---------------------------------------------------------");
		System.out.println("---------------------------------------------------------");
		Passenger p1 = new Passenger("Raju Manchikatla", 26);
		//Passenger p2 = new Passenger("Alli Pramod", 26);
		
		busService.bookTicket(p1, "HYD", "VJWDA");
		busService.printBus();
		System.out.println("---------------------------------------------------------");
		System.out.println("---------------------------------------------------------");
		
		//busService.bookTicket(p2, "BGLR", "HYD");
		System.out.println(p1);
		//System.out.println(p2);
		busService.cancelTicket(p1);
		System.out.println(p1);
		busService.printBus();
	}
}
