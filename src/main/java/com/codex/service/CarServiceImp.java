package com.codex.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codex.entity.CarDetails;
import com.codex.repo.CarRepository;

@Service
public class CarServiceImp implements CarService {
	
	private CarRepository carRepository;
	
	// constructor injection
	// 1-param-constructor, so no need to use @Autowired.
	public CarServiceImp(CarRepository carRepository) {
		this.carRepository = carRepository;
	}

	@Override
	public String upsertCar(CarDetails carDetails) {
		Integer carId = carDetails.getCarId();
		carRepository.save(carDetails);

		if(carId == null) {
			return "Record inserted successfully";
		}
		
		return "Record updated successfully";
		
	}

	@Override
	public List<CarDetails> getAllCars() {
		carRepository.findAll();
		return carRepository.findAll();
	}

	@Override
	public String deleteCar(Integer carId) {
		carRepository.deleteById(carId);
		return "A Car record is Deleted";
	}

}
