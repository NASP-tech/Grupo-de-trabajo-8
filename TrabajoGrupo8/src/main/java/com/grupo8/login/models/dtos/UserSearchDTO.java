package com.grupo8.login.models.dtos;

public class UserSearchDTO {
	private String codeUser;
	private String password;
	
	public UserSearchDTO(String codeUser, String password) {
		super();
		this.codeUser = codeUser;
		this.password = password;
	}

	public String getCodeUser() {
		return codeUser;
	}

	public void setCodeUser(String codeUser) {
		this.codeUser = codeUser;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}  
	
	

}
