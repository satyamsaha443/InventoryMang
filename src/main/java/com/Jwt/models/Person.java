package com.Jwt.models;

import org.springframework.data.mongodb.core.mapping.Field;

public class Person {
	
	@Field("name")
	private String name;
	
	@Field("contact")
	private String contact;
	
	@Field("email")
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
