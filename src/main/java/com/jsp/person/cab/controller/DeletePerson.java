package com.jsp.person.cab.controller;

import com.jsp.person.cab.services.PersonServices;

public class DeletePerson {
	public static void main(String[] args) {
		PersonServices personServices = new PersonServices();
		personServices.deletePersonById(2);
	}

}
