package com.team.webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.team.webapp.model.Item;
import com.team.webapp.repository.ItemRepository;

@Service
public class ItemService {

	@Autowired
	ItemRepository repo;
	
	public List<Item> getAllItem(){
		return repo.findAll();
	}
	
	public List<Item> getItemByResId(String id){
		return repo.findAllByResId(id);
	}

	public Item addItem(Item item) {
		return repo.save(item);
	}

	public Item updateItem(Item item) {
		return repo.save(item);
	}

	public int deleteItem(String id) {
		
		try {
			repo.delete(null);
			return 0;
		} catch (Exception e) {
			return 1;
		}
	}
}
