package com.stpl.service;

import javax.servlet.ServletContext;
import java.util.List;
import org.apache.struts2.util.ServletContextAware;
import org.hibernate.SessionFactory;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.stpl.dao.UserDao;
import com.stpl.dao.impl.UserDaoImpl;
import com.stpl.model.User;

public class UserAction implements Action, ModelDriven<User>, ServletContextAware {
	
	private ServletContext ctx;
	public void setServletContext(ServletContext ctx) {
		this.ctx=ctx;
	}
	
	
	public String execute() throws Exception{
		SessionFactory sf = (SessionFactory) ctx.getAttribute("SessionFactory");
		UserDao userDao = new UserDaoImpl(sf);
		List<User> us = userDao.findById(user.getId(), user.getPwd());
		if(us.size()==0) return ERROR;
		else return SUCCESS;
	}
	
	
	
	
	private User user = new User();
	
	public User getModel() {
		return user;
	}
}
