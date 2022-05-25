package com.ty.onetoonebi.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetoonebi.dao.Vehicle;

public class TestGetVehicle {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Vehicle vehicle = entityManager.find(Vehicle.class, 2);
		System.out.println(vehicle);
		System.out.println(vehicle.getCharcy());
	}
}
