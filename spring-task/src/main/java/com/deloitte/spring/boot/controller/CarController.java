package com.deloitte.spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.spring.boot.Entity.Car;
import com.deloitte.spring.boot.service.CarService;
@CrossOrigin(origins = "http://localhost:3000")
@Controller
@ResponseBody
@RequestMapping("/cars")
public class CarController {

	
	@Autowired
	CarService carService;

	
	@PostMapping("/savecar")
	public boolean saveCar(@RequestBody Car inputCarEntyObj) {
		boolean carSaved = false;
		try{
			carSaved = carService.saveCarDetails(inputCarEntyObj);
		}catch (Exception ex) {
			ex.printStackTrace();
		}
				
		return carSaved;
		
	}
	@CrossOrigin(origins =" http://localhost:8080")
	@GetMapping("/cardetails")
	public List<Car> getCarDetails(){
		List<Car> carEntityList = null;
		try{
			carEntityList = carService.getAllCarFromDB();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return carEntityList;
	}
	
	
}
