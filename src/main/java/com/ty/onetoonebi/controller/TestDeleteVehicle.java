package com.ty.onetoonebi.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoonebi.dao.Vehicle;

public class TestDeleteVehicle {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
//		Vehicle vehicle = entityManager.find(Vehicle.class, 1);
		entityTransaction.begin();
		entityManager.remove(entityManager.find(Vehicle.class, 1));
		entityTransaction.commit();
	}
}
