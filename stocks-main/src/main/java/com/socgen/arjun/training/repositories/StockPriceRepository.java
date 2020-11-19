package com.socgen.arjun.training.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.socgen.arjun.training.entities.StockPrice;

@Repository
public interface StockPriceRepository extends CrudRepository<StockPrice,Integer>  {
	
	//Optional<StockPrice> findByCompanyCode(Integer CompanyCode);
	
	@Query(nativeQuery=true,value="select * from StockPrice")List<StockPrice> searchStock();

	//@Query(nativeQuery=true,value="select * from StockPrice where CompanyCode=companyCode")Optional<StockPrice> findByCompanyCode(Integer companyCode);


}
