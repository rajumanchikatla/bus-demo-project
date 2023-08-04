package com.bus.model;

import java.util.ArrayList;
import java.util.List;

import com.bus.common.constnats.Constants;

public class Bus {
	
	private String serviceNumber;
	
	private String source;
	
	private String destination;
	
	private int seats;
	
	private String startTime;
	
	private int journeyKm;
	
	private List <Ticket> ticket;

	public Bus(String serviceNumber, String source, String destination, 
			int seats, String startTime, int journeyKm) {
		super();
		this.serviceNumber = serviceNumber;
		this.source = source;
		this.destination = destination;
		this.seats = seats;
		this.startTime = startTime;
		this.journeyKm = journeyKm;
		this.ticket = new ArrayList<Ticket>();
	}

	public String getServiceNumber() {
		return serviceNumber;
	}

	public void setServiceNumber(String serviceNumber) {
		this.serviceNumber = serviceNumber;
		
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public int getJourneyKm() {
		return journeyKm;
	}

	public void setJourneyKm(int journeyKm) {
		this.journeyKm = journeyKm;
	}

	public List<Ticket> getTicket() {
		return ticket;
	}

	public void setTicket(List<Ticket> ticket) {
		this.ticket = ticket;
	}

	@Override
	public String toString() {
		return "Bus [Corporation="+Constants.CORPORATION +", serviceNumber=" + serviceNumber + ", source=" + source + ", destination=" + destination
				+ ", seats=" + seats + ", startTime=" + startTime + ", journeyKm=" + journeyKm + ", ticket=" + ticket
				+ "]";
	}



}