package com.airline.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.airline.service.FlightService;

/**
 * Servlet implementation class FlightDetails
 */
@WebServlet("/FlightDetails")
public class FlightDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private FlightService fs = null;
	
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
		
		try {
			Context context = new InitialContext();
			
			/**Lookup Format
			 * java:global/%Context Root%/%Class Name%!%Fully Qualified Class name%
			 */
			Object fobj = context.lookup("java:global/ejb/FlightService!com.airline.service.FlightService");
			
			fs = (FlightService) fobj;
		}
		catch (NamingException e) {
			System.out.println("Naming Exception has occured when trying to lookup the flight service EJB");
			e.printStackTrace();
		}
		
		if(fs != null) {
			view.println(fs.getFrom());
			view.println(fs.getTo());
		}
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException {
		
	}
}
