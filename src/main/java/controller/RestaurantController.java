package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import service.RestaurantService;

@RestController
public class RestaurantController {

	@Autowired
	private RestaurantService rserve;
}
