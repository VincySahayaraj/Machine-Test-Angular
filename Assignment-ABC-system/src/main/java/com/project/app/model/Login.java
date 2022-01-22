package com.project.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Login")
public class Login {

	// define fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int lId;
	private String userName, userType, password;

	// default constructor
	public Login() {
		super();

	}

	// Parametrized constructor
	public Login(int lId, String userName, String userType, String password) {
		super();
		this.lId = lId;
		this.userName = userName;
		this.userType = userType;
		this.password = password;
		// this.user = user;
	}

	// getters and setters
	public int getlId() {
		return lId;
	}

	public void setlId(int lId) {
		this.lId = lId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Login [lId=" + lId + ", userName=" + userName + ", userType=" + userType + ", password=" + password
				+ "]";
	}

}
