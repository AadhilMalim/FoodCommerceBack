package com.team.webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team.webapp.model.User;
import com.team.webapp.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	public User createUser(User user) {
		// TODO Auto-generated method stub
		return repo.save(user);
	}

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public User findUser(String uEmail, String uPass) {
		User user = null;
		try {
			user = repo.findUserByUEmailAndUPass(uEmail,uPass);
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
		
		return user;
	}

	public void deleteUserById(String id) {
		repo.deleteById(id);
	}
}
