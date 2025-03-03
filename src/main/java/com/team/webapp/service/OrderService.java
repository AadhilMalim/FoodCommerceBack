package com.team.webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.team.webapp.model.Order;
import com.team.webapp.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repo;

	public Order createOrder(Order order) {
		Order o =null;
		try {
			o  = repo.save(order);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return o;
	}

	public ResponseEntity<List<Order>> getAllOrdersOfUser(String id) {

		return repo.findAllByUId(id);
	}

	public ResponseEntity<List<Order>> getAllOrdersOfRes(String id) {

		return repo.findAllByResId(id);
	}

	public Order updateOrder(Order o) {

		return repo.save(o);
	}

	public List<Order> getAllOrders() {

		return repo.findAll();
	}
}
