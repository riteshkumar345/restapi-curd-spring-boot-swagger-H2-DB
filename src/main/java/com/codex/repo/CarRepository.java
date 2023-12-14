package com.codex.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codex.entity.CarDetails;

public interface CarRepository extends JpaRepository<CarDetails, Serializable>{

}
