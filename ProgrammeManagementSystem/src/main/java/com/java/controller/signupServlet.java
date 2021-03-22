package com.java.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.java.register.FactoryProvider;
import com.java.register.signup;


public class signupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public signupServlet() {
        super();
      
    }



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			String Username=request.getParameter("Username");
			String Password=request.getParameter("Password");
			String Email=request.getParameter("Email");
			
			signup r=new signup(Username,Password,Email);
			
			System.out.println(r.getUsername()+":"+ r.getPassword() +":" +r.getEmail());
			Session sess =FactoryProvider.getfactory().openSession();
			
			Transaction tx1=sess.beginTransaction();
			sess.save(r);
			tx1.commit();
			sess.close();
			PrintWriter out =response.getWriter();
			out.println("your sign up is completed.click to go login page");
			response.sendRedirect("Login.jsp");
			
		}catch(Exception e)
		{
			PrintWriter out =response.getWriter();
			out.println("your sign up is not completed.Please try again");
			e.printStackTrace();
		}
		
		
	}

}
