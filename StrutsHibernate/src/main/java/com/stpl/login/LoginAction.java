package com.stpl.login;

import com.stpl.login.service.LoginService;
//import javax.servlet.*;

import java.util.ArrayList;

//import org.apache.struts2.util.ServletContextAware;

import java.util.List;

import com.opensymphony.xwork2.*;
import com.stpl.login.model.User;


public class LoginAction extends ActionSupport implements ModelDriven {
	private static final long serialVersionUID = 1L;
	
	private User user = new User();
	List<User> userList = new ArrayList<User>();
	
	
	public User getModel() {
		return user;
	}
	public List<User> getUserList() {
		return userList;
	}
	//
	public String listCustomer() {
	System.out.println(user.getId() + " and " + user.getPwd());
	LoginService loginService=new LoginService();
	List<User> l = loginService.findById(user.getId(), user.getPwd());
	if(l.size()==0) return "error";
	else 
		return "success";
	}
	
	
	
	
	
	
}

