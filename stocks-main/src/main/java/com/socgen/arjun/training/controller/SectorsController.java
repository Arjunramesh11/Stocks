package com.socgen.arjun.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.socgen.arjun.training.entities.Sectors;
import com.socgen.arjun.training.services.SectorsService;

@RestController
public class SectorsController {
	
	
	@Autowired
	SectorsService service;
	
	@RequestMapping("/Sectors")
	Iterable<Sectors> getAllData() {
		return service.getAllData();
	}
	
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/sect")
	void addUser(@RequestBody Sectors user) {
		service.addSect(user);	}
	

	@RequestMapping(method = RequestMethod.PUT, value = "/sect/{id}")
	void updateUser(@RequestBody Sectors user, @PathVariable int id) {
		service.updateSect(user, id);
	}
	

	@RequestMapping(method = RequestMethod.DELETE, value = "/sect/{id}")
	void deleteUser(@PathVariable int id) {
		service.deleteSect(id);
	}
}
