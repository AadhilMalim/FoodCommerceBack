package com.team.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.team.webapp.model.Item;
import com.team.webapp.service.ItemService;

@RestController
@RequestMapping("/items")
public class ItemController {

	@Autowired
	ItemService iserve;
	
	@GetMapping("/")
	private ResponseEntity<List<Item>> getAllItem(){
		return new ResponseEntity<>(iserve.getAllItem(),HttpStatus.OK);
	}
	
	//admin - getAll
	//restaurant - getAllByResId, updateItem, createItem, deleteItem
	//user - getll, getAllByResId
	
	@GetMapping("/res/{id}")
	private ResponseEntity<List<Item>> GetAllItemByResId(@PathVariable String id){
		return new ResponseEntity<>(iserve.getItemByResId(id), HttpStatus.OK);
	}
	
	@PostMapping("/add")
	private ResponseEntity<Item> addNewItem(@RequestBody Item item){
		return new ResponseEntity<>(iserve.addItem(item), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	private ResponseEntity<Item> updateItem(@RequestBody Item item){
		return new ResponseEntity<>(iserve.updateItem(item), HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	private ResponseEntity<String> deleteItem(@PathVariable String id){
		int ok = iserve.deleteItem(id);
		if(ok==0)
		return new ResponseEntity<>("Item Deleted Succesfully",HttpStatus.OK);
		else return new ResponseEntity<>("Deletion Failed",HttpStatus.NOT_FOUND);
	}
}