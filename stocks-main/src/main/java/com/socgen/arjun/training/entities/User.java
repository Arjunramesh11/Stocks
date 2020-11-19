package com.socgen.arjun.training.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer UId;
	
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getConfirmed() {
		return Confirmed;
	}

	public void setConfirmed(String confirmed) {
		Confirmed = confirmed;
	}

	String Username,Password,UserType,mail,Confirmed;
	Integer Mobile;
	
	
	
	public String getUserType() {
		return UserType;
	}

	public void setUserType(String UserType) {
		this.UserType = UserType;
	}


	public Integer getMobile() {
		return Mobile;
	}

	public void setMobile(Integer mobile) {
		Mobile = mobile;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public Integer getId() {
		return UId;
	}

	public void setId(Integer UId) {
		this.UId = UId;
	}



	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}



	
}
