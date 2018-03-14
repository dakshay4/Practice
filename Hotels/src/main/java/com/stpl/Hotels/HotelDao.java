package com.stpl.Hotels;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HotelDao implements LoginDaoInterface<T>{

	private Session currentSession;
	private Transaction currentTransaction;
	
	public HotelDao() {
		
	}
	
	public static SessionFactory getSessionFactory() {
		Configuration configuration =new Configuration().configure("hibernate.cfg.xml");
		StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory sessionFactory=configuration.buildSessionFactory(builder.build());
		return sessionFactory;
		
	}
	
	public Session openCurrentSession() {
		currentSession=getSessionFactory().openSession();
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
//----------------------------------------------------------
	public List<Hotel> findRoomAvailibility(String c_in,String c_out) {
		@SuppressWarnings("unchecked")
		List<Hotel> l=getCurrentSession().createQuery("from Hotel h where h.c_in>=:c_in and h.c_out<=:c_out").setParameter(0, c_in).
				setParameter(1, c_out).list();
		return l;
	}
	
}