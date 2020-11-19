package com.socgen.arjun.training.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.socgen.arjun.training.entities.StockPrice;
import com.socgen.arjun.training.services.StockPriceService;

@RestController
public class StockPriceController {
	
	@Autowired
	StockPriceService service;
	
	@RequestMapping("/StockPrices")
	Iterable<StockPrice> getAllData() {
		return service.getAllData();
	}
	
	
	@RequestMapping("/StockPrices/{id}")
	Optional<StockPrice> getUserById(@PathVariable int id) {
		return service.getUserBysid(id);
	}
	
	@RequestMapping("/StockPrices/exchanges")
	List<Object> getExchangeCatalog(){
		
		return service.getExchangeCatalog();
		
	}
	
	
	
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/sect")
	void addUser(@RequestBody StockPrice user) {
		service.addStockPrice(user);	}
	

	@RequestMapping(method = RequestMethod.PUT, value = "/sect/{id}")
	void updateUser(@RequestBody StockPrice user, @PathVariable int id) {
		service.updateStockPrice(user, id);
	}
	

	@RequestMapping(method = RequestMethod.DELETE, value = "/sect/{id}")
	void deleteUser(@PathVariable int id) {
		service.deleteStockPrice(id);
	}
	
}
