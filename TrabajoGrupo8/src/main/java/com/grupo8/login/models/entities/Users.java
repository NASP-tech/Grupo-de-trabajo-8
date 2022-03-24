package com.grupo8.login.models.entities;

public class Users {
	
	private String userCode;
	private String name;
	private String lastname;
	private String dateCont;
	private String status;
	public Users(String userCode, String name, String lastname, String dateCont, String status) {
		super();
		this.userCode = userCode;
		this.name = name;
		this.lastname = lastname;
		this.dateCont = dateCont;
		this.status = status;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDateCont() {
		return dateCont;
	}
	public void setDateCont(String dateCont) {
		this.dateCont = dateCont;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
