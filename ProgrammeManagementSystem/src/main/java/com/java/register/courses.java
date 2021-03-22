package com.java.register;

import javax.persistence.Entity;
import javax.persistence.Id;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@Entity
public class courses {
	@Id
	private String CourseCode;
	private String Programme_code;
	private int Semester;
	private String Course_Name;
	private int Credits;
	private String Type;
	public String getCourseCode() {
		return CourseCode;
	}
	public void setCourseCode(String courseCode) {
		CourseCode = courseCode;
	}
	
	public String getProgramme_code() {
		return Programme_code;
	}
	public void setProgramme_code(String programme_code) {
		Programme_code = programme_code;
	}
	public int getSemester() {
		return Semester;
	}
	public void setSemester(int i) {
		Semester = i;
	}
	public String getCourse_Name() {
		return Course_Name;
	}
	public void setCourse_Name(String course_Name) {
		Course_Name = course_Name;
	}
	public int getCredits() {
		return Credits;
	}
	public void setCredits(int credits) {
		Credits = credits;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public courses(String courseCode, String programme_code, int semester, String course_Name, int credits,
			String type) {
		super();
		CourseCode = courseCode;
		Programme_code = programme_code;
		Semester = semester;
		Course_Name = course_Name;
		Credits = credits;
		Type = type;
	}
	public courses() {
		super();
		
	}
	@Override
	public String toString() {
		return "courses [CourseCode=" + CourseCode + ", Programme_code=" + Programme_code + ", Semester=" + Semester
				+ ", Course_Name=" + Course_Name + ", Credits=" + Credits + ", Type=" + Type + "]";
	}
	
	public static void main(String args[]){
		courses c = new courses();
		c.setCourse_Name("C Programming");
		c.setCourseCode("mcs11");
		c.setCredits(2);
		
		c.setType("compulsary");
		c.setSemester(1);
		Configuration con = new Configuration().configure().addAnnotatedClass(courses.class);
		
		SessionFactory sfc =con.buildSessionFactory();
		Session session = sfc.openSession();
		Transaction txc =session.beginTransaction();
		session.save(c);
		txc.commit();
		
		
	}
	
	

}
