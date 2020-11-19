package com.socgen.arjun.training.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company {
	
	@Id
	Integer id;
	
	Integer Turnover,Stock_code;
    String company_name,CEO,Board_of_Directors,Listed_in_Stock_Exchanges,Sector;
	
    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getTurnover() {
		return Turnover;
	}
	public void setTurnover(Integer turnover) {
		Turnover = turnover;
	}
	public Integer getStock_code() {
		return Stock_code;
	}
	public void setStock_code(Integer stock_code) {
		Stock_code = stock_code;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getCEO() {
		return CEO;
	}
	public void setCEO(String cEO) {
		CEO = cEO;
	}
	public String getBoard_of_Directors() {
		return Board_of_Directors;
	}
	public void setBoard_of_Directors(String board_of_Directors) {
		Board_of_Directors = board_of_Directors;
	}
	public String getListed_in_Stock_Exchanges() {
		return Listed_in_Stock_Exchanges;
	}
	public void setListed_in_Stock_Exchanges(String listed_in_Stock_Exchanges) {
		Listed_in_Stock_Exchanges = listed_in_Stock_Exchanges;
	}
	public String getSector() {
		return Sector;
	}
	public void setSector(String sector) {
		Sector = sector;
	}

}
