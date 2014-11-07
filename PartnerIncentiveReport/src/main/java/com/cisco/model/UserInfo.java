package com.cisco.model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Repository;
@Entity
@Table(name="user_t")
public class UserInfo implements Serializable {

	private static final long serialVersionUID = 3952189513312630860L;
	
	private int userId;
	private String userName;
	private String password;
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	@Column(name="username")
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	@Column(name="password")
	public void setPassword(String password) {
		this.password = password;
	}
}

