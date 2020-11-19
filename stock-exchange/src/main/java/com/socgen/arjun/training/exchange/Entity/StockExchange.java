package com.socgen.arjun.training.exchange.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class StockExchange {
	
	@Id
	@GeneratedValue
	Integer id;
	Integer stock_exchange;
	String brief,address,remarks;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getStock_exchange() {
		return stock_exchange;
	}
	public void setStock_exchange(Integer stock_exchange) {
		this.stock_exchange = stock_exchange;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

    

}
