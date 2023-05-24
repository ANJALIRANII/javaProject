package com.org;

import java.time.LocalDate;

public class Customer {
	// customer id(int) ,first name, last name
	// (string),email(string),password(string),registrationAmount(double),dob(LocalDate),plan(ServicePlan
	// : enum)

//ServicePlan charges : 
//SILVER : 1000 
//GOLD : 2000
//DIAMOND : 5000
//PLATINUM : 10000

	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private double registrationAmount;
	private LocalDate date;
	private ServicePlan plan;

	public Customer(int id, String firstName, String lastName, String email, String password, double registrationAmount,
			LocalDate date, ServicePlan plan) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.date = date;
		this.plan = plan;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", registrationAmount=" + registrationAmount + ", date=" + date + ", plan="
				+ plan + "]";
	}

	public int getId() {
		return id;
	}
	

}
