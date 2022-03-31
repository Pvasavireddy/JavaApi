package com.deloitte.spring.boot.dbimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.deloitte.spring.boot.Entity.Car;
import com.deloitte.spring.boot.repository.CarDao;

@Component
public class DbImplementation {
	
	@Autowired
	CarDao carDao;
	
	public boolean saveCarDetails(Car inputCarEntity) {
		
		
		boolean carDetailsSaved = false;
		
		Car saveCarEntity = carDao.saveAndFlush(inputCarEntity);
		if(null != saveCarEntity) {
			carDetailsSaved = true;
		}
		
		return carDetailsSaved;
		
	}

	public List<Car> getAllCarDetails() {
		// TODO Auto-generated method stub
		List<Car> carListFromDB = carDao.findAll();
		return carListFromDB;
	}
}
