package com.socgen.arjun.training.Product.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.socgen.arjun.training.Product.Entity.Ipo;
import com.socgen.arjun.training.Product.Repository.IpoRepository;


@Service
public class IpoService {
	
	@Autowired
	IpoRepository repo;
	
	
	public Iterable<Ipo> getAllData() {
		return repo.findAll();
	}


	public void addIpo(Ipo user) {
		repo.save(user);	
	}


	public void updateIpo(Ipo user, int id) {
		repo.save(user);	
	}


	public void deleteIpo(int id) {
		repo.deleteById(id);	
	}
	
	



}
