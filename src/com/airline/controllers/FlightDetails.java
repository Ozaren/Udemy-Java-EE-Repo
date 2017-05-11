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
import com.airline.service.FlightRemote;

/**
 * Servlet implementation class FlightDetails
 */
@WebServlet("/FlightDetails")
public class FlightDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private FlightLocal fl = null;
	
	@EJB
	private FlightRemote fr = null;
	
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
		view.println(String.format("\nFlight Details:\n\n%s\n%s\n%s" , fl.getTo() , fl.getFrom() , fl.getAirplaneModel()));
		view.println(String.format("\nFlight Details:\n\n%s\n%s\n%s" , fr.getTo() , fr.getFrom() , fr.getAirplaneModel()));
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException {
		
	}
}
