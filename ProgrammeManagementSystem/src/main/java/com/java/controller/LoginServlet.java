package com.java.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.java.register.FactoryProvider;
import com.java.register.signup;


 class loginDao {
	
	public boolean check(String Username, String Password){
		try{
		signup l = new signup();
		
		Session s = FactoryProvider.getfactory().openSession();
		Transaction tx2 = s.beginTransaction();
		
		Query q5 = s.createQuery("from signup s where s.Username= :user And s.Password= :pass");
		q5.setParameter("user", Username);
		q5.setParameter("pass", Password);
		List<signup> signup = q5.list();
		if(signup.isEmpty()){
			return false;
		}
		tx2.commit();
		s.close();
		
		return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		
	}
}

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			 
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String u = request.getParameter("Username");
			String p = request.getParameter("Password");
			
			loginDao dao = new loginDao();
			
			
			if(dao.check(u, p)){
				
				HttpSession session = request.getSession();
				session.setAttribute("name", u);
				response.sendRedirect("Programme.jsp");
			}else{
				out.print("username & password error");
				RequestDispatcher rd = request.getRequestDispatcher("/Login.jsp");
				rd.include(request, response);
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}
		
	}
	
}
