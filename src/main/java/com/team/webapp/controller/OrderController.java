package com.team.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import com.team.webapp.model.Order;
import com.team.webapp.service.OrderService;

@RestController
@RequestMapping("/o")
public class OrderController {

	@Autowired
	private OrderService oserve;
	
	// user -  create Oder, getAllOrdersByUser, Cancel
	// restaurant - getAllOrdersByRestaurant, updateOrder
	// admin - getAllOrders
	
	@PostMapping("/new")
	private ResponseEntity<Order> createOrder(@RequestBody Order order){
		Order o = oserve.createOrder(order);
		return o!=null? new ResponseEntity<>(o,HttpStatus.CREATED) : new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	@PostMapping("/user")
	private ResponseEntity<List<Order>> getAllOrdersOfUser(@RequestPart String id){
		return oserve.getAllOrdersOfUser(id);
	}
	
	@PutMapping("/cancel")
	private ResponseEntity<Order> updateOrder(@RequestBody Order o){
		return new ResponseEntity<>(oserve.updateOrder(o),HttpStatus.OK);
	}
	
	@PostMapping("/res")
	private ResponseEntity<List<Order>> getAllOrdersOfRes(@RequestPart String id){
		return oserve.getAllOrdersOfRes(id);
	}
	
	@PutMapping("/update")
	private ResponseEntity<Order> updateOStatus(@RequestBody Order o){
		return new ResponseEntity<>(oserve.updateOrder(o),HttpStatus.OK);
	}
	
	@GetMapping("/all")
	private ResponseEntity<List<Order>> getAllOrders(){
		return new ResponseEntity<>(oserve.getAllOrders(), HttpStatus.OK);
	}
}
