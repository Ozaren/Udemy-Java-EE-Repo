package com.airline.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.airline.service.CounterBean;

/**
 * Servlet implementation class AddOne
 */
@WebServlet("/AddOne")
public class AddOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private CounterBean counter;
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddOne() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException {
		PrintWriter out = response.getWriter();
		
		out.println("The counter shows " + counter.getCount());
		counter.incCount();
		out.println("After incrementing the counter shows " + counter.getCount());
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException {
		// TODO Auto-generated method stub
		doGet(request , response);
	}
	
}
