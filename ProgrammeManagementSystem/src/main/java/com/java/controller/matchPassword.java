package com.java.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.java.register.FactoryProvider;
import com.java.register.signup;

class match{
	
	public boolean email(String Email, String Password){
		signup l = new signup();
		Session s8 = FactoryProvider.getfactory().openSession();
		Transaction  tx2 = s8.beginTransaction();
		
		Query q9 = s8.createQuery("from signup s where s.Email= :Emailid And s.Password= :pass");
		q9.setParameter("Emailid", Email);
		q9.setParameter("pass", Password);
		List<signup> signup = q9.list();
		if(signup.isEmpty()){
			System.out.println("Enter a wrong email id");
			
			return false;
			}
		System.out.println(signup);
		tx2.commit();
		s8.close();
		return true;
					
}
}

public class matchPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public matchPassword() {
        super();
        
    }

	


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		try {
			response.setContentType("text/html");
			
			PrintWriter out = response.getWriter();
			String email = request.getParameter("email");
			String Password = request.getParameter("Current_Password");
			String NewPassword = request.getParameter("Password");
			int id = Integer.parseInt(request.getParameter("id"));
			
			match m = new match();
			
			if(m.email(email,Password)){			
				
				signup l2= new signup();
				Session s9 = FactoryProvider.getfactory().openSession();
				Transaction  tx2 = s9.beginTransaction();
				
				Query q9 = s9.createQuery("update signup s set s.Password= :pass where s.Email=:email");
				q9.setParameter("email", email);
				q9.setParameter("pass", NewPassword);
				q9.executeUpdate();
				tx2.commit();
				s9.close();
				out.println("Your password has been changed successfully");
				response.sendRedirect("index.jsp");
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

