package com.example.demo.DTO;

public class LoginDto {
	
	 private String usernameOrEmail;
	 private String password;
	@Override
	public String toString() {
		return "LoginDto [usernameOrEmail=" + usernameOrEmail + ", password=" + password + "]";
	}
	public String getUsernameOrEmail() {
		return usernameOrEmail;
	}
	public void setUsernameOrEmail(String usernameOrEmail) {
		this.usernameOrEmail = usernameOrEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	 
	 
	 

}
