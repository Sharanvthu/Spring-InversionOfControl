package com.jspider.pkg;

import org.springframework.beans.factory.annotation.Autowired;

public class User {
	
	private String userName;
	private int userId;
	@Autowired
	private Address homeAddress;
	@Autowired
	private Address workAddress;
	
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userId=" + userId + ", homeAddress=" + homeAddress + ", workAddress="
				+ workAddress + "]";
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address getWorkAddress() {
		return workAddress;
	}
	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}
	

 
}
