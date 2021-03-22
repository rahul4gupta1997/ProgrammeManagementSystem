package com.java.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.java.Dao.factoryRegistration;
import com.java.register.Registration;



public class RegisterationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RegisterationServlet() {
        super();
    
    }

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id= new Random().nextInt(100);
		String Firstname=request.getParameter("firstname");
		String Lastname=request.getParameter("lastname");
		String Fathersname=request.getParameter("fathername");
		String Mothersname=request.getParameter("mothername");
		String City=request.getParameter("city");
		String State=request.getParameter("state");
		String Country=request.getParameter("country");
		int Pincode=Integer.parseInt(request.getParameter("pin")); 
		String Dob=request.getParameter("myDate");
		String Gender=request.getParameter("gender");
		String Category=request.getParameter("category");
		String Course=request.getParameter("programme");
		String Subject=request.getParameter("optional");
		long Phoneno=Long.parseLong(request.getParameter("phone"));
		String Religion=request.getParameter("religion");
		String Email=request.getParameter("email");
		Registration rm = new Registration(id, Firstname,Lastname,Fathersname,Mothersname,City, State, Country,Pincode,Dob,Gender,Category,Course,Subject,Phoneno,Email,Religion);
		Session sess =factoryRegistration.getfactory().openSession();
		
		Transaction tx1=sess.beginTransaction();
		sess.save(rm);
		tx1.commit();
		sess.close();
		PrintWriter out =response.getWriter();
		out.println("your sign up is completed.click to go login page");
		RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
		rd.include(request, response);
		
		
	}



	

}
