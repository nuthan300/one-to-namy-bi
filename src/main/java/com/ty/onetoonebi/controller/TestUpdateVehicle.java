package com.ty.onetoonebi.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoonebi.dao.Charcy;

public class TestUpdateVehicle {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Charcy charcy = entityManager.find(Charcy.class, 2);
		charcy.setType("Car");
		
		entityTransaction.begin();
		entityManager.merge(charcy);
		entityTransaction.commit();
	}
}
