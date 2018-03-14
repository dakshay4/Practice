package com.stpl.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.stpl.dao.UserDao;
import com.stpl.model.User;

public class UserDaoImpl implements UserDao<User, String, String> {
	
	private static final String SUCCESS = "Success";
	private SessionFactory sf;
	private Session currentSession;
	private Transaction currentTransaction;
	public UserDaoImpl(SessionFactory sf) {
		this.sf = sf;
	}
	
	public SessionFactory getSessionFactory() {
		return sf;
	}
	public Session openCurrentSession() {
		currentSession = getSessionFactory().openSession();
		return currentSession;
	}
	
	public void closeCurrentSession() {
		currentSession.close();
	}
	
	public void closeCurrentSessionWithTransaction() {
		currentTransaction.commit();
		currentSession.close();
	}
	
	public Transaction openCurrentSessionWithTransaction() {
		currentSession=getSessionFactory().openSession();
		currentTransaction=currentSession.beginTransaction();
		return currentTransaction;
	}
	
	public Session getCurrentSession() {
		return this.currentSession;
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
	

	public List<User> findById(String Id, String Pwd){
		System.out.println(getSessionFactory().openSession());
		@SuppressWarnings("unchecked")
		List<User> user = getSessionFactory().openSession().createQuery("from User s where s.id=:id and s.pwd=:pwd")
				.setParameter("id", Id).setParameter("pwd", Pwd).list();
/*		for(User l: user) {
			System.out.println("sdf"+l.getEmail()+l.getId());
		}
*/		return user;
	}
	
	public String persist(User entity) {
		Transaction tx=null;
		try {
			/*Session session=getSessionFactory().openSession();
			tx=session.beginTransaction();
			session.persist(entity);
			tx.commit();*/
			openCurrentSessionWithTransaction();
			getCurrentSession().persist(entity);
			closeCurrentSessionWithTransaction();
			
		}catch (Exception e) {
			if(openCurrentSessionWithTransaction()!=null)
				openCurrentSessionWithTransaction().rollback();
		e.printStackTrace();
		}finally {
			
		}

		
		
		return "success";
	}
}
