package com.java.register;


import java.util.Random;
import java.lang.String;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


import com.sun.istack.internal.NotNull;

@Entity
public class signup {
	@Id
	private int id;
	@Column(unique=true)
	private String Username;
	private String Password;
	private String Email;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public signup(String username, String password, String email) {
		super();
		this.id = new Random().nextInt(1000);
		Username = username;
		Password = password;
		Email = email;
	}
	public signup() {
		
		super();
	}
	@Override
	public String toString() {
		return "signup [id=" + id + ", Username=" + Username + ", Password=" + Password + ", Email=" + Email + "]";
	}
	
	
	
}
