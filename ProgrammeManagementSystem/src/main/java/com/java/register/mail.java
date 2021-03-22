package com.java.register;

import java.util.Properties;
import java.util.Random;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class mail {

	public static void sendEmail(String message, String subject, String to, String from) {
		//variable for gmail
		String host = "smtp.gmail.com";
		
		// get the properties
		Properties properties = System.getProperties();
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", "465");
		properties.put("mail.smtp.ssl.enable","true" );
		properties.put("mail.smtp.auth", "true");
		
		Session session = Session.getInstance(properties, new Authenticator(){

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				// TODO Auto-generated method stub
				return new PasswordAuthentication("unversity2021","university@123");
				
			}
			
			
		});
		session.setDebug(true);
		
		MimeMessage m = new MimeMessage(session);
		
		try{
		
		m.setFrom(from);
		// adding  recipient to message
		
		m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
		//adding subject to message
		m.setSubject(subject);
		m.setText(message);
		
		//send
		Transport.send(m);
		System.out.println("message sent successfully");
		
		}catch (Exception e){
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args){
	int OTP = new Random().nextInt(10000);
	 System.out.println(OTP);
	 	mail m = new mail();
	 	String message = "your Password has been reset.Please enter the One time Password to reset your password" + OTP;
		String subject = "One Time password";
		String to = "golu4gupta@gmail.com";
		String from = "unversity2021@gmail.com";
		m.sendEmail(message,subject,to,from);
		String password ="rahul"+OTP;
		System.out.println(password);
	}
}
