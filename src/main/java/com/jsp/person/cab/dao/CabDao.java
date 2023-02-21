package com.jsp.person.cab.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.person.cab.dto.Cab;


public class CabDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sahil");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Cab saveCab(Cab cab) {
		
		entityTransaction.begin();
		entityManager.persist(cab);
		entityTransaction.commit();

		return cab;
	}
	
	public Cab updateCab(int id, String name, String type) {
		Cab  cab1 = entityManager.find(Cab.class, id);

		if (cab1 != null) {
			cab1.setName(name);
			cab1.setName(name);
			cab1.setType(type);
			entityTransaction.begin();
			entityManager.merge(cab1);
			entityTransaction.commit();
			System.out.println("updated successfully");
		} else {
			System.out.println("not updated");
		}
		return cab1;
	}

	public Cab getCabById(int id) {
		Cab cab = entityManager.find(Cab.class, id);

		return cab;
	}

	public Cab deleteCabById(int id) {
		Cab cab = entityManager.find(Cab.class, id);

		entityTransaction.begin();
		entityManager.remove(cab);
		entityTransaction.commit();

		System.out.println("Cab Details deleted....");
		return cab;
	}
}


