package com.stpl.login.service;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;
import org.apache.struts2.util.ServletContextAware;
import org.hibernate.SessionFactory;
import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.stpl.login.dao.UserDao;
import com.stpl.login.dao.impl.UserDaoImpl;
import com.stpl.login.model.User;

public class UserAction extends ActionSupport implements ServletRequestAware,ServletResponseAware {
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	private static final long serialVersionUID = 1L;

	final static Logger LOG = Logger.getLogger(UserAction.class);

	private ServletContext ctx;
	public void setServletContext(ServletContext ctx) {
		this.ctx=ctx;
	}
	
	public String loginExecute() throws Exception{
		SessionFactory sf = (SessionFactory) ctx.getAttribute("SessionFactory");
		UserDao userDao = new UserDaoImpl(sf);
		//System.out.println("sdfjk"+user.getId() + "dsfsdf"+user.getPwd());
		List<User> us = userDao.findById(user.getId(), user.getPwd());
		LOG.info("---entered in execute----");
		if(us.size()==0) return ERROR;
		else return SUCCESS;
	}
	public String userRegistrationMenu() {
		return SUCCESS;
	}
	public String userRegistration() throws Exception{
		SessionFactory sf = (SessionFactory) ctx.getAttribute("SessionFactory");
		UserDao userDao = new UserDaoImpl(sf);
		System.out.println("ID="+user.getId() + "NAME="+user.getName() + "PWD="+user.getPwd()+ "email="+user.getEmail());
		String str = userDao.persist(user);
		return str;
	}
	private User user = new User();
	
	public User getModel() {
		return user;
	}

	public void setServletResponse(HttpServletResponse request) {
		this.response=response;
	}

	public void setServletRequest(HttpServletRequest response) {
		this.request=request;
	}
	public HttpServletRequest getRequest() {
		return request;
	}

	public HttpServletResponse getResponse() {
		return response;
	}

}
