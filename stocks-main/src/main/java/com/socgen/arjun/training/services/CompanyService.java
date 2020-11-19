package com.socgen.arjun.training.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.socgen.arjun.training.entities.Company;
import com.socgen.arjun.training.repositories.CompanyRepository;

@Service
public class CompanyService {
	
	@Autowired
	CompanyRepository repo;
	
	
	@Autowired
	RestTemplate theRestTemplate;
	
	public Iterable<Company> getAllData() {
		return repo.findAll();
	}
	
	
	
	
	public List<Object> getCompanyCatalog() {
//		The other microservice URL to hit
	//	String urlToHit = "http://localhost:8083/ipos";
		

		
		String urlToHit = "http://ipo-information-service/ipos";
		
//		Get a reference to the RestTemplate
//		RestTemplate theRestTemplate =  new RestTemplate(); //Not Recommended this way
		
		
		
//		Hit the other microservice
//		return theRestTemplate.getForObject(urlToHit, String.class);
		
//		OR this way:

		return Arrays.asList(theRestTemplate.getForObject(urlToHit, Object[].class));
	
//		return Arrays.asList(responseFromOtherService);
	}




	public void addIpo(Company user) {
		// TODO Auto-generated method stub
		repo.save(user);
		
	}




	public void updateIpo(Company user, int id) {
		// TODO Auto-generated method stub
		repo.save(user);
		
	}




	public void deleteIpo(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}
