package com.java.register;
import java.io.PrintWriter;
import java.lang.String;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


public class matchemail {
	
	
		
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
			return true;
						
	}
		public static void main(String[] args){
			matchemail e = new matchemail();
			String Email = "golu4gupta1997@gmail.com";
			String Password = "bhanu1996";
			
			if(e.email(Email, Password)){
				System.out.println("email and password verified your password is changed successfully");
			
			}
			}
		}







	


