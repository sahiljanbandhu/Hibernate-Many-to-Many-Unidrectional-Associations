package com.jsp.person.cab.controller;

import com.jsp.person.cab.services.CabServices;

public class UpdateCab {
	public static void main(String[] args) {
		CabServices cabServices = new CabServices();
		cabServices.updateCab(1, "maruti", "tata");
	}

}
