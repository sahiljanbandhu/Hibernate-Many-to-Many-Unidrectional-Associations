package com.jsp.person.cab;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityMangerFactory = Persistence.createEntityManagerFactory("nishant");
		EntityManager entityManager = entityMangerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();


		Cab cab = new Cab();
		cab.setName("maruti");
		cab.setType("Ac");

		Cab cab1 = new Cab();
		cab1.setName("bmw");
		cab1.setType("Ac withComfort");

		Cab cab2 = new Cab();
		cab2.setName("nano");
		cab2.setType("2nd class");

		ArrayList<Cab> c1 = new ArrayList();
		c1.add(cab1);
		c1.add(cab2);
		c1.add(cab);

		Person per1 = new Person();
		per1.setName("nishant");
		per1.setEmail("nishant@gmail.com");
		per1.setCo(25);
		
		Person per2 = new Person();
		per2.setName("nishant");
		per2.setEmail("nishant@gmail.com");
		per2.setCo(25);

		Person per = new Person();
		per.setName("nishant");
		per.setEmail("nishant@gmail.com");
		per.setCo(25);
		per.setCabs(c1);

		ArrayList<Person> p1 = new ArrayList<Person>();
		p1.add(per);
		p1.add(per1);
		p1.add(per2);
		
		per.setCabs(c1);
		per1.setCabs(c1);
		per2.setCabs(c1);
		
		cab.setPersons(p1);
		cab1.setPersons(p1);
		cab2.setPersons(p1);
		

		entityTransaction.begin();
		entityManager.persist(per);
		entityManager.persist(per1);
		entityManager.persist(per2);

		entityManager.persist(cab);
		entityManager.persist(cab1);
		entityManager.persist(cab2);

		entityTransaction.commit();
		System.out.println("all good");

	}

}
