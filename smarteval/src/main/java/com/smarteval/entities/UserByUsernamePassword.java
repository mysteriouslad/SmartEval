package com.smarteval.entities;

import java.util.Objects;

public class UserByUsernamePassword {
	private String username;
	private String password;
	
	public UserByUsernamePassword() {
		super();
	}
	public UserByUsernamePassword(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserByUsernamePassword [username=" + username + ", password=" + password + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(password, username);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserByUsernamePassword other = (UserByUsernamePassword) obj;
		return Objects.equals(password, other.password) && Objects.equals(username, other.username);
	}
	
}