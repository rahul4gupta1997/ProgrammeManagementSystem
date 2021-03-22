package com.java.register;


import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;

@Entity
public class programme {
	
	@Id
	private String Programme_code;
	private int Sno;
	private String Programme_name;
	private String Minimum_duration;
	private String Maximum_duration;
	private int  Fees;
	private String Course_Fee_Discription;
	private String Category;
	private int Semester;
	private String Eligiblity;
	 
	
	public String getEligiblity() {
		return Eligiblity;
	}


	public void setEligiblity(String eligiblity) {
		Eligiblity = eligiblity;
	}


	public String getProgramme_code() {
		return Programme_code;
	}


	public void setProgramme_code(String programme_code) {
		Programme_code = programme_code;
	}


	public int getSno() {
		return Sno;
	}


	public void setSno(int sno) {
		Sno = sno;
	}


	public String getProgramme_name() {
		return Programme_name;
	}


	public void setProgramme_name(String programme_name) {
		Programme_name = programme_name;
	}


	public String getMinimum_duration() {
		return Minimum_duration;
	}


	public void setMinimum_duration(String minimum_duration) {
		Minimum_duration = minimum_duration;
	}


	public String getMaximum_duration() {
		return Maximum_duration;
	}


	public void setMaximum_duration(String maximum_duration) {
		Maximum_duration = maximum_duration;
	}


	public int getFees() {
		return Fees;
	}


	public void setFees(int fees) {
		Fees = fees;
	}


	public String getCourse_Fee_Discription() {
		return Course_Fee_Discription;
	}


	public void setCourse_Fee_Discription(String course_Fee_Discription) {
		Course_Fee_Discription = course_Fee_Discription;
	}


	public int getSemester() {
		return Semester;
	}


	public void setSemester(int semester) {
		Semester = semester;
	}


	public String getCategory() {
		return Category;
	}


	public void setCategory(String category) {
		Category = category;
	}
	
	
	

	public programme() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public programme(String programme_code, int sno, String programme_name, String minimum_duration,
			String maximum_duration, int fees, String course_Fee_Discription, String category, int semester,
			String eligiblity) {
		super();
		Programme_code = programme_code;
		Sno = sno;
		Programme_name = programme_name;
		Minimum_duration = minimum_duration;
		Maximum_duration = maximum_duration;
		Fees = fees;
		Course_Fee_Discription = course_Fee_Discription;
		Category = category;
		Semester = semester;
		Eligiblity = eligiblity;
	}



	public static void main( String[] args){
		
		programme p = new programme();
		p.setSno(1);
		p.setProgramme_code("Mtech");
		p.setProgramme_name("Masters of science and technology");
		p.setMinimum_duration("2 years");
		p.setMaximum_duration("4 years");
		p.setCategory("P.G.");
		p.setSemester(4);
		p.setCourse_Fee_Discription("Rs. 48,000/- for full programme to be paid semester wise @Rs. 12000/- per semester.");
		p.setFees(48000);
		p.setEligiblity("Bachelors degree or a higher degree in any discipline from a recognised university");
		Configuration con = new Configuration().configure().addAnnotatedClass(programme.class);
		
		SessionFactory sf =con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx =session.beginTransaction();
		session.save(p);
		tx.commit();
		
	
	}
	


}
