package com.socgen.arjun.training.exchange.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.socgen.arjun.training.exchange.Entity.StockExchange;
import com.socgen.arjun.training.exchange.Service.StockExchangeService;


@RestController
public class StockExchangeController {
	
	@Autowired
	StockExchangeService service;
	
	@RequestMapping("/stockExchange")
	Iterable<StockExchange> getAllData() {
		return service.getAllData();
	}
	
	
	
//	For adding a new User
	@RequestMapping(method = RequestMethod.POST, value = "/users")
	void addUser(@RequestBody StockExchange user) {
		service.addStockExchange(user);	}
	
//	For updating a User
	@RequestMapping(method = RequestMethod.PUT, value = "/users/{id}")
	void updateUser(@RequestBody StockExchange user, @PathVariable int id) {
		service.updateStockExchange(user, id);
	}
	
//	For deleting a User
	@RequestMapping(method = RequestMethod.DELETE, value = "/users/{id}")
	void deleteUser(@PathVariable int id) {
		service.deleteStockExchange(id);
	}


}
