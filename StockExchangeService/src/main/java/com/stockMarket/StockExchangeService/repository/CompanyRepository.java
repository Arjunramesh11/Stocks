package com.stockMarket.StockExchangeService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.stockMarket.StockExchangeService.model.Company;
import com.stockMarket.StockExchangeService.model.StockExchange;


@Repository
@Transactional
public interface CompanyRepository extends JpaRepository<Company, Long>{

	List<Company> findAllByStockExchanges(StockExchange stockExchange);

	Company findByCompanyCode(String companyCode);

}
