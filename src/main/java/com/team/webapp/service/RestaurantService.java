package com.team.webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team.webapp.model.Restaurant;
import com.team.webapp.repository.RestaurantRepository;

@Service
public class RestaurantService {

	@Autowired
	private RestaurantRepository repo;

	public void createRes(Restaurant res) {
		repo.save(res);
		
	}

	public List<Restaurant> getAllRestaurant() {
		return repo.findAll();
	}

	public Restaurant getRestaurantByUid(String id) {
		// TODO Auto-generated method stub
		return repo.findByUId(id);
	}

	public void deleteRestaurant(String rId) {
		repo.deleteById(rId);
		
	}

	public Restaurant updateRestaurant(Restaurant res) {
		// TODO Auto-generated method stub
		return repo.save(res);
	}
}
