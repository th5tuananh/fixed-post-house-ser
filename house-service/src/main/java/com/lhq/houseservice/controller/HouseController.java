package com.lhq.houseservice.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lhq.houseservice.exception.ResourceNotFoundException;
import com.lhq.houseservice.model.House;
import com.lhq.houseservice.model.HouseCata;
import com.lhq.houseservice.repository.HouseCataRepository;
import com.lhq.houseservice.repository.HouseRepository;;

@RestController
@RequestMapping("/api")
public class HouseController {
	@Autowired
	HouseRepository houseRepository;
	
	@Autowired
	HouseCataRepository cataRepository;
	
	@GetMapping("/house")
	public List<HouseCata> getAllHouse(){
		return cataRepository.findAll();
	}
	@GetMapping("/house/{id}")
	public House getHouse(@PathVariable("id") long homeId){

		return houseRepository.findById(homeId).orElseThrow(() -> new ResourceNotFoundException("House", "id", homeId));
	}
	
	@PostMapping("/house/")
	public House addHouse(@Valid @RequestBody House home) {
		return houseRepository.save(home);
	}
}
