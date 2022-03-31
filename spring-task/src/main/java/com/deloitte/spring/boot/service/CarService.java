package com.deloitte.spring.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.spring.boot.Entity.Car;
import com.deloitte.spring.boot.dbimplementation.DbImplementation;


@Service
public class CarService {

	
	@Autowired
	DbImplementation carDBImplementation;
	
	public boolean saveCarDetails(Car carEntity) {
		
		boolean carSaved = false;
		 carSaved = carDBImplementation.saveCarDetails(carEntity);
		return carSaved;
		
	}

	public List<Car> getAllCarFromDB() {
		// TODO Auto-generated method stub
		return carDBImplementation.getAllCarDetails();
	}
}
