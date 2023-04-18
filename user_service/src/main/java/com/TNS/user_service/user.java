package com.TNS.user_service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class user 
{
	private Integer user_id;
	private String user_name;
	private String user_email;
	private Integer user_age;
	private String user_gender;
	private Integer user_contact;
	private String user_location;
	private String user_password;
	public user() {
		super();
		// TODO Auto-generated constructor stub
	}
	public user(Integer user_id, String user_name, String user_email, Integer user_age, String user_gender,
			Integer user_contact, String user_location, String user_password) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_email = user_email;
		this.user_age = user_age;
		this.user_gender = user_gender;
		this.user_contact = user_contact;
		this.user_location = user_location;
		this.user_password = user_password;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public Integer getUser_age() {
		return user_age;
	}
	public void setUser_age(Integer user_age) {
		this.user_age = user_age;
	}
	public String getUser_gender() {
		return user_gender;
	}
	public void setUser_gender(String user_gender) {
		this.user_gender = user_gender;
	}
	public Integer getUser_contact() {
		return user_contact;
	}
	public void setUser_contact(Integer user_contact) {
		this.user_contact = user_contact;
	}
	public String getUser_location() {
		return user_location;
	}
	public void setUser_location(String user_location) {
		this.user_location = user_location;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	@Override
	public String toString() {
		return "user [user_id=" + user_id + ", user_name=" + user_name + ", user_email=" + user_email + ", user_age="
				+ user_age + ", user_gender=" + user_gender + ", user_contact=" + user_contact + ", user_location="
				+ user_location + ", user_password=" + user_password + "]";
	}
	
}
