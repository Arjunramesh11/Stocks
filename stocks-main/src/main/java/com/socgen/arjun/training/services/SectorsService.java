package com.socgen.arjun.training.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.socgen.arjun.training.entities.Sectors;
import com.socgen.arjun.training.repositories.SectorsRepository;

@Service
public class SectorsService {
	
	@Autowired
	SectorsRepository repo;
	
	public Iterable<Sectors> getAllData() {
		return repo.findAll();
	}

	public void addSect(Sectors user) {
		// TODO Auto-generated method stub
		repo.save(user);
		
	}

	public void updateSect(Sectors user, int id) {
		// TODO Auto-generated method stub
		repo.save(user);
	}

	public void deleteSect(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

}
