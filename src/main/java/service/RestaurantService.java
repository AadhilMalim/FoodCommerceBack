package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repository.RestaurantRepository;

@Service
public class RestaurantService {

	@Autowired
	private RestaurantRepository repo;
}
