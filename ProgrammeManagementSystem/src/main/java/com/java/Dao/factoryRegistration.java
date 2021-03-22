package com.java.Dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.java.register.Registration;



public class factoryRegistration {
	public static SessionFactory factory;
	public static SessionFactory getfactory(){
		if(factory == null){
			factory = new Configuration().configure().addAnnotatedClass(Registration.class).buildSessionFactory();
		}
		return factory;
	}
	public void closefactory(){
		if(factory.isOpen()){
			factory.close();
		}
		
	}	

}


