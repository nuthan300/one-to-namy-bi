package com.ty.onetoonebi.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoonebi.dao.Charcy;
import com.ty.onetoonebi.dao.Vehicle;

public class TestSaveVehicleCharcy {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		Charcy charcy = new Charcy();
		charcy.setCharcyNumber("indi1234567ka");
		charcy.setType("Bike");
		
		Vehicle vehicle = new Vehicle();
		vehicle.setName("Unicon");
		vehicle.setCost(165000);
		vehicle.setCharcy(charcy);
		
		entityTransaction.begin();
		entityManager.persist(vehicle);
		entityTransaction.commit();
	}
}
