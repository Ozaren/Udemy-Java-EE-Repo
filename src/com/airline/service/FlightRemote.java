package com.airline.service;

import javax.ejb.Remote;

@Remote
public interface FlightRemote {
	int getId();
	
	void setId(int id);
	
	int getPrice();
	
	void setPrice(int price);
	
	int getNumOfSeats();
	
	void setNumOfSeats(int numOfSeats);
	
	String getFrom();
	
	void setFrom(String from);
	
	String getTo();
	
	void setTo(String to);
	
	String getAirplaneModel();
	
	void setAirplaneModel(String airplaneModel);
	
	public String toString();
}
