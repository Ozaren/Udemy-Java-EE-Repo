package com.airline.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.naming.Context;
import javax.naming.InitialContext;
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
	
	private FlightLocal flightStateless;
	
	private FlightLocal flightStateful;
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FlightDetails() {
		super();
		
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException {
		PrintWriter view = response.getWriter();
		
		try {
			Context context = new InitialContext();
			
			flightStateless = (FlightLocal) context.lookup("java:global/ejb/flight stateless!com.airline.service.FlightLocal");
			
			flightStateful = (FlightLocal) context.lookup("java:global/ejb/flight stateful!com.airline.service.FlightLocal");
		}
		catch (Exception e) {
			e.printStackTrace();
			
			return;
		}
		
		view.println("The flight detail servlet has been called...");
		view.println(String.format("\nFlight Details:\n\n%s\n%s\n%s" , flightStateless.getTo() , flightStateless.getFrom() , flightStateless.getAirplaneModel()));
		view.println(String.format("\nFlight Details:\n\n%s\n%s\n%s" , flightStateful.getTo() , flightStateful.getFrom() , flightStateful.getAirplaneModel()));
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException {
		
	}
}
