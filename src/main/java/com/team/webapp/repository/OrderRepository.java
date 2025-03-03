package com.team.webapp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.team.webapp.model.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, String>{

	ResponseEntity<List<Order>> findAllByUId(String id);

	ResponseEntity<List<Order>> findAllByResId(String id);

}
