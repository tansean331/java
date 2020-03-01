package com.tjh.entity;

import java.util.Date;

public class User {
	public User() {
		
	}

	public User(Integer id, String userName, String passWord) {
		super();
		this.id = id;
		this.userName = userName;
		this.passWord = passWord;
	}
	
	public User(Integer id, String userName, String passWord, Date regDate) {
		super();
		this.id = id;
		this.userName = userName;
		this.passWord = passWord;
		this.regDate = regDate;
	}
	
	public void print() {
		System.out.println("User [id=" + id + ", userName=" + userName + ", passWord=" + passWord + ", regDate=" + regDate + "]");
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassWord() {
		return passWord;
	}
	
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	public Date getRegDate() {
		return regDate;
	}
	
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	
	
	private Integer id;
	
	private String userName;
	
	private String passWord;
	
	private Date regDate;
}
