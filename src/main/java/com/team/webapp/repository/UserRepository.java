package com.team.webapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.team.webapp.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

	public User findUserByUEmailAndUPass(String uEmail, String uPass);

}
