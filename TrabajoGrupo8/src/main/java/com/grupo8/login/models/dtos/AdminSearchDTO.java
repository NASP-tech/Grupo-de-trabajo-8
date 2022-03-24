package com.grupo8.login.models.dtos;

public class AdminSearchDTO {
	private String codeUserAdmin;
	private String password;
	public AdminSearchDTO(String codeUserAdmin, String password) {
		super();
		this.codeUserAdmin = codeUserAdmin;
		this.password = password;
	}
	public String getCodeUserAdmin() {
		return codeUserAdmin;
	}
	public void setCodeUserAdmin(String codeUserAdmin) {
		this.codeUserAdmin = codeUserAdmin;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
