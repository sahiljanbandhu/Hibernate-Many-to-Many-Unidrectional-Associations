package com.jsp.person.cab.services;

import com.jsp.person.cab.dao.CabDao;
import com.jsp.person.cab.dto.Cab;

public class CabServices {
	CabDao cabDao = new CabDao();

	public Cab saveCab(Cab cab) {

		return cabDao.saveCab(cab);

	}

	public Cab updateCab(int id, String name, String type) {

		return cabDao.updateCab(id, name, type);

	}

	public Cab getCabById(int id) {

		return cabDao.getCabById(id);
	}


	public Cab deleteCabById(int id) {

		return cabDao.deleteCabById(id);
	}

}
