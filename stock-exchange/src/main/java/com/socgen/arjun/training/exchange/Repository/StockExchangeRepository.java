package com.socgen.arjun.training.exchange.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.socgen.arjun.training.exchange.Entity.StockExchange;


@Repository
public interface StockExchangeRepository extends CrudRepository<StockExchange, Integer>{
	
	
	@Query(nativeQuery=true,value="select * from stock_exchange")List<StockExchange> searchIpos();
	

}
