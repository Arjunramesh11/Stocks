package com.socgen.arjun.training.Product.Entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name ="ipo")
public class Ipo {
	
	@Id
	@GeneratedValue
	Integer ipoId;
	
	
	//@Column(name="stockExchange")
	Integer stockExchange;
	//@Column(name="pricePerShare")
	Integer pricePerShare;
	//@Column(name="totalNumberOfShares")
	Integer totalNumberOfShares;
	
	//@Column(name="companyName")
    String companyName;
	//@Column(name="openDateTime")
    String openDateTime;
	//@Column(name="remarks")
    String remarks;
	public Integer getIpoId() {
		return ipoId;
	}
	public void setIpoId(Integer ipoId) {
		this.ipoId = ipoId;
	}
	public Integer getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(Integer stockExchange) {
		this.stockExchange = stockExchange;
	}
	public Integer getPricePerShare() {
		return pricePerShare;
	}
	public void setPricePerShare(Integer pricePerShare) {
		this.pricePerShare = pricePerShare;
	}
	public Integer getTotalNumberOfShares() {
		return totalNumberOfShares;
	}
	public void setTotalNumberOfShares(Integer totalNumberOfShares) {
		this.totalNumberOfShares = totalNumberOfShares;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getOpenDateTime() {
		return openDateTime;
	}
	public void setOpenDateTime(String openDateTime) {
		this.openDateTime = openDateTime;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
    

    

}
