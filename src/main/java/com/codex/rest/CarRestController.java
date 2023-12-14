package com.codex.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codex.entity.CarDetails;
import com.codex.service.CarService;

@RestController
public class CarRestController {
	
	@Autowired
	private CarService carService;
	
	@PostMapping("/car")
	public ResponseEntity<String> addCar(@RequestBody CarDetails carDetails) {
		String msg = carService.upsertCar(carDetails);
		return new ResponseEntity<>(msg, HttpStatus.CREATED);
	}
	
	@PutMapping("/car")
	public ResponseEntity<String> updateCar(@RequestBody CarDetails carDetails) {
		String msg = carService.upsertCar(carDetails);
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
	
	@GetMapping("/car")
	public ResponseEntity<List<CarDetails>> getAllCarDetails() {
		List<CarDetails> listCarDetails = carService.getAllCars();
		return new ResponseEntity<>(listCarDetails, HttpStatus.OK);
	}
	
	@DeleteMapping("car/{carId}")
	public ResponseEntity<String> deleteCarById(@PathVariable Integer carId) {
		String msg = carService.deleteCar(carId);
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}

}
