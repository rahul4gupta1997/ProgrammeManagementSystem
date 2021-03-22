package com.java.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AdminServlet() {
        super();
    
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			 
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String u = request.getParameter("Username");
		String p = request.getParameter("Password");
		
		if(u.equals("rahul") && p.equals("rahul1997")){
			HttpSession session = request.getSession();
			session.setAttribute("name", u);
			response.sendRedirect("Programme.jsp");
		}
		
	}
	
}
