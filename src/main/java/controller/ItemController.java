package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Model.Item;
import service.ItemService;

@RestController
public class ItemController {

	@Autowired
	private ItemService iserve;
	
	@GetMapping("/allitem")
	private List<Item> AllItems(){
		return iserve.getAllItem();
	}
	
	//admin - getAll
	//restaurant - getAllByResId, updateItem, createItem, deleteItem
	//user - getll, getAllByResId
	
	@GetMapping("/allitem/{id}")
	private List<Item> AllItemOfRestaurant(@PathVariable String id){
		return iserve.getItemByResId(id);
	}
	
}
