package com.socgen.arjun.training.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class  StockPrice{
	@Id
	Integer StockExchange;
	
	Integer CompanyCode,CurrentPrice;
	String Stock_Date,Stock_Time;
	
	public Integer getCompanyCode() {
		return CompanyCode;
	}

	public void setCompanyCode(Integer companyCode) {
		CompanyCode = companyCode;
	}
	public Integer getCurrentPrice() {
		return CurrentPrice;
	}
	public void setCurrentPrice(Integer currentPrice) {
		CurrentPrice = currentPrice;
	}
	public Integer getStockExchange() {
		return StockExchange;
	}
	public void setStockExchange(Integer stockExchange) {
		StockExchange = stockExchange;
	}
	public String getStock_Date() {
		return Stock_Date;
	}
	public void setStock_Date(String stock_Date) {
		Stock_Date = stock_Date;
	}
	public String getStock_Time() {
		return Stock_Time;
	}
	public void setStock_Time(String stock_Time) {
		Stock_Time = stock_Time;
	}

	
	
}