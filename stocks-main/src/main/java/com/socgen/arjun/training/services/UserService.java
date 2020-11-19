package com.socgen.arjun.training.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.socgen.arjun.training.entities.User;
import com.socgen.arjun.training.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repo;

	public Iterable<User> getAllData() {
		return repo.findAll();
	}

	public Optional<User> getUserById(int id) {
		return repo.findById(id);
	}

	
//	  List<User> getUserByName(String name){
//		   return repo.findByName(name); 
//	 }
	
//	List<User> getUserByDepartment(String department) {
//		return repo.findByDepartment(department);
//	}

	public void addUser(User user) {
		repo.save(user);
	}

	public void updateUser(User user, int id) {
		repo.save(user);
	}

	public void deleteUser(int id) {
		repo.deleteById(id);
	}

}
