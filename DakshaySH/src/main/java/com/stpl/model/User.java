package com.stpl.model;

import java.io.Serializable;

public class User  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String pwd;
	private String email;
	private String mobile;
	public User() {
		
	}
	
	public User(String id, String name, String pwd, String email,String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.email = email;
		this.mobile=mobile;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
}
