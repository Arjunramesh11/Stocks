package com.socgen.arjun.training.Product.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.socgen.arjun.training.Product.Entity.Ipo;
import com.socgen.arjun.training.Product.Service.IpoService;


@RestController
public class IpoController {
	
	@Autowired
	IpoService service;
	
	@RequestMapping("/ipos")
	Iterable<Ipo> getAllData() {
		return service.getAllData();
	}
	
	
	
	

	@RequestMapping(method = RequestMethod.POST, value = "/prod")
	void addUser(@RequestBody Ipo user) {
		service.addIpo(user);	}
	

	@RequestMapping(method = RequestMethod.PUT, value = "/prod/{id}")
	void updateUser(@RequestBody Ipo user, @PathVariable int id) {
		service.updateIpo(user, id);
	}
	

	@RequestMapping(method = RequestMethod.DELETE, value = "/prod/{id}")
	void deleteUser(@PathVariable int id) {
		service.deleteIpo(id);
	}

}
