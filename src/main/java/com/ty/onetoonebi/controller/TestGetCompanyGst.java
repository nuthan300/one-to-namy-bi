package com.ty.onetoonebi.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetoonebi.dao.Company;
import com.ty.onetoonebi.dao.Gst;

public class TestGetCompanyGst {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Gst gst = entityManager.find(Gst.class, 1);
		System.out.println(gst);
		System.out.println(gst.getCompany());
		
	}
}
