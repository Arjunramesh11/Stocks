package com.socgen.arjun.training.exchange.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.socgen.arjun.training.exchange.Entity.StockExchange;
import com.socgen.arjun.training.exchange.Repository.StockExchangeRepository;

@Service
public class StockExchangeService {
	
	@Autowired
	StockExchangeRepository repo;
	
	
	public Iterable<StockExchange> getAllData() {
		return repo.findAll();
	}


	public void deleteStockExchange(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);	
	}


	public void addStockExchange(StockExchange user) {
		// TODO Auto-generated method stub
		repo.save(user);
	}


	public void updateStockExchange(StockExchange user, int id) {
		// TODO Auto-generated method stub
		repo.save(user);
	}

}
