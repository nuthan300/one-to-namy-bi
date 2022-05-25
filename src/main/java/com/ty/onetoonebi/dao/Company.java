package com.ty.onetoonebi.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name, web;
	private long phone;

	@OneToOne(mappedBy = "company")
	private Gst gst;

	public Gst getCompany() {
		return gst;
	}

	public void setCompany(Gst gst) {
		this.gst = gst;
	}

	@Override
	public String toString() {
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Web: " + web);
		System.out.println("Phone: " + phone);
		System.out.println();
		return "";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
}
