package com.socgen.arjun.training.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.socgen.arjun.training.entities.User;
import com.socgen.arjun.training.services.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService service;

//	Fetch all data
	@RequestMapping("/users")
	Iterable<User> getAllData() {
		return service.getAllData();
	}
	
//	Fetch a User by id
	@RequestMapping("/users/{id}")
	Optional<User> getUserById(@PathVariable int id) {
		return service.getUserById(id);
	}
	
//	Custom mapping methods for searching users by name, department
//	@RequestMapping("/users/name/{name}")
//	List<User> getUserByName(@PathVariable String name){
//		return service.getUserByName(name);
//	}
	
//	@RequestMapping("/users/department/{department}")
//	List<User> getUserByDepartment(@PathVariable String department){
//		return service.getUserByDepartment(department);
//	}
	
	
	
//	For adding a new User
	@RequestMapping(method = RequestMethod.POST, value = "/users")
	void addUser(@RequestBody User user) {
		service.addUser(user);
	}
	
//	For updating a User
	@RequestMapping(method = RequestMethod.PUT, value = "/users/{id}")
	void updateUser(@RequestBody User user, @PathVariable int id) {
		service.updateUser(user, id);
	}
	
//	For deleting a User
	@RequestMapping(method = RequestMethod.DELETE, value = "/users/{id}")
	void deleteUser(@PathVariable int id) {
		service.deleteUser(id);
	}
	
	
	
}
