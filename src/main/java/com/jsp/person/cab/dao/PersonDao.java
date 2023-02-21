package com.jsp.person.cab.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.person.cab.dto.Person;

public class PersonDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sahil");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Person savePerson(Person person) {

		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();

		return person;
	}

	public Person updatePerson(int id, String name, int cno, String email) {
		Person person = entityManager.find(Person.class, id);

		if (person != null) {
			person.setName(name);
			person.setCo(cno);
			person.setEmail(email);
			entityTransaction.begin();
			entityManager.merge(person);
			entityTransaction.commit();
			System.out.println("updated successfully");
		} else {
			System.out.println("not updated");
		}
		return person;
	}

	public Person getPersonById(int id) {
		Person person = entityManager.find(Person.class, id);

		return person;
	}

	public Person deletePersonById(int id) {
		Person person = entityManager.find(Person.class, id);

		entityTransaction.begin();
		entityManager.remove(person);
		entityTransaction.commit();

		System.out.println("Person Details deleted....");
		return person;
	}

}
