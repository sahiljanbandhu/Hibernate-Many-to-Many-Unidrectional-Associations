package com.jsp.person.cab.controller;

import com.jsp.person.cab.services.PersonServices;

public class ViewPerson {
	public static void main(String[] args) {
		PersonServices personServices = new PersonServices();
		personServices.getPersonById(1);
	}

}
