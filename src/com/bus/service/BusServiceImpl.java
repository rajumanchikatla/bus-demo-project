package com.bus.service;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.bus.common.constnats.Constants;
import com.bus.model.Bus;
import com.bus.model.Passenger;
import com.bus.model.Ticket;

public class BusServiceImpl implements BusService {
	
	private List<Bus> buses;
	
	{
		// serviceNumber,  source,  destination,  seats,  startTime,  journeyKm
		buses = new ArrayList<Bus>();
		buses.add(new Bus("123", "HYD", "VJWDA", 34, "19:00 PM", 450));
		buses.add(new Bus("256", "VJWA", "HYD", 28, "14:00 PM", 450));
		buses.add(new Bus("789", "MUMB", "HYD", 14, "14:00 PM", 1200));
		buses.add(new Bus("452", "CHN", "HYD", 28, "12:00 PM", 900));
		buses.add(new Bus("965", "BGLR", "HYD", 28, "11:00 PM", 890));
		buses.add(new Bus("112", "HYD", "BGLR", 14, "03:00 PM", 890));
		
	}
	

	@Override
	public Ticket bookTicket(Passenger passenger, String source, String destination) {
		
		for(Bus b: buses) {
			if(b.getSource().equals(source) && b.getDestination().equals(destination)) {
				if(b.getTicket().size() < b.getSeats()) {
					Ticket t = new Ticket(passenger, b);
					t.setPrice(b.getJourneyKm() * Constants.KM_FARE);
					t.setTicketId(generateRandomTicketId());
					passenger.setTicket(t);
					b.getTicket().add(t);
					b.setSeats(b.getSeats()-1);
					return t;
				}
			}
		}
		
		throw new RuntimeException("Unable To Book Ticket: Bus not available");
	}
	
	public void cancelTicket(Passenger passenger) {
		Ticket t = passenger.getTicket();
		t.getBus().setSeats(t.getBus().getSeats()+1);
		t.getBus().getTicket().remove(t);
		passenger.setTicket(null);
	}
	
	public void printBus() {
		buses.forEach(b -> System.out.println(b));
	}

	public String generateRandomTicketId() {
		return UUID.randomUUID().toString();
	}
}