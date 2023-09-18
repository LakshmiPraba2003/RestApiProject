package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="signup")
public class Signup {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String emailid;
	private String password;
	public Signup() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Signup(int id, String emailid, String password) {
		super();
		this.id = id;
		this.emailid = emailid;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
