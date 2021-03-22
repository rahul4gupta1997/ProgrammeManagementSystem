package com.java.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Random;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.java.register.FactoryProvider;
import com.java.register.mail;
import com.java.register.signup;

class ForgetPassword{
	public static boolean email(String email,String user){
		signup student = new signup();
		Session ss=FactoryProvider.getfactory().openSession();
		Transaction tx= ss.beginTransaction();
		
		Query qq = ss.createQuery("from signup s where s.Email= :Emailid And s.Username= :user");
		qq.setParameter("Emailid", email);
		qq.setParameter("user", user);
		List<signup>signup1=qq.getResultList();
		if(signup1.isEmpty()){
			System.out.println("Enter a wrong email id");
			
			return false;
			}
		System.out.println(signup1);
		tx.commit();
		ss.close();
			
		return true;
		
	}
	
}

class OneTime{
	 
	public  String password(String email ,String user){
		 int OTP = new Random().nextInt(10000);
		 String password =user+OTP;
		 System.out.println(OTP);
		 	mail me = new mail();
		 	String message = "your Password has been reset.Please use this Password to login into the protal " +" :"+ password;
		 			
		 	String subject = "One Time password";
			String to = email ;
			String from = "unversity2021@gmail.com";
			me.sendEmail(message,subject,to,from);
		return password;
		 
	 }
	
	
}


public class ForgetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ForgetServlet() {
        super();
        
    }


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String email =request.getParameter("Email");
			String user =request.getParameter("Username");
			ForgetPassword fp = new ForgetPassword();
			OneTime ot = new OneTime();
			if(ForgetPassword.email(email, user)){
					String NewPassword =ot.password(email,user);
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
				}else{
					response.sendRedirect("Login.jsp");
				}
		}catch(Exception e){
			e.printStackTrace();	
		}
		
		
	}

}
