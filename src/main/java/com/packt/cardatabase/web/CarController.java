package com.packt.cardatabase.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.packt.cardatabase.domain.Car;
import com.packt.cardatabase.domain.CarRepository;
import com.packt.cardatabase.service.AppUser;

@RestController
public class CarController {
	@Autowired
	private CarRepository repository;

	@RequestMapping("/carsuser")
	public Iterable<Car> getCars(Authentication authentication) {
		
		System.out.println((AppUser)authentication.getPrincipal());
		return repository.findAll();
	}
}
