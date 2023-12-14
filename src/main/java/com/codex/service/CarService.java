package com.codex.service;

import java.util.List;

import com.codex.entity.CarDetails;

public interface CarService {
	
	public String upsertCar(CarDetails carDetails);
	
	public List<CarDetails> getAllCars();
	
	public String deleteCar(Integer carId);

}
