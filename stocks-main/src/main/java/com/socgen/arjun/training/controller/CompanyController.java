package com.socgen.arjun.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.socgen.arjun.training.entities.Company;
import com.socgen.arjun.training.services.CompanyService;

@RestController
@RequestMapping("/companies")
public class CompanyController {
	
	@Autowired
	CompanyService service;
	
//	Fetch all data
	@RequestMapping("/company")
	Iterable<Company> getAllData() {
		return service.getAllData();
	}
	
	
	@RequestMapping("/ipos")
	List<Object> getBookCatalog(){
		
		return service.getCompanyCatalog();
		
	}
	
	
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/comp")
	void addUser(@RequestBody Company user) {
		service.addIpo(user);	}
	

	@RequestMapping(method = RequestMethod.PUT, value = "/comp/{id}")
	void updateUser(@RequestBody Company user, @PathVariable int id) {
		service.updateIpo(user, id);
	}
	

	@RequestMapping(method = RequestMethod.DELETE, value = "/comp/{id}")
	void deleteUser(@PathVariable int id) {
		service.deleteIpo(id);
	}

}
