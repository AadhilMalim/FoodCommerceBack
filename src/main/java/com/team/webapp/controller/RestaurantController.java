package com.team.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import com.team.webapp.model.Restaurant;
import com.team.webapp.service.RestaurantService;

@RestController
@RequestMapping("/r")
public class RestaurantController {

	@Autowired
	private RestaurantService rserve;
	
	// user - getAllRestaurant
	// restaurant - createRestaurant, getRestaurantById, deleteRestaurant, updateRestaurant
	// admin
	
	@GetMapping("/")
	private ResponseEntity<List<Restaurant>> getAllRes() {
		return new ResponseEntity<>(rserve.getAllRestaurant(),HttpStatus.OK);
	}
	
	@PostMapping("/add")
	private void createRes(@RequestBody Restaurant res) {
		rserve.createRes(res);
	}
	
	@PostMapping("/userId")
	private Restaurant getRestaurant(@RequestPart String uId) {
		return rserve.getRestaurantByUid(uId);
	}
	
	@DeleteMapping("/del")
	private void deleteRestaurant(@RequestPart String rId) {
		rserve.deleteRestaurant(rId);
	}
	
	@PostMapping("update")
	private Restaurant updateRestaurant(@RequestBody Restaurant res) {
		return rserve.updateRestaurant(res);
	}
	
}
