package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import Model.Item;
import Repository.ItemRepository;

@Service
public class ItemService {

	@Autowired
	private ItemRepository repo;
	
	public List<Item> getAllItem(){
		return repo.findAll();
	}
	
	public List<Item> getItemByResId(String id){
		return repo.findByResId(id);
	}
}
