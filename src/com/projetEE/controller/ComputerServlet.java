package com.projetEE.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.projetEE.service.ComputerService;
import com.projetEE.service.impl.ComputerServiceImpl;

@WebServlet("/Ordinateurs")
public class ComputerServlet extends HttpServlet {

	private ComputerService computerService;
	
	public ComputerServlet() {
		super();
		computerService = ComputerServiceImpl.getInstance();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("computers", computerService.getAll());
		RequestDispatcher rd = getServletContext().getRequestDispatcher(response.encodeURL("/WEB-INF/jsp/dashboard.jsp"));
		rd.forward(request, response);
	}
	
}
