package com.socgen.arjun.training.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.socgen.arjun.training.entities.StockPrice;
import com.socgen.arjun.training.repositories.StockPriceRepository;

import java.util.Optional;

@Service
public class StockPriceService {
	
	@Autowired
	StockPriceRepository repo;
	
	@Autowired
	RestTemplate theRestTemplate;
	
	public Iterable<StockPrice> getAllData() {
	return repo.findAll();
	}
	


	public Optional<StockPrice> getUserBysid(int id) {
		return repo.findById(id);
	}



	public List<Object> getExchangeCatalog() {
//		The other microservice URL to hit
	//	String urlToHit = "http://localhost:8084/stockExchange";
		
		
		String urlToHit = "http://stock-exchange-service/stockExchange";
		
//		Get a reference to the RestTemplate
//		RestTemplate theRestTemplate =  new RestTemplate(); //Not Recommended this way
		
		
		
//		Hit the other microservice
//		return theRestTemplate.getForObject(urlToHit, String.class);
		
//		OR this way:

		return Arrays.asList(theRestTemplate.getForObject(urlToHit, Object[].class));
	
//		return Arrays.asList(responseFromOtherService);
	}



	public void addStockPrice(StockPrice user) {
		// TODO Auto-generated method stub
		repo.save(user);
		
	}



	public void updateStockPrice(StockPrice user, int id) {
		// TODO Auto-generated method stub
		repo.save(user);
		
	}



	public void deleteStockPrice(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

	

}
