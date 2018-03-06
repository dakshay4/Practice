package com.stpl.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.stpl.dao.UserDao;
import com.stpl.model.User;

public class UserDaoImpl implements UserDao {
	
	private SessionFactory sf;
	private Session session;
	private Transaction transaction;
	public UserDaoImpl(SessionFactory sf) {
		this.sf = sf;
	}
	
	public SessionFactory getSessionFactory() {
		return sf;
	}
	public Session openSession() {
		session=getSessionFactory().openSession();
		return session;
	}
	
	public Transaction openSessionWithTransaction() {
		transaction=getSessionFactory().openSession().beginTransaction();
		return transaction;
	}
	
	public List<User> findById(String Id, String Pwd){
		System.out.println(openSession());
		@SuppressWarnings("unchecked")
		List<User> user = openSession().createQuery("from User s where s.id=:id and s.pwd=:pwd")
				.setParameter("id", Id).setParameter("pwd", Pwd).list();
		for(User l: user) {
			System.out.println("sdf"+l.getEmail()+l.getId());
		}
		return user;
	}
}
