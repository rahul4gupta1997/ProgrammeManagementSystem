package com.java.register;


import java.util.Random;
import java.lang.String;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.java.Dao.factoryRegistration;

@Entity
public class Registration {
	@Id
	private int id;
	@Column(unique=true)
	
	private String Firstname;
	private String Lastname;
	private String Fathersname;
	private String  Mothersname;
	private String City;
	private String State;
	private String Country;
	private int Pincode;
	private String Dob;
	private String  Gender;
	private String Category;
	private String  Course;
	private String Subject;
	private long Phoneno;
	private String  Email;
	private String Religion;
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public long getPhoneno() {
		return Phoneno;
	}
	public void setPhoneno(long phoneno) {
		Phoneno = phoneno;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getReligion() {
		return Religion;
	}
	public void setReligion(String religion) {
		Religion = religion;
	}
	
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getFathersname() {
		return Fathersname;
	}
	public void setFathersname(String fathersname) {
		Fathersname = fathersname;
	}
	public String getMothersname() {
		return Mothersname;
	}
	public void setMothersname(String mothersname) {
		Mothersname = mothersname;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public int getPincode() {
		return Pincode;
	}
	public void setPincode(int pincode) {
		Pincode = pincode;
	}
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		Dob = dob;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Registration(int id, String firstname, String lastname, String fathersname, String mothersname, String city,
			String state, String country, int pincode, String dob, String gender, String category, String course,
			String subject, long phoneno2, String email, String religion) {
		super();
		this.id = id;
		Firstname = firstname;
		Lastname = lastname;
		Fathersname = fathersname;
		Mothersname = mothersname;
		City = city;
		State = state;
		Country = country;
		Pincode = pincode;
		Dob = dob;
		Gender = gender;
		Category = category;
		Course = course;
		Subject = subject;
		Phoneno = phoneno2;
		Email = email;
		Religion = religion;
	}
	
	public Registration() {
		
		super();
	}
	@Override
	public String toString() {
		return "Registration [id=" + id + ", Firstname=" + Firstname + ", Lastname=" + Lastname + ", Fathersname="
				+ Fathersname + ", Mothersname=" + Mothersname + ", City=" + City + ", State=" + State + ", Country="
				+ Country + ", Pincode=" + Pincode + ", Dob=" + Dob + ", Gender=" + Gender + ", Category=" + Category
				+ ", Course=" + Course + ", Subject=" + Subject + ", Phoneno=" + Phoneno + ", Email=" + Email
				+ ", Religion=" + Religion + "]";
	}
	
	
	public static void main( String[] args){
		Registration r=new Registration();
			r.setId(2);
		    r.setFirstname("Bhawana1");
		    r.setLastname("Dubey");
		    r.setFathersname("R.P. Dubey");
		    r.setMothersname("Anita Dubye");
		    r.setCity("Delhi");
		    r.setState("Delhi");
		    r.setCountry("india");
		    r.setPincode(110091);
		    r.setDob("sds4598");
		    r.setGender("Male");
		    r.setCategory("General");
		    r.setCourse("Mca");
		    r.setSubject("C Progamming");
		    r.setPhoneno(987769876);
		    r.setEmail("abc@gmail.com");
		    r.setReligion("Hindu");
		    
		
		    Session session =factoryRegistration.getfactory().openSession();
			Transaction tx =session.beginTransaction();
			session.save(r);
			tx.commit();
			session.close();
		
		}

	
	
}
