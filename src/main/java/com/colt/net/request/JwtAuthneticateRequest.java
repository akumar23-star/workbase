package com.colt.net.request;

import javax.persistence.Column;
import javax.persistence.Id;

public class JwtAuthneticateRequest {
	
	//@Id
	private String userId;
	
	//@Column(name="name")
	private String userName;
	
	
	//@Column(name="password")
	private String password;

	
	JwtAuthneticateRequest(String userName, String password){
		this.setUserName(userName);
		this.setPassword(password);
	}

	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
