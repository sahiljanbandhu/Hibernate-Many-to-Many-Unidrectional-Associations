package com.jsp.person.cab.controller;

import com.jsp.person.cab.services.CabServices;

public class DeleteCab {

	public static void main(String[] args) {
		CabServices cabServices = new CabServices();
		cabServices.deleteCabById(2);
	}

}
