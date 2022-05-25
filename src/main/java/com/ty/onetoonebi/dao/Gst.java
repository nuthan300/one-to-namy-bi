package com.ty.onetoonebi.dao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Gst {

	@Id
	private int id;
	private String gstNumber, state, country;
	@OneToOne
	@JoinColumn(name = "my_company_ty")
	private Company company;

	@Override
	public String toString() {
		System.out.println("GST Number: " + gstNumber);
		System.out.println("State: " + state);
		System.out.println("Country: " + country);
		System.out.println();
		return "";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGstNumber() {
		return gstNumber;
	}

	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
}
