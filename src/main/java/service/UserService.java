package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
}
