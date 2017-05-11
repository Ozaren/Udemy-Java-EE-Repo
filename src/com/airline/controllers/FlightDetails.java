package com.airline.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.airline.service.FlightLocal;

/**
 * Servlet implementation class FlightDetails
 */
@WebServlet("/FlightDetails")
public class FlightDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB(beanName = "flight stateless")
	private FlightLocal flightStateless1 = null;
	
	@EJB(beanName = "flight stateless")
	private FlightLocal flightStateless2 = null;
	
	@EJB(beanName = "flight stateful")
	private FlightLocal flightStateful1 = null;
	
	@EJB(beanName = "flight stateful")
	private FlightLocal flightStateful2 = null;
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FlightDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException {
		// TODO Auto-generated method stub
		PrintWriter view = response.getWriter();
		
		view.println("The flight detail servlet has been called...");
		view.println(String.format("\nFlight Details:\n\n%s\n%s\n%s" , flightStateless1.getTo() , flightStateless1.getFrom() , flightStateless1.getAirplaneModel()));
		view.println(String.format("\nFlight Details:\n\n%s\n%s\n%s" , flightStateless2.getTo() , flightStateless2.getFrom() , flightStateless2.getAirplaneModel()));
		view.println(String.format("\nFlight Details:\n\n%s\n%s\n%s" , flightStateful1.getTo() , flightStateful1.getFrom() , flightStateful1.getAirplaneModel()));
		view.println(String.format("\nFlight Details:\n\n%s\n%s\n%s" , flightStateful2.getTo() , flightStateful2.getFrom() , flightStateful2.getAirplaneModel()));
		
		flightStateless2.setFrom("paris");
		flightStateless2.setTo("rome");
		
		view.println("----------------------------------------");
		
		view.println(String.format("\nFlight Details:\n\n%s\n%s\n%s" , flightStateless1.getTo() , flightStateless1.getFrom() , flightStateless1.getAirplaneModel()));
		view.println(String.format("\nFlight Details:\n\n%s\n%s\n%s" , flightStateless2.getTo() , flightStateless2.getFrom() , flightStateless2.getAirplaneModel()));
		view.println(String.format("\nFlight Details:\n\n%s\n%s\n%s" , flightStateful1.getTo() , flightStateful1.getFrom() , flightStateful1.getAirplaneModel()));
		view.println(String.format("\nFlight Details:\n\n%s\n%s\n%s" , flightStateful2.getTo() , flightStateful2.getFrom() , flightStateful2.getAirplaneModel()));
		
		flightStateful2.setFrom("paris 2");
		flightStateful2.setTo("rome 2");
		
		view.println("----------------------------------------");
		
		view.println(String.format("\nFlight Details:\n\n%s\n%s\n%s" , flightStateless1.getTo() , flightStateless1.getFrom() , flightStateless1.getAirplaneModel()));
		view.println(String.format("\nFlight Details:\n\n%s\n%s\n%s" , flightStateless2.getTo() , flightStateless2.getFrom() , flightStateless2.getAirplaneModel()));
		view.println(String.format("\nFlight Details:\n\n%s\n%s\n%s" , flightStateful1.getTo() , flightStateful1.getFrom() , flightStateful1.getAirplaneModel()));
		view.println(String.format("\nFlight Details:\n\n%s\n%s\n%s" , flightStateful2.getTo() , flightStateful2.getFrom() , flightStateful2.getAirplaneModel()));
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException {
		
	}
}
