package com.team.webapp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.team.webapp.model.Item;

@Repository
public interface ItemRepository extends MongoRepository<Item, String>{

	List<Item> findAllByResId(String resId);
}
