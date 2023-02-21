package com.jsp.person.cab.services;

import com.jsp.person.cab.dao.PersonDao;
import com.jsp.person.cab.dto.Person;

public class PersonServices {
	PersonDao personDao = new PersonDao();

	public Person savePerson(Person person) {

		return personDao.savePerson(person);

	}

	public Person updatePerson(int id, String name, int cno, String email) {

		return personDao.updatePerson(id, name, cno, email);

	}

	public Person getPersonById(int id) {

		return personDao.getPersonById(id);
	}

	public Person deletePersonById(int id) {

		return personDao.deletePersonById(id);
	}

}
