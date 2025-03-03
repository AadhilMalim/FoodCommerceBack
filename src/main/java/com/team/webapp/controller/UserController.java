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

import com.team.webapp.model.User;
import com.team.webapp.service.UserService;

@RestController
@RequestMapping("/u")
public class UserController {

	@Autowired
	private UserService userve;
	
	// admin -  create user, get user
	// user - create user, get user
	// restaurant - create user, get user
	
	@PostMapping("/register")
	private ResponseEntity<User> createUser(@RequestBody User user){
		User newUser = userve.createUser(user);
		if(newUser != null) return new ResponseEntity<>(newUser, HttpStatus.CREATED);
		else return new ResponseEntity<>(HttpStatus.BAD_GATEWAY);
	}
	
	@PostMapping("/login")
	private ResponseEntity<User> getUser(@RequestPart String email,@RequestPart String password){
		System.out.println("uc called");
		User u = userve.findUser(email, password);
		
		return u!=null? new ResponseEntity<>(u, HttpStatus.FOUND) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/gAeLtL")
	private ResponseEntity<List<User>> getAllUsers(){
		List<User> allUser = userve.getAllUsers();
		if(allUser != null) return new ResponseEntity<>(allUser, HttpStatus.FOUND);
		else return new ResponseEntity<>(HttpStatus.BAD_GATEWAY);
	}
	
	@DeleteMapping("/del")
	private void deleteUser(@RequestPart String id){
		userve.deleteUserById(id);
	}
	}
