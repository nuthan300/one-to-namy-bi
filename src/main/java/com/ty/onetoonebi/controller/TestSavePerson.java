package com.ty.onetoonebi.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoonebi.dao.Pan;
import com.ty.onetoonebi.dao.Person;

public class TestSavePerson {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Person person = new Person();
		person.setName("Nuthan");
		person.setEmail("nuthan@mail.com");
		
		Pan pan = new Pan();
		pan.setAddress("BTM Layout Bangalore");
		pan.setPanNumber("Pky6587blr");
		
		pan.setPerson(person);
		person.setPan(pan);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit();
	}
}
