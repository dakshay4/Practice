package com.stpl.login.dao.impl;

import java.net.URL;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.stpl.login.dao.LoginDaoInterface;
import com.stpl.login.model.User;
import com.stpl.listener.HibernateListener;


public class LoginDao implements LoginDaoInterface<User,String,String>{
	private Session currentSession;
	private Transaction currentTransaction;
	
	public LoginDao(){
		
	}
/*	private ServletContext ctx;
	@Override
	public void setServletContext(ServletContext sc) {
		this.ctx = sc;
	}*/
	
	public static SessionFactory getSessionFactory() {
		SessionFactory sessionFactory = 
		         (SessionFactory) ServletActionContext.getServletContext()
	                     .getAttribute(HibernateListener.KEY_NAME);
		return sessionFactory;
	}
	public Session openCurrentSession() {
		currentSession = getSessionFactory().openSession();
		return currentSession;
	}
	
	public Session openCurrentSessionWithTransaction() {
		currentSession=getSessionFactory().openSession();
		currentTransaction=currentSession.beginTransaction();
		return currentSession;
	}
	
	public void closeCurrentSession() {
		currentSession.close();
	}
	
	public void closeCurrentSessionWithTransaction() {
		currentTransaction.commit();
		currentSession.close();
	}
	
//-------------Getter and Setter-----------------------------------------
	public Session getCurrentSession() {
		return currentSession;
	}
	
	public void setCurrentSession(Session currentSession) {
		this.currentSession = currentSession;
	}
	
	public Transaction getCurrentTransaction() {
		return currentTransaction;
	}
	
	public void setCurrentTransaction(Transaction currentTransaction) {
		this.currentTransaction = currentTransaction;
	}
	
//--------------------Functions ----------------------
	
	public List<User> findById(String Id, String Pass){
		@SuppressWarnings("unchecked")
		List<User> login= getCurrentSession().createQuery("from Login l where l.id:=lid and l.pwd:=pwd").
				setParameter("lid", Id).setParameter("pwd", Pass).list();
		return login;
	}
	
	
/*	public void contextDestroyed(ServletContextEvent sce) {
		SessionFactory sf = (SessionFactory) sce.getServletContext().getAttribute("SessionFactory");
		sf.close();
	}

	
	public void contextInitialized(ServletContextEvent sce) {
		URL url = LoginDao.class.getResource("/hibernate.cfg.xml");
		Configuration config = new Configuration();
		config.configure(url);
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
						.applySettings(config.getProperties()).build();
		SessionFactory sf = config.buildSessionFactory(serviceRegistry);
		sce.getServletContext().setAttribute("SessionFactory", sf);
	}
*/
}
