package com.stpl.login;

import com.stpl.login.service.LoginService;
//import javax.servlet.*;

//import org.apache.struts2.util.ServletContextAware;

import java.util.List;

import com.opensymphony.xwork2.*;
import com.stpl.login.model.Login;


public class LoginAction extends ActionSupport implements Action {
	private static final long serialVersionUID = 1L;
	
	private Login login = new Login();
	public Login getModel() {
		
		return login;
		
	}
	
	public String execute() {
	System.out.println(login.getId() + " and " + login.getPwd());
	LoginService hotelService=new LoginService();
	List<Login> l = hotelService.findById(login.getId(), login.getPwd());
	if(l.size()==0) return "error";
	else return "success";
	}
	
	
	
	
	
	
}

