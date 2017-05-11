package com.airline.service;

import javax.ejb.Stateful;

/**
 * Session Bean implementation class FlightService
 */
@Stateful(name = "flight stateful")
public class FlightServiceStatefulBean implements FlightLocal {
	private int	id			= 999999;
	private int	price		= 400;
	private int	numOfSeats	= 250;
	
	private String	from			= "Middle Earth";
	private String	to				= "Hyper Earth";
	private String	airplaneModel	= "Firebolt";
	
	/**
	 * Default constructor.
	 */
	public FlightServiceStatefulBean() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getNumOfSeats() {
		return numOfSeats;
	}
	
	public void setNumOfSeats(int numOfSeats) {
		this.numOfSeats = numOfSeats;
	}
	
	public String getFrom() {
		return from;
	}
	
	public void setFrom(String from) {
		this.from = from;
	}
	
	public String getTo() {
		return to;
	}
	
	public void setTo(String to) {
		this.to = to;
	}
	
	public String getAirplaneModel() {
		return airplaneModel;
	}
	
	public void setAirplaneModel(String airplaneModel) {
		this.airplaneModel = airplaneModel;
	}
	
	@Override
	public String toString() {
		return "FlightService [id=" + id + ", price=" + price + ", numOfSeats=" + numOfSeats + ", from=" + from + ", to=" + to + ", airplaneModel=" + airplaneModel + "]";
	}
}
