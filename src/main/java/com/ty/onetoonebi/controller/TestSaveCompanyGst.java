package com.ty.onetoonebi.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoonebi.dao.Company;
import com.ty.onetoonebi.dao.Gst;



public class TestSaveCompanyGst {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Company company = new Company();
		company.setName("tyy");
		company.setPhone(9685741023l);
		company.setWeb("tyy.com");
		
		Gst gst = new Gst();
		gst.setGstNumber("GST@TTYCOM");
		gst.setState("Karnataka");
		gst.setCountry("India");
		
		gst.setCompany(company);
		
		entityTransaction.begin();
		entityManager.persist(company);
		entityManager.persist(gst);
		entityTransaction.commit();
		
	}
}
