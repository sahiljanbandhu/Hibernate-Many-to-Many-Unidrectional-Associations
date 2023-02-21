package com.jsp.person.cab.controller;

import com.jsp.person.cab.services.PersonServices;

public class UpdatePerson {
	public static void main(String[] args) {
		PersonServices personServices = new PersonServices();
		personServices.updatePerson(1, "Suraj", 98345672, "suraj@gmail.com");
	}

}
