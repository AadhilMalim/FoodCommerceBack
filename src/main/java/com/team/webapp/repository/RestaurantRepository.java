package com.team.webapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.team.webapp.model.Restaurant;

@Repository
public interface RestaurantRepository extends MongoRepository<Restaurant, String>{

	Restaurant findByUId(String id);

}
