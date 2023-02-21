package com.jsp.person.cab.controller;

import com.jsp.person.cab.services.CabServices;

public class ViewCab {
	public static void main(String[] args) {
		CabServices cabServices = new CabServices();
		cabServices.getCabById(2);
	}

}
